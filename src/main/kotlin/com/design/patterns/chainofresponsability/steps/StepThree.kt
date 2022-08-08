package com.design.patterns.chainofresponsability.steps

import com.design.patterns.chainofresponsability.infrastructure.StepBase
import com.design.patterns.chainofresponsability.context.ExecutorContext

class StepThree: StepBase<ExecutorContext> {

    override fun execute(context: ExecutorContext): ExecutorContext {
        println("execute step three with $context")
        return context
    }

    override fun fallBack(context: ExecutorContext, ex: Exception) {
        println("fallback step three")
        throw ex
    }

}