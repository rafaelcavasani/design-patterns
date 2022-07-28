package com.design.patterns.chainofresponsability.infrastructure.sync.executors

import com.design.patterns.chainofresponsability.infrastructure.sync.SyncStepBase
import com.design.patterns.chainofresponsability.infrastructure.sync.SyncExecutorBase
import com.design.patterns.chainofresponsability.infrastructure.sync.executors.steps.SyncSyncStepOne
import com.design.patterns.chainofresponsability.infrastructure.sync.executors.steps.SyncSyncStepThree
import com.design.patterns.chainofresponsability.infrastructure.sync.executors.steps.SyncSyncStepTwo


class SyncExampleExecutor: SyncExecutorBase<SyncExecutorContext>() {

    private val syncStepOne: SyncStepBase<SyncExecutorContext> = SyncSyncStepOne()
    private val syncStepTwo: SyncStepBase<SyncExecutorContext> = SyncSyncStepTwo()
    private val syncStepThree: SyncStepBase<SyncExecutorContext> = SyncSyncStepThree()


    override fun execute(context: SyncExecutorContext) {
        this
            .initContext(context)
            .addStep(syncStepOne)
            .addStep(syncStepTwo)
            .addStep(syncStepThree)
            .apply()
    }
}