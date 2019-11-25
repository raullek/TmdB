package com.example.tmdb.data.remote.network

import retrofit2.Retrofit
import javax.inject.Inject

class HttpClientImpl @Inject constructor(var retrofit: Retrofit) : HttpClient {


    override fun getHttpClient(): Retrofit {
        return retrofit
    }


}