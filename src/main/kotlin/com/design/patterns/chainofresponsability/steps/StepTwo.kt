package com.design.patterns.chainofresponsability.steps

import com.design.patterns.chainofresponsability.infrastructure.StepBase
import com.design.patterns.chainofresponsability.context.ExecutorContext

class StepTwo: StepBase<ExecutorContext> {

    override fun execute(context: ExecutorContext): ExecutorContext {
        println("execute step two with $context")
        context.attributeTwo = "two modified"
        return context
    }

    override fun fallBack(context: ExecutorContext, ex: Exception) {
        println("fallback step two")
        throw ex
    }

}