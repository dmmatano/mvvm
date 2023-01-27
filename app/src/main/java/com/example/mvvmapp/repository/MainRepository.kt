package com.example.mvvmapp.repository

import com.example.mvvmapp.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getAllLives() = retrofitService.getAllLives()

}