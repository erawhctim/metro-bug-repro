

Applying metro & KSP plugins to the app module causes the provider module to fail in KSP:
```
> Task :app:compileDebugJavaWithJavac FAILED
/app/build/generated/ksp/debug/java/org/example/ProvidesModule_ClockFactory.java:44: error: clock() has private access in ProvidesModule
    return Preconditions.checkNotNullFromProvides(instance.clock());
```

If you comment-out the `alias(libs.plugins.metro)` plugin application in the `app` module, Dagger/KSP works fine.