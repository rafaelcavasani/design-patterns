package com.design.patterns.chainofresponsability.infrastructure.async.executors.success.steps

import com.design.patterns.chainofresponsability.infrastructure.async.AsyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import kotlinx.coroutines.delay

class AsyncStepThree: AsyncStepBase<AsyncExecutorContext> {

    override suspend fun execute(context: AsyncExecutorContext): AsyncExecutorContext {
        delay(500L)
        println("async execute step three with $context")
        return context
    }

    override fun fallBack(context: AsyncExecutorContext, ex: Exception) {
        println("fallback step three")
    }


}