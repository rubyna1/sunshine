package com.example.letsdoit.ui.getUser

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.letsdoit.entity.RandomUser
import com.example.letsdoit.utils.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class GetUserViewModel @Inject constructor(
    val app: Application,
    private val getUserRepository: GetUserRepository,
    private val compositeDisposable: CompositeDisposable,
    private val schedulerProvider: SchedulerProvider
) {
     var userData = MutableLiveData<RandomUser>()
    var job:Job?=null

    fun getRandomUser() {
        job = CoroutineScope
//        compositeDisposable.add(getUserRepository.getRandomUser()
//            .subscribeOn(schedulerProvider.io())
//            .observeOn(schedulerProvider.ui())
//            .subscribeBy(
//                onNext = {
//                    userData.value = it
//                    Log.i("woeuwoewpoeiwpiewe","this is called success $it")
//
//                },
//                onError = {
//                    Log.i("woeuwoewpoeiwpiewe","this is called errir ${it.message}")
//
//                    it.printStackTrace()
//                }
//            ))
    }
}