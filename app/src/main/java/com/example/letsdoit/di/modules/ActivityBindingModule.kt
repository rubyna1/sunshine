package com.example.letsdoit.di.modules

import com.example.letsdoit.ui.MainActivity
import com.example.letsdoit.di.scopes.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
@ActivityScope
@ContributesAndroidInjector
abstract fun bindMainActivity(): MainActivity
}