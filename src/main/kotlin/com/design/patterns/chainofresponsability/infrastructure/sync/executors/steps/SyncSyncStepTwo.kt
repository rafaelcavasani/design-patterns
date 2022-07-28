package com.design.patterns.chainofresponsability.infrastructure.sync.executors.steps

import com.design.patterns.chainofresponsability.infrastructure.sync.SyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.sync.executors.SyncExecutorContext

class SyncSyncStepTwo: SyncStepBase<SyncExecutorContext> {

    override fun execute(context: SyncExecutorContext): SyncExecutorContext {
        println("execute step two with $context")
        context.attributeTwo = "two modified"
        return context
    }

    override fun fallBack(context: SyncExecutorContext, ex: Exception) {
        println("fallback step two")
        throw ex
    }

}