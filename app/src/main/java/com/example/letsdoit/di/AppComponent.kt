package com.example.letsdoit.di

import android.app.Application
import com.example.letsdoit.di.modules.*
import com.example.letsdoit.letsDoItApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (ActivityBindingModule::class), (ApplicationBindingModule::class), (ApiModule::class),
    (AppModule::class),(FragmentBindingModule::class)])
interface AppComponent : AndroidInjector<letsDoItApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): AppComponent
    }
}