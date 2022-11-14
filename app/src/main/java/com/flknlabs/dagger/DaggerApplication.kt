package com.flknlabs.dagger

import android.app.Application

class DaggerApplication: Application(), ComponentProvider {
    override val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }

    override fun onCreate() {
        super.onCreate()
    }
}