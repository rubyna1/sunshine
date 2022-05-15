package com.example.letsdoit.di.modules

import com.example.letsdoit.di.scopes.FragmentScope
import com.example.letsdoit.ui.getUser.GetUserFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {
    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindGetRandomUserFragment(): GetUserFragment
}