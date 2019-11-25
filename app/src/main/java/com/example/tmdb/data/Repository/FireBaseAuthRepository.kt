package com.example.tmdb.data.Repository

import com.example.tmdb.data.remote.network.FireBaseSource
import javax.inject.Inject

class FireBaseAuthRepository @Inject constructor(private val fireBaseSource: FireBaseSource) {
}