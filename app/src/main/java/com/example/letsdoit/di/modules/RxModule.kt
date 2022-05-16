package com.example.letsdoit.di.modules

import com.example.letsdoit.utils.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.disposables.CompositeDisposable

@Module
class RxModule {
    @Provides
    fun providesCompositeDisposable() = CompositeDisposable()

    @Provides
    fun providesSchedulerProvider() = SchedulerProvider()
}