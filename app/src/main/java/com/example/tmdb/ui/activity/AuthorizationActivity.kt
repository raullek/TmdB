package com.example.tmdb.ui.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tmdb.R
import com.example.tmdb.Utills.replaceFragment
import com.example.tmdb.ui.view.signIn.SignInFragment
import dagger.android.AndroidInjection


class AuthorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authorization_layout)
        replaceFragment(SignInFragment(),R.id.container)
    }


}
