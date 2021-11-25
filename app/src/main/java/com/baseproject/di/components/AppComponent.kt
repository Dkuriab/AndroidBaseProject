package com.baseproject.di.components

import android.content.Context
import com.baseproject.di.modules.MainActivityModule
import com.baseproject.ui.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [MainActivityModule::class]
)
interface AppComponent {
    fun context(): Context
    fun inject(mainActivity: MainActivity)
}