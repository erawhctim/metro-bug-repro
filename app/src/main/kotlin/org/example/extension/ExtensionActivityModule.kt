package org.example.extension

import dagger.Module
import dagger.Provides

@Module
class ExtensionActivityModule(val activity: ExtensionActivity) {
  @Provides fun provideExtAct(): ExtensionActivity = activity
}