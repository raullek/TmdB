package com.example.tmdb.di.module

import com.example.tmdb.ui.activity.AuthorizationActivity
import com.example.tmdb.ui.activity.SplashScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun authorizationActivity(): AuthorizationActivity

    @ContributesAndroidInjector
    abstract fun splashScreenActivity(): SplashScreenActivity




}