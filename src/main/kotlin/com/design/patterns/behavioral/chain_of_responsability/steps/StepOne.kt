package com.design.patterns.behavioral.chain_of_responsability.steps

import com.design.patterns.behavioral.chain_of_responsability.infrastructure.StepBase
import com.design.patterns.behavioral.chain_of_responsability.context.ExecutorContext

class StepOne: StepBase<ExecutorContext> {

    override fun execute(context: ExecutorContext): ExecutorContext {
        println("execute step one with $context")
        context.attributeOne = "one modified"
        return context
    }

    override fun fallBack(context: ExecutorContext, ex: Exception) {
        println("fallback step one")
        throw ex
    }

}