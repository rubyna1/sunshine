package com.example.letsdoit.di.modules

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationBindingModule{
    @Binds
    abstract fun bindsContext(application: Application): Context
}