package com.example.utspemrogramanmobile

class Repository ( private val apiService: ApiService) {
    fun getDatas() = apiService.fetchTripleTriad()
}