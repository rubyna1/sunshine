package com.example.letsdoit.ui.getUser

import android.content.SharedPreferences
import com.example.letsdoit.base.BaseRepository
import com.example.letsdoit.network.ApiService
import javax.inject.Inject

class GetUserRepository @Inject constructor(private val apiService: ApiService, private val sharedPreferences: SharedPreferences):BaseRepository(sharedPreferences) {
    fun getRandomUser() = apiService.getRandomUser()
}