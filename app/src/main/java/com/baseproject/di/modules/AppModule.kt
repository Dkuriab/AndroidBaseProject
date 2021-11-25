package com.baseproject.di.modules

import android.content.Context
import dagger.Provides

import dagger.Module


@Module
class MainActivityModule(private val context: Context) {

    @Provides //scope is not necessary for parameters stored within the module
    fun context(): Context {
        return context
    }

}