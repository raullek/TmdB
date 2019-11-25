package com.example.tmdb.ui.view.signIn

import androidx.lifecycle.ViewModel
import com.example.tmdb.data.Repository.FireBaseAuthRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SignInViewModel @Inject constructor(private val fireBaseAuthRepository: FireBaseAuthRepository):ViewModel() {




    private val disposable  = CompositeDisposable()


    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }

}