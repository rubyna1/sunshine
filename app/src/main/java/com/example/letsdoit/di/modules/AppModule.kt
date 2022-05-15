package com.example.letsdoit.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import org.jetbrains.anko.defaultSharedPreferences
import javax.inject.Singleton

@Module
class AppModule{

@Singleton
@Provides
fun provideSharedPreferences(application: Application) = application.defaultSharedPreferences
}