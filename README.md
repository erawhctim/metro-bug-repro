
run `gw assembleDebug` to repro:

```
> Task :app:kaptGenerateStubsDebugKotlin FAILED
e: org.jetbrains.kotlin.util.FileAnalysisException: Somewhere in file /Users/mitch.ware/Desktop/Workspace/metro-kapt-bug-repro/app/src/main/kotlin/org/example/LocationAvailabilityManager.kt: java.lang.ClassCastException: class org.jetbrains.kotlin.fir.types.impl.FirUserTypeRefImpl cannot be cast to class org.jetbrains.kotlin.fir.types.FirResolvedTypeRef (org.jetbrains.kotlin.fir.types.impl.FirUserTypeRefImpl and org.jetbrains.kotlin.fir.types.FirResolvedTypeRef are in unnamed module of loader 'app')
        at org.jetbrains.kotlin.util.AnalysisExceptionsKt.wrapIntoFileAnalysisExceptionIfNeeded(AnalysisExceptions.kt:62)
        at org.jetbrains.kotlin.fir.FirCliExceptionHandler.handleExceptionOnFileAnalysis(Utils.kt:251)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverTransformer.transformFile(FirSupertypesResolution.kt:892)
        at org.jetbrains.kotlin.fir.declarations.FirFile.transform(FirFile.kt:46)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirTransformerBasedResolveProcessor.processFile(FirResolveProcessor.kt:48)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirTotalResolveProcessor.process(FirTotalResolveProcessor.kt:36)
        at org.jetbrains.kotlin.fir.pipeline.AnalyseKt.runResolution(analyse.kt:24)
        at org.jetbrains.kotlin.fir.pipeline.FirUtilsKt.resolveAndCheckFir(firUtils.kt:76)
        at org.jetbrains.kotlin.fir.pipeline.FirUtilsKt.buildResolveAndCheckFirFromKtFiles(firUtils.kt:64)
        at org.jetbrains.kotlin.kapt4.KaptFrontendRunnerKt.compileSourceFilesToAnalyzedFirViaPsi(KaptFrontendRunner.kt:98)
        at org.jetbrains.kotlin.kapt4.KaptFrontendRunnerKt.runFrontendForKapt(KaptFrontendRunner.kt:45)
        at org.jetbrains.kotlin.kapt4.FirKaptAnalysisHandlerExtension.contextForStubGeneration(FirKaptAnalysisHandlerExtension.kt:221)
        at org.jetbrains.kotlin.kapt4.FirKaptAnalysisHandlerExtension.doAnalysis(FirKaptAnalysisHandlerExtension.kt:126)
        at org.jetbrains.kotlin.fir.extensions.FirAnalysisHandlerExtension$Companion.analyze(FirAnalysisHandlerExtension.kt:29)
        at org.jetbrains.kotlin.cli.pipeline.jvm.JvmFrontendPipelinePhase.executePhase(JvmFrontendPipelinePhase.kt:76)
        at org.jetbrains.kotlin.cli.pipeline.jvm.JvmFrontendPipelinePhase.executePhase(JvmFrontendPipelinePhase.kt:56)
        at org.jetbrains.kotlin.cli.pipeline.PipelinePhase.phaseBody(PipelinePhase.kt:68)
        at org.jetbrains.kotlin.cli.pipeline.PipelinePhase.phaseBody(PipelinePhase.kt:58)
        at org.jetbrains.kotlin.config.phaser.SimpleNamedCompilerPhase.phaseBody(CompilerPhase.kt:215)
        at org.jetbrains.kotlin.config.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:111)
        at org.jetbrains.kotlin.backend.common.phaser.CompositePhase.invoke(PhaseBuilders.kt:28)
        at org.jetbrains.kotlin.config.phaser.CompilerPhaseKt.invokeToplevel(CompilerPhase.kt:62)
        at org.jetbrains.kotlin.cli.pipeline.AbstractCliPipeline.runPhasedPipeline(AbstractCliPipeline.kt:106)
        at org.jetbrains.kotlin.cli.pipeline.AbstractCliPipeline.execute(AbstractCliPipeline.kt:65)
        at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecutePhased(K2JVMCompiler.kt:61)
        at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecutePhased(K2JVMCompiler.kt:36)
        at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:80)
        at org.jetbrains.kotlin.cli.common.CLICompiler.exec(CLICompiler.kt:337)
        at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.runCompiler(IncrementalJvmCompilerRunner.kt:466)
        at org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.runCompiler(IncrementalJvmCompilerRunner.kt:75)
        at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.doCompile(IncrementalCompilerRunner.kt:514)
        at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compileImpl(IncrementalCompilerRunner.kt:431)
        at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compileNonIncrementally(IncrementalCompilerRunner.kt:310)
        at org.jetbrains.kotlin.incremental.IncrementalCompilerRunner.compile(IncrementalCompilerRunner.kt:137)
        at org.jetbrains.kotlin.daemon.CompileServiceImplBase.execIncrementalCompiler(CompileServiceImpl.kt:678)
        at org.jetbrains.kotlin.daemon.CompileServiceImplBase.access$execIncrementalCompiler(CompileServiceImpl.kt:92)
        at org.jetbrains.kotlin.daemon.CompileServiceImpl.compile(CompileServiceImpl.kt:1805)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at java.rmi/sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:360)
        at java.rmi/sun.rmi.transport.Transport$1.run(Transport.java:200)
        at java.rmi/sun.rmi.transport.Transport$1.run(Transport.java:197)
        at java.base/java.security.AccessController.doPrivileged(AccessController.java:714)
        at java.rmi/sun.rmi.transport.Transport.serviceCall(Transport.java:196)
        at java.rmi/sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:598)
        at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:844)
        at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:721)
        at java.base/java.security.AccessController.doPrivileged(AccessController.java:400)
        at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:720)
        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
        at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.lang.ClassCastException: class org.jetbrains.kotlin.fir.types.impl.FirUserTypeRefImpl cannot be cast to class org.jetbrains.kotlin.fir.types.FirResolvedTypeRef (org.jetbrains.kotlin.fir.types.impl.FirUserTypeRefImpl and org.jetbrains.kotlin.fir.types.FirResolvedTypeRef are in unnamed module of loader 'app')
        at dev.zacsweers.metro.compiler.fir.generators.InjectedClassFirGenerator.generateNestedClassLikeDeclaration$lambda$16$lambda$14$lambda$13(InjectedClassFirGenerator.kt:885)
        at org.jetbrains.kotlin.fir.plugin.DeclarationBuildingContext.typeParameter(DeclarationBuildingContext.kt:70)
        at org.jetbrains.kotlin.fir.plugin.DeclarationBuildingContext.typeParameter$default(DeclarationBuildingContext.kt:63)
        at dev.zacsweers.metro.compiler.fir.generators.InjectedClassFirGenerator.generateNestedClassLikeDeclaration$lambda$16(InjectedClassFirGenerator.kt:421)
        at org.jetbrains.kotlin.fir.plugin.ClassBuildingContextKt.createNestedClass(ClassBuildingContext.kt:144)
        at dev.zacsweers.metro.compiler.fir.generators.InjectedClassFirGenerator.generateNestedClassLikeDeclaration(InjectedClassFirGenerator.kt:413)
        at org.jetbrains.kotlin.fir.scopes.impl.FirGeneratedMemberDeclarationsStorage$ClassifierStorage.generateNestedClassifier(FirGeneratedScopes.kt:254)
        at org.jetbrains.kotlin.fir.scopes.impl.FirGeneratedMemberDeclarationsStorage$ClassifierStorage.access$generateNestedClassifier(FirGeneratedScopes.kt:231)
        at org.jetbrains.kotlin.fir.scopes.impl.FirGeneratedMemberDeclarationsStorage$ClassifierStorage$special$$inlined$createCache$1.invoke(FirCachesFactory.kt:149)
        at org.jetbrains.kotlin.fir.scopes.impl.FirGeneratedMemberDeclarationsStorage$ClassifierStorage$special$$inlined$createCache$1.invoke(FirCachesFactory.kt:147)
        at org.jetbrains.kotlin.fir.caches.FirThreadUnsafeCache.getValue(FirThreadUnsafeCachesFactory.kt:57)
        at org.jetbrains.kotlin.fir.scopes.impl.FirGeneratedClassNestedClassifierScope.getNestedClassSymbol(FirGeneratedScopes.kt:299)
        at org.jetbrains.kotlin.fir.scopes.impl.FirGeneratedClassNestedClassifierScope.getNestedClassSymbol(FirGeneratedScopes.kt:106)
        at org.jetbrains.kotlin.fir.scopes.impl.FirNestedClassifierScope.processClassifiersByNameWithSubstitution(FirNestedClassifierScope.kt:39)
        at org.jetbrains.kotlin.fir.scopes.impl.FirCompositeNestedClassifierScope.processClassifiersByNameWithSubstitution(FirNestedClassifierScope.kt:110)
        at org.jetbrains.kotlin.fir.scopes.impl.FirClassDeclaredMemberScopeImpl.processClassifiersByNameWithSubstitution(FirClassDeclaredMemberScope.kt:101)
        at org.jetbrains.kotlin.fir.scopes.FirCompositeScope.processClassifiersByNameWithSubstitution(FirCompositeScope.kt:23)
        at org.jetbrains.kotlin.fir.scopes.FirNameAwareCompositeScope.processClassifiersByNameWithSubstitution(FirCompositeScope.kt:86)
        at org.jetbrains.kotlin.fir.extensions.GeneratedDeclarationsUtilsKt.generatedNestedClassifiers(generatedDeclarationsUtils.kt:54)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.addSupertypesToGeneratedNestedClasses(FirSupertypesResolution.kt:509)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.resolveSpecificClassLikeSupertypes$lambda$15(FirSupertypesResolution.kt:479)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.resolveSpecificClassLikeSupertypes(FirSupertypesResolution.kt:402)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.resolveSpecificClassLikeSupertypes(FirSupertypesResolution.kt:445)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.visitRegularClass(FirSupertypesResolution.kt:425)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.visitRegularClass(FirSupertypesResolution.kt:226)
        at org.jetbrains.kotlin.fir.declarations.FirRegularClass.accept(FirRegularClass.kt:48)
        at org.jetbrains.kotlin.fir.declarations.impl.FirFileImpl.acceptChildren(FirFileImpl.kt:57)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.visitDeclarationContent(FirSupertypesResolution.kt:413)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.visitFile(FirSupertypesResolution.kt:593)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverVisitor.visitFile(FirSupertypesResolution.kt:226)
        at org.jetbrains.kotlin.fir.declarations.FirFile.accept(FirFile.kt:42)
        at org.jetbrains.kotlin.fir.resolve.transformers.FirSupertypeResolverTransformer.transformFile(FirSupertypesResolution.kt:71)
        ... 49 more


FAILURE: Build failed with an exception.
```
