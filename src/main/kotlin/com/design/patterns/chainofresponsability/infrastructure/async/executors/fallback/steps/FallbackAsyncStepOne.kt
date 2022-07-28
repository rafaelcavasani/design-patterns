package com.design.patterns.chainofresponsability.infrastructure.async.executors.fallback.steps

import com.design.patterns.chainofresponsability.infrastructure.async.AsyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import kotlinx.coroutines.delay

class FallbackAsyncStepOne: AsyncStepBase<AsyncExecutorContext> {

    override suspend fun execute(context: AsyncExecutorContext): AsyncExecutorContext {
        delay(2000L)
        println("async execute step one with $context")
        throw RuntimeException("error executing step one")
    }

    override fun fallBack(context: AsyncExecutorContext, ex: Exception) {
        println("fallback step one executed")
    }


}