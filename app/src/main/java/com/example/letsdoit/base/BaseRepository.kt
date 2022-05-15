package com.example.letsdoit.base

import android.content.SharedPreferences
import javax.inject.Singleton

@Singleton
open class BaseRepository(private val sharedPreferences: SharedPreferences):SharedPreferences.OnSharedPreferenceChangeListener{
    override fun onSharedPreferenceChanged(p0: SharedPreferences?, p1: String?) {

    }
    fun unregisterSharedPreferenceOnBaseRepository() {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(this)
    }
}