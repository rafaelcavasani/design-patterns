package com.design.patterns.chainofresponsability.steps

import com.design.patterns.chainofresponsability.infrastructure.StepBase
import com.design.patterns.chainofresponsability.context.ExecutorContext

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