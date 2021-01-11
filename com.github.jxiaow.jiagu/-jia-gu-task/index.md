---
title: JiaGuTask -
---
//[plugin](../../index.md)/[com.github.jxiaow.jiagu](../index.md)/[JiaGuTask](index.md)



# JiaGuTask  
 [jvm] 360加固任务，此任务在"assembleXXX"后运行  
  
open class [JiaGuTask](index.md) : [DefaultTask]()   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [jvm] fun [<init>](-init-.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [action](action.md)| [jvm]  <br>Brief description  <br>执行Apk文件加固流程  <br>Content  <br>fun [action](action.md)()  <br><br><br>
| [appendParallelSafeAction]()| [jvm]  <br>Content  <br>open override fun [appendParallelSafeAction]()(p0: [Action]()<In [Task]()>)  <br><br><br>
| [assertDynamicObject]()| [jvm]  <br>Content  <br>open override fun [assertDynamicObject]()()  <br><br><br>
| [compareTo]()| [jvm]  <br>Content  <br>open operator override fun [compareTo]()(other: [Task]()): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [configure]()| [jvm]  <br>Content  <br>open override fun [configure]()(p0: [Closure]()<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [Task]()  <br><br><br>
| [convertClosureToAction]()| [jvm]  <br>Content  <br>open override fun [convertClosureToAction]()(p0: [Closure]()<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>, p1: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [InputChangesAwareTaskAction]()  <br><br><br>
| [createNewOnlyIfSpec]()| [jvm]  <br>Content  <br>open override fun [createNewOnlyIfSpec]()(): [AndSpec]()<[Task]()>  <br><br><br>
| [dependsOn]()| [jvm]  <br>Content  <br>open override fun [dependsOn]()(vararg p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [Task]()  <br><br><br>
| [doFirst]()| [jvm]  <br>Content  <br>open override fun [doFirst]()(p0: [Action]()<In [Task]()>): [Task]()  <br>open override fun [doFirst]()(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [Action]()<In [Task]()>): [Task]()  <br>open override fun [doFirst]()(p0: [Closure]()<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [Task]()  <br><br><br>
| [doLast]()| [jvm]  <br>Content  <br>open override fun [doLast]()(p0: [Action]()<In [Task]()>): [Task]()  <br>open override fun [doLast]()(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [Action]()<In [Task]()>): [Task]()  <br>open override fun [doLast]()(p0: [Closure]()<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [Task]()  <br><br><br>
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [finalizedBy]()| [jvm]  <br>Content  <br>open override fun [finalizedBy]()(vararg p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [Task]()  <br><br><br>
| [getActions]()| [jvm]  <br>Content  <br>open override fun [getActions]()(): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Action]()<In [Task]()>>  <br><br><br>
| [getAnt]()| [jvm]  <br>Content  <br>open override fun [getAnt]()(): [AntBuilder]()  <br><br><br>
| [getAsDynamicObject]()| [jvm]  <br>Content  <br>@[Internal]()()  <br>  <br>open override fun [getAsDynamicObject]()(): [DynamicObject]()  <br><br><br>
| [getConvention]()| [jvm]  <br>Content  <br>open override fun [getConvention]()(): [Convention]()  <br><br><br>
| [getDependsOn]()| [jvm]  <br>Content  <br>open override fun [getDependsOn]()(): [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>  <br><br><br>
| [getDescription]()| [jvm]  <br>Content  <br>open override fun [getDescription]()(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>
| [getDestroyables]()| [jvm]  <br>Content  <br>open override fun [getDestroyables]()(): [TaskDestroyables]()  <br><br><br>
| [getDidWork]()| [jvm]  <br>Content  <br>open override fun [getDidWork]()(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [getEnabled]()| [jvm]  <br>Content  <br>open override fun [getEnabled]()(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [getExtensions]()| [jvm]  <br>Content  <br>@[Internal]()()  <br>  <br>open override fun [getExtensions]()(): [ExtensionContainer]()  <br><br><br>
| [getFinalizedBy]()| [jvm]  <br>Content  <br>open override fun [getFinalizedBy]()(): [TaskDependency]()  <br><br><br>
| [getGroup]()| [jvm]  <br>Content  <br>open override fun [getGroup]()(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>
| [getIdentityPath]()| [jvm]  <br>Content  <br>open override fun [getIdentityPath]()(): [Path]()  <br><br><br>
| [getImpliesSubProjects]()| [jvm]  <br>Content  <br>open override fun [getImpliesSubProjects]()(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [getInputs]()| [jvm]  <br>Content  <br>open override fun [getInputs]()(): [TaskInputsInternal]()  <br><br><br>
| [getLocalState]()| [jvm]  <br>Content  <br>open override fun [getLocalState]()(): [TaskLocalState]()  <br><br><br>
| [getLogger]()| [jvm]  <br>Content  <br>open override fun [getLogger]()(): [Logger]()  <br><br><br>
| [getLogging]()| [jvm]  <br>Content  <br>open override fun [getLogging]()(): [LoggingManagerInternal]()  <br><br><br>
| [getMustRunAfter]()| [jvm]  <br>Content  <br>open override fun [getMustRunAfter]()(): [TaskDependency]()  <br><br><br>
| [getName]()| [jvm]  <br>Content  <br>open override fun [getName]()(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [getOnlyIf]()| [jvm]  <br>Content  <br>open override fun [getOnlyIf]()(): [Spec]()<In [TaskInternal]()>  <br><br><br>
| [getOutputs]()| [jvm]  <br>Content  <br>open override fun [getOutputs]()(): [TaskOutputsInternal]()  <br><br><br>
| [getPath]()| [jvm]  <br>Content  <br>open override fun [getPath]()(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [getProject]()| [jvm]  <br>Content  <br>open override fun [getProject]()(): [Project]()  <br><br><br>
| [getRequiredServices]()| [jvm]  <br>Content  <br>open override fun [getRequiredServices]()(): [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)<[Provider]()<Out [BuildService]()<*>>>  <br><br><br>
| [getServices]()| [jvm]  <br>Content  <br>@[Internal]()()  <br>  <br>open override fun [getServices]()(): [ServiceRegistry]()  <br><br><br>
| [getSharedResources]()| [jvm]  <br>Content  <br>open override fun [getSharedResources]()(): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[ResourceLock]()>  <br><br><br>
| [getShouldRunAfter]()| [jvm]  <br>Content  <br>open override fun [getShouldRunAfter]()(): [TaskDependency]()  <br><br><br>
| [getStandardOutputCapture]()| [jvm]  <br>Content  <br>open override fun [getStandardOutputCapture]()(): [StandardOutputCapture]()  <br><br><br>
| [getState]()| [jvm]  <br>Content  <br>open override fun [getState]()(): [TaskStateInternal]()  <br><br><br>
| [getTaskActions]()| [jvm]  <br>Content  <br>open override fun [getTaskActions]()(): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[InputChangesAwareTaskAction]()>  <br><br><br>
| [getTaskDependencies]()| [jvm]  <br>Content  <br>open override fun [getTaskDependencies]()(): [TaskDependencyInternal]()  <br><br><br>
| [getTaskIdentity]()| [jvm]  <br>Content  <br>open override fun [getTaskIdentity]()(): [TaskIdentity]()<*>  <br><br><br>
| [getTemporaryDir]()| [jvm]  <br>Content  <br>open override fun [getTemporaryDir]()(): [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)  <br><br><br>
| [getTemporaryDirFactory]()| [jvm]  <br>Content  <br>open override fun [getTemporaryDirFactory]()(): [Factory]()<[File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)>  <br><br><br>
| [getTimeout]()| [jvm]  <br>Content  <br>open override fun [getTimeout]()(): [Property]()<[Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html)>  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [hasProperty]()| [jvm]  <br>Content  <br>open override fun [hasProperty]()(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hasTaskActions]()| [jvm]  <br>Content  <br>open override fun [hasTaskActions]()(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isEnabled]()| [jvm]  <br>Content  <br>@[Internal]()()  <br>  <br>open override fun [isEnabled]()(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [isHasCustomActions]()| [jvm]  <br>Content  <br>open override fun [isHasCustomActions]()(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [mustRunAfter]()| [jvm]  <br>Content  <br>open override fun [mustRunAfter]()(vararg p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [Task]()  <br><br><br>
| [onlyIf]()| [jvm]  <br>Content  <br>open override fun [onlyIf]()(p0: [Closure]()<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br>open override fun [onlyIf]()(p0: [Spec]()<In [Task]()>)  <br><br><br>
| [prependParallelSafeAction]()| [jvm]  <br>Content  <br>open override fun [prependParallelSafeAction]()(p0: [Action]()<In [Task]()>)  <br><br><br>
| [property]()| [jvm]  <br>Content  <br>open override fun [property]()(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?  <br><br><br>
| [replaceLogger]()| [jvm]  <br>Content  <br>open override fun [replaceLogger]()(p0: [Logger]())  <br><br><br>
| [setActions]()| [jvm]  <br>Content  <br>open override fun [setActions]()(p0: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[Action]()<In [Task]()>>)  <br><br><br>
| [setDependsOn]()| [jvm]  <br>Content  <br>open override fun [setDependsOn]()(p0: [MutableIterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)<*>)  <br><br><br>
| [setDescription]()| [jvm]  <br>Content  <br>open override fun [setDescription]()(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>
| [setDidWork]()| [jvm]  <br>Content  <br>open override fun [setDidWork]()(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br><br><br>
| [setEnabled]()| [jvm]  <br>Content  <br>open override fun [setEnabled]()(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br><br><br>
| [setFinalizedBy]()| [jvm]  <br>Content  <br>open override fun [setFinalizedBy]()(p0: [MutableIterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)<*>)  <br><br><br>
| [setGroup]()| [jvm]  <br>Content  <br>open override fun [setGroup]()(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>
| [setImpliesSubProjects]()| [jvm]  <br>Content  <br>open override fun [setImpliesSubProjects]()(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  <br><br><br>
| [setMustRunAfter]()| [jvm]  <br>Content  <br>open override fun [setMustRunAfter]()(p0: [MutableIterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)<*>)  <br><br><br>
| [setOnlyIf]()| [jvm]  <br>Content  <br>open override fun [setOnlyIf]()(p0: [Spec]()<In [Task]()>)  <br>open override fun [setOnlyIf]()(p0: [Closure]()<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  <br><br><br>
| [setProperty]()| [jvm]  <br>Content  <br>open override fun [setProperty]()(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br><br><br>
| [setShouldRunAfter]()| [jvm]  <br>Content  <br>open override fun [setShouldRunAfter]()(p0: [MutableIterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)<*>)  <br><br><br>
| [shouldRunAfter]()| [jvm]  <br>Content  <br>open override fun [shouldRunAfter]()(vararg p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>): [TaskDependency]()  <br><br><br>
| [toString]()| [jvm]  <br>Content  <br>open override fun [toString]()(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [usesService]()| [jvm]  <br>Content  <br>open override fun [usesService]()(p0: [Provider]()<Out [BuildService]()<*>>)  <br><br><br>
| [validateJiaGuParams](validate-jia-gu-params.md)| [jvm]  <br>Brief description  <br>"jiagu"参数校验  <br>Content  <br>fun [validateJiaGuParams](validate-jia-gu-params.md)()  <br><br><br>
| [wrap]()| [jvm]  <br>Content  <br>open override fun [wrap]()(p0: [Action]()<In [Task]()>): [InputChangesAwareTaskAction]()  <br>open override fun [wrap]()(p0: [Action]()<In [Task]()>, p1: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [InputChangesAwareTaskAction]()  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [actions](index.md#com.github.jxiaow.jiagu/JiaGuTask/actions/#/PointingToDeclaration/)|  [jvm] override val [actions](index.md#com.github.jxiaow.jiagu/JiaGuTask/actions/#/PointingToDeclaration/): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<[InputChangesAwareTaskAction]()>   <br>
| [dependencies](index.md#com.github.jxiaow.jiagu/JiaGuTask/dependencies/#/PointingToDeclaration/)|  [jvm] override val [dependencies](index.md#com.github.jxiaow.jiagu/JiaGuTask/dependencies/#/PointingToDeclaration/): [DefaultTaskDependency]()   <br>
| [description](index.md#com.github.jxiaow.jiagu/JiaGuTask/description/#/PointingToDeclaration/)|  [jvm] override val [description](index.md#com.github.jxiaow.jiagu/JiaGuTask/description/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [enabled](index.md#com.github.jxiaow.jiagu/JiaGuTask/enabled/#/PointingToDeclaration/)|  [jvm] override val [enabled](index.md#com.github.jxiaow.jiagu/JiaGuTask/enabled/#/PointingToDeclaration/): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)   <br>
| [extensibleDynamicObject](index.md#com.github.jxiaow.jiagu/JiaGuTask/extensibleDynamicObject/#/PointingToDeclaration/)|  [jvm] override val [extensibleDynamicObject](index.md#com.github.jxiaow.jiagu/JiaGuTask/extensibleDynamicObject/#/PointingToDeclaration/): [ExtensibleDynamicObject]()   <br>
| [finalizedBy](index.md#com.github.jxiaow.jiagu/JiaGuTask/finalizedBy/#/PointingToDeclaration/)|  [jvm] override val [finalizedBy](index.md#com.github.jxiaow.jiagu/JiaGuTask/finalizedBy/#/PointingToDeclaration/): [DefaultTaskDependency]()   <br>
| [group](index.md#com.github.jxiaow.jiagu/JiaGuTask/group/#/PointingToDeclaration/)|  [jvm] override val [group](index.md#com.github.jxiaow.jiagu/JiaGuTask/group/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [hasCustomActions](index.md#com.github.jxiaow.jiagu/JiaGuTask/hasCustomActions/#/PointingToDeclaration/)|  [jvm] override val [hasCustomActions](index.md#com.github.jxiaow.jiagu/JiaGuTask/hasCustomActions/#/PointingToDeclaration/): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)   <br>
| [identity](index.md#com.github.jxiaow.jiagu/JiaGuTask/identity/#/PointingToDeclaration/)|  [jvm] override val [identity](index.md#com.github.jxiaow.jiagu/JiaGuTask/identity/#/PointingToDeclaration/): [TaskIdentity]()<*>   <br>
| [impliesSubProjects](index.md#com.github.jxiaow.jiagu/JiaGuTask/impliesSubProjects/#/PointingToDeclaration/)|  [jvm] override val [impliesSubProjects](index.md#com.github.jxiaow.jiagu/JiaGuTask/impliesSubProjects/#/PointingToDeclaration/): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)   <br>
| [logger](index.md#com.github.jxiaow.jiagu/JiaGuTask/logger/#/PointingToDeclaration/)|  [jvm] override val [logger](index.md#com.github.jxiaow.jiagu/JiaGuTask/logger/#/PointingToDeclaration/): [Logger]()   <br>
| [loggingManager](index.md#com.github.jxiaow.jiagu/JiaGuTask/loggingManager/#/PointingToDeclaration/)|  [jvm] override val [loggingManager](index.md#com.github.jxiaow.jiagu/JiaGuTask/loggingManager/#/PointingToDeclaration/): [LoggingManagerInternal]()   <br>
| [mustRunAfter](index.md#com.github.jxiaow.jiagu/JiaGuTask/mustRunAfter/#/PointingToDeclaration/)|  [jvm] override val [mustRunAfter](index.md#com.github.jxiaow.jiagu/JiaGuTask/mustRunAfter/#/PointingToDeclaration/): [DefaultTaskDependency]()   <br>
| [observableActionList](index.md#com.github.jxiaow.jiagu/JiaGuTask/observableActionList/#/PointingToDeclaration/)|  [jvm] override val [observableActionList](index.md#com.github.jxiaow.jiagu/JiaGuTask/observableActionList/#/PointingToDeclaration/): [ObservableList]()   <br>
| [onlyIfSpec](index.md#com.github.jxiaow.jiagu/JiaGuTask/onlyIfSpec/#/PointingToDeclaration/)|  [jvm] override val [onlyIfSpec](index.md#com.github.jxiaow.jiagu/JiaGuTask/onlyIfSpec/#/PointingToDeclaration/): [AndSpec]()<[Task]()>   <br>
| [project](index.md#com.github.jxiaow.jiagu/JiaGuTask/project/#/PointingToDeclaration/)|  [jvm] override val [project](index.md#com.github.jxiaow.jiagu/JiaGuTask/project/#/PointingToDeclaration/): [ProjectInternal]()   <br>
| [requiredServices](index.md#com.github.jxiaow.jiagu/JiaGuTask/requiredServices/#/PointingToDeclaration/)|  [jvm] override val [requiredServices](index.md#com.github.jxiaow.jiagu/JiaGuTask/requiredServices/#/PointingToDeclaration/): [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)<[Provider]()<Out [BuildService]()<*>>>   <br>
| [services](index.md#com.github.jxiaow.jiagu/JiaGuTask/services/#/PointingToDeclaration/)|  [jvm] override val [services](index.md#com.github.jxiaow.jiagu/JiaGuTask/services/#/PointingToDeclaration/): [ServiceRegistry]()   <br>
| [shouldRunAfter](index.md#com.github.jxiaow.jiagu/JiaGuTask/shouldRunAfter/#/PointingToDeclaration/)|  [jvm] override val [shouldRunAfter](index.md#com.github.jxiaow.jiagu/JiaGuTask/shouldRunAfter/#/PointingToDeclaration/): [DefaultTaskDependency]()   <br>
| [state](index.md#com.github.jxiaow.jiagu/JiaGuTask/state/#/PointingToDeclaration/)|  [jvm] override val [state](index.md#com.github.jxiaow.jiagu/JiaGuTask/state/#/PointingToDeclaration/): [TaskStateInternal]()   <br>
| [taskDestroyables](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskDestroyables/#/PointingToDeclaration/)|  [jvm] override val [taskDestroyables](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskDestroyables/#/PointingToDeclaration/): [TaskDestroyables]()   <br>
| [taskInputs](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskInputs/#/PointingToDeclaration/)|  [jvm] override val [taskInputs](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskInputs/#/PointingToDeclaration/): [TaskInputsInternal]()   <br>
| [taskLocalState](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskLocalState/#/PointingToDeclaration/)|  [jvm] override val [taskLocalState](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskLocalState/#/PointingToDeclaration/): [TaskLocalStateInternal]()   <br>
| [taskMutator](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskMutator/#/PointingToDeclaration/)|  [jvm] override val [taskMutator](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskMutator/#/PointingToDeclaration/): [TaskMutator]()   <br>
| [taskOutputs](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskOutputs/#/PointingToDeclaration/)|  [jvm] override val [taskOutputs](index.md#com.github.jxiaow.jiagu/JiaGuTask/taskOutputs/#/PointingToDeclaration/): [TaskOutputsInternal]()   <br>
| [timeout](index.md#com.github.jxiaow.jiagu/JiaGuTask/timeout/#/PointingToDeclaration/)|  [jvm] override val [timeout](index.md#com.github.jxiaow.jiagu/JiaGuTask/timeout/#/PointingToDeclaration/): [Property]()<[Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html)>   <br>
| [toStringValue](index.md#com.github.jxiaow.jiagu/JiaGuTask/toStringValue/#/PointingToDeclaration/)|  [jvm] override val [toStringValue](index.md#com.github.jxiaow.jiagu/JiaGuTask/toStringValue/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

