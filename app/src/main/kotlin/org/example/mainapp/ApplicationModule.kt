package org.example.mainapp

import android.app.Application
import dagger.Module
import dev.zacsweers.metro.Provides

@Module(includes = [AppInfoModule::class])
class ApplicationModule(val application: Application) {
  @Provides fun app(): Application = application
}