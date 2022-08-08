package com.design.patterns.chainofresponsability.infrastructure

import com.design.patterns.chainofresponsability.exception.ContextNotInitializedException
import com.design.patterns.chainofresponsability.exception.SkipStepException

class ExecutorBase<T> {

    private val steps = mutableListOf<StepBase<T>>()
    private lateinit var currentSyncStep: StepBase<T>
    private var currentContext: T? = null

    fun initContext(context: T): ExecutorBase<T> {
        this.currentContext = context
        return this
    }

    fun addStep(syncStep: StepBase<T>): ExecutorBase<T> {
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

}