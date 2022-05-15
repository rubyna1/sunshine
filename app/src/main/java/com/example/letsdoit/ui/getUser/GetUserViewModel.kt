package com.example.letsdoit.ui.getUser

import android.app.Application
import javax.inject.Inject

class GetUserViewModel @Inject constructor(val app:Application,val getUserRepository: GetUserRepository){
    fun getRandomUser(){
        getUserRepository.getRandomUser()
    }
}