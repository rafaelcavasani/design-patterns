package com.design.patterns.chainofresponsability.infrastructure.sync.executors.steps

import com.design.patterns.chainofresponsability.infrastructure.sync.SyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.sync.executors.SyncExecutorContext

class SyncSyncStepOne: SyncStepBase<SyncExecutorContext> {

    override fun execute(context: SyncExecutorContext): SyncExecutorContext {
        println("execute step one with $context")
        context.attributeOne = "one modified"
        return context
    }

    override fun fallBack(context: SyncExecutorContext, ex: Exception) {
        println("fallback step one")
        throw ex
    }

}