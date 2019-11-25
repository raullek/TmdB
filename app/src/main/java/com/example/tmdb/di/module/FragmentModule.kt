package com.example.tmdb.di.module

import com.example.tmdb.ui.view.signIn.SignInFragment
import com.example.tmdb.ui.view.signUp.SignUpFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun signUpFragment(): SignUpFragment

    @ContributesAndroidInjector
    abstract fun signInFragment(): SignInFragment
}