package com.example.tmdb.data.remote.network

import com.google.firebase.auth.FirebaseAuth
import io.reactivex.Completable
import javax.inject.Inject

class FireBaseSource @Inject constructor(val firebaseAuth: FirebaseAuth) {


    fun login (email : String, password :String)= Completable.create { emitter ->
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener() {
            if (!emitter.isDisposed){
                if (it.isSuccessful)
                    emitter.onComplete()
                else
                    emitter.onError(it.exception)


            }
        }
    }

    fun register(email: String, password: String) = Completable.create { emitter ->
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            if (!emitter.isDisposed) {
                if (it.isSuccessful)
                    emitter.onComplete()
                else
                    emitter.onError(it.exception!!)
            }
        }
    }

    fun logout()=firebaseAuth.signOut()

    fun currentUser() = firebaseAuth.currentUser

}