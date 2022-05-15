package com.example.letsdoit

import com.example.letsdoit.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class letsDoItApp:DaggerApplication() {
    override fun onCreate() {
        super.onCreate()

    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.builder().application(this).build()
}