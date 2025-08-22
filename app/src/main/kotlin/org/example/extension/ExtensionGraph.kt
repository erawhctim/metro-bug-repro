package org.example.extension

import dev.zacsweers.metro.GraphExtension
import dev.zacsweers.metro.Includes


@GraphExtension(ExtensionScope::class)
interface ExtensionGraph {
  fun inject(a: ExtensionActivity)

  @GraphExtension.Factory
  interface Factory {
    fun create(@Includes module: ExtensionActivityModule): ExtensionGraph
  }
}

abstract class ExtensionScope private constructor()

