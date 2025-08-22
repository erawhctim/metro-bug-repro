package org.example.extension

import android.app.Application
import dev.zacsweers.metro.createGraphFactory
import org.example.mainapp.AppGraph
import org.example.mainapp.AppInfo
import org.example.mainapp.ApplicationModule
import javax.inject.Inject

class ExampleApp: Application() {
  // This works fine
  @Inject lateinit var appInfo: AppInfo

  lateinit var rootGraph: AppGraph

  override fun onCreate() {
    super.onCreate()

    rootGraph = createGraphFactory<AppGraph.Factory>().create(ApplicationModule(this))
    rootGraph.inject(this)
  }
}