package com.example.tmdb.data.remote.network

import retrofit2.Retrofit

interface HttpClient {

    fun getHttpClient():Retrofit;
}