package com.design.patterns.chainofresponsability.infrastructure.async.executors.fallback.steps

import com.design.patterns.chainofresponsability.infrastructure.async.AsyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import kotlinx.coroutines.delay

class FallbackAsyncStepTwo: AsyncStepBase<AsyncExecutorContext> {

    override suspend fun execute(context: AsyncExecutorContext): AsyncExecutorContext {
        delay(1000L)
        println("async execute step two with $context")
        throw RuntimeException("error executing step three")
    }

    override fun fallBack(context: AsyncExecutorContext, ex: Exception) {
        println("fallback step two")
    }


}