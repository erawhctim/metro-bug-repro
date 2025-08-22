package org.example.mainapp

import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Includes
import org.example.extension.ExampleApp
import org.example.extension.ExtensionGraph

@DependencyGraph
interface AppGraph {
  fun inject(app: ExampleApp)

  val extensionGraphFactory: ExtensionGraph.Factory

  @DependencyGraph.Factory
  interface Factory {
    fun create(@Includes appModule: ApplicationModule): AppGraph
  }
}