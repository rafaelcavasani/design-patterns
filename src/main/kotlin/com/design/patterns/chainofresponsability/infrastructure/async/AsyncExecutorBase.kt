package com.design.patterns.chainofresponsability.infrastructure.async

import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import com.design.patterns.chainofresponsability.infrastructure.async.executors.fallback.FallbackAsyncExampleExecutor
import com.design.patterns.chainofresponsability.infrastructure.exception.ContextNotInitializedException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


abstract class AsyncExecutorBase<T> {

    private val steps = mutableListOf<AsyncStepBase<T>>()
    private lateinit var currentAsyncStep: AsyncStepBase<T>
    private var context: T? = null
    private var deferredList: MutableList<Deferred<T>>? = mutableListOf()

    fun init(context: T): AsyncExecutorBase<T> {
        this.context = context
        return this
    }

    fun addStep(asyncStep: AsyncStepBase<T>): AsyncExecutorBase<T> {
        this.steps.add(asyncStep)
        return this
    }

    fun apply() {
        if (context == null)
            throw ContextNotInitializedException()

        runBlocking {
            steps.forEach {
                step ->
                currentAsyncStep = step
                val handler = CoroutineExceptionHandler {
                    _, exception ->
                    currentAsyncStep.fallBack(context!!, exception as Exception)
                }
                async(handler) { step.execute(context!!) }
            }
        }
    }

    abstract fun execute(context: T)

}

fun main() {
    val context = AsyncExecutorContext("one", "two", "three")
    val executor = FallbackAsyncExampleExecutor()
    executor.execute(context)
}