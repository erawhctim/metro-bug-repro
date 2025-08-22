package org.example.extension

import android.os.Bundle
import androidx.activity.ComponentActivity
import dev.zacsweers.metro.Inject
import org.example.mainapp.AppInfo

class ExtensionActivity: ComponentActivity() {
  // This doesn't work
  @Inject lateinit var appInfo: AppInfo

  private lateinit var extensionGraph: ExtensionGraph

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    extensionGraph = (applicationContext as ExampleApp)
      .rootGraph
      .extensionGraphFactory
      .create(ExtensionActivityModule(this))

    // Why can't ExtensionGraph access the AppInfo provider from the parent Graph?
    extensionGraph.inject(this)
  }
}