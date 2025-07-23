package org.example

import android.app.Application

class ExampleApp: Application() {

    override fun onCreate() {
        super.onCreate()

        val component: ObjectGraph = DaggerObjectGraph.builder().build()
    }
}