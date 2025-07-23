package org.example

import dagger.Component
import dagger.Module
import dagger.Provides
import java.time.Clock

@Component(modules = [ProvidesModule::class])
interface ObjectGraph

@Module
class ProvidesModule {
    @Provides fun clock(): Clock = Clock.systemDefaultZone()
}