package com.design.patterns.chainofresponsability.infrastructure.async.executors.success.steps

import com.design.patterns.chainofresponsability.infrastructure.async.AsyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import kotlinx.coroutines.delay

class AsyncStepTwo: AsyncStepBase<AsyncExecutorContext> {

    override suspend fun execute(context: AsyncExecutorContext): AsyncExecutorContext {
        delay(1000L)
        println("async execute step two with $context")
        return context
    }

    override fun fallBack(context: AsyncExecutorContext, ex: Exception) {
        println("fallback step two")
    }


}