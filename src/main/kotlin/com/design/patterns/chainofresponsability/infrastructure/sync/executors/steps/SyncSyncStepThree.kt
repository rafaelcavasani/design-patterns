package com.design.patterns.chainofresponsability.infrastructure.sync.executors.steps

import com.design.patterns.chainofresponsability.infrastructure.sync.SyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.sync.executors.SyncExecutorContext

class SyncSyncStepThree: SyncStepBase<SyncExecutorContext> {

    override fun execute(context: SyncExecutorContext): SyncExecutorContext {
        println("execute step three with $context")
        return context
    }

    override fun fallBack(context: SyncExecutorContext, ex: Exception) {
        println("fallback step three")
        throw ex
    }

}