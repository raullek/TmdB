package com.example.tmdb.di.component

import android.app.Application
import com.example.tmdb.App
import com.example.tmdb.di.module.ActivityModule
import com.example.tmdb.di.module.AppModule
import com.example.tmdb.di.module.FragmentModule
import com.example.tmdb.di.module.NetworkModule
import com.example.tmdb.ui.activity.AuthorizationActivity
import com.example.tmdb.ui.view.signIn.SignInFragment
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton


@Singleton
@Component(modules = [(AndroidInjectionModule::class),
    (AppModule::class),
    (NetworkModule::class),
    (ActivityModule::class),
    (FragmentModule::class)])
interface ApplicationComponent :AndroidInjector<App> {

   // fun inject (fragment : SignInFragment)

    interface Builder{
        @BindsInstance
        fun application(application: Application):Builder

        fun build(): ApplicationComponent
    }



}