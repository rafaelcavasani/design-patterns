package com.design.patterns.chainofresponsability.infrastructure.async.executors.success.steps

import com.design.patterns.chainofresponsability.infrastructure.async.AsyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import kotlinx.coroutines.delay

class AsyncStepOne: AsyncStepBase<AsyncExecutorContext> {

    override suspend fun execute(context: AsyncExecutorContext): AsyncExecutorContext {
        delay(2000L)
        println("async execute step one with $context")
        return context
    }

    override fun fallBack(context: AsyncExecutorContext, ex: Exception) {
        println("fallback step one")
        throw ex
    }


}