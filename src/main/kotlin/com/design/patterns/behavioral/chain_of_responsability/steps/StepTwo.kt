package com.design.patterns.behavioral.chain_of_responsability.steps

import com.design.patterns.behavioral.chain_of_responsability.infrastructure.StepBase
import com.design.patterns.behavioral.chain_of_responsability.context.ExecutorContext

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