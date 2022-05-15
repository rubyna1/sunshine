package com.example.letsdoit.network

import com.example.letsdoit.entity.RandomUser
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
@GET("api/")
fun getRandomUser(): Observable<RandomUser>
}