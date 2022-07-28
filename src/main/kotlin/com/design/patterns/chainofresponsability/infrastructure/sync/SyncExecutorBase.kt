package com.design.patterns.chainofresponsability.infrastructure.sync

import com.design.patterns.chainofresponsability.infrastructure.exception.ContextNotInitializedException
import com.design.patterns.chainofresponsability.infrastructure.exception.SkipStepException

abstract class SyncExecutorBase<T> {

    private val steps = mutableListOf<SyncStepBase<T>>()
    private lateinit var currentSyncStep: SyncStepBase<T>
    private var currentContext: T? = null

    fun initContext(context: T): SyncExecutorBase<T> {
        this.currentContext = context
        return this
    }

    fun addStep(syncStep: SyncStepBase<T>): SyncExecutorBase<T> {
        this.steps.add(syncStep)
        return this
    }

    fun apply(): T {
        if (currentContext == null)
            throw ContextNotInitializedException()

        try {
            steps.forEach {
                step ->
                try {
                    currentSyncStep = step
                    currentContext = step.execute(currentContext!!)
                } catch (skipEx: SkipStepException) {
                    // just run the skipStep function if necessary and go to the next step
                    currentSyncStep.skipStep(currentContext!!)
                }
            }
        } catch (ex: Exception) {
            currentSyncStep.fallBack(currentContext!!, ex)
        }
        return currentContext!!
    }

    abstract fun execute(context: T)
}