package com.design.patterns.chainofresponsability.infrastructure.async.executors.success

import com.design.patterns.chainofresponsability.infrastructure.async.AsyncExecutorBase
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import com.design.patterns.chainofresponsability.infrastructure.async.executors.fallback.steps.FallbackAsyncStepOne
import com.design.patterns.chainofresponsability.infrastructure.async.executors.fallback.steps.FallbackAsyncStepThree
import com.design.patterns.chainofresponsability.infrastructure.async.executors.fallback.steps.FallbackAsyncStepTwo

class SuccessAsyncExampleExecutor: AsyncExecutorBase<AsyncExecutorContext>() {

    private val asyncStepOne = FallbackAsyncStepOne()
    private val asyncStepTwo = FallbackAsyncStepTwo()
    private val asyncStepThree = FallbackAsyncStepThree()

    override fun execute(context: AsyncExecutorContext) {
        this
            .init(context)
            .addStep(asyncStepOne)
            .addStep(asyncStepTwo)
            .addStep(asyncStepThree)
            .apply()
    }
}