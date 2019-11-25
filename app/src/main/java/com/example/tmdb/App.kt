package com.example.tmdb

import android.app.Activity
import android.app.Application
import com.example.tmdb.di.component.DaggerApplicationComponent
import timber.log.Timber
import javax.inject.Inject

import dagger.android.*


class App : Application(), HasAndroidInjector {

    @Inject lateinit var androidInjector : DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> =androidInjector;



    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.create()
            .inject(this)

        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }


}