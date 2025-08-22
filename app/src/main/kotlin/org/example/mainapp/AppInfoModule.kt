package org.example.mainapp

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppInfoModule {
  @Provides
  fun appInfo(application: Application): AppInfo = AppInfo(
    application.packageManager.getPackageInfo(application.packageName, 0).versionName
      ?: "unknown"
  )
}