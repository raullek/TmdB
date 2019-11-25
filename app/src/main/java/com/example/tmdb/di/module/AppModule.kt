package com.example.tmdb.di.module

import android.app.Application
import androidx.room.Room
import com.example.tmdb.Utills.Constants
import com.example.tmdb.data.local.AppDatabase
import com.example.tmdb.data.remote.network.HttpClient
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule( val app: Application) {

    @Provides
    @Singleton
    fun provideApp(): Application = app

    @Provides
    @Singleton
    fun provideDatabase(app: Application): AppDatabase = Room.databaseBuilder(
        app,
        AppDatabase::class.java, Constants.DN_NAME
    )
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideHttpClient(httpClient: HttpClient): HttpClient {
        return httpClient;
    }

    @Provides
    @Singleton
    fun provideFireBaseAuth(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }


}