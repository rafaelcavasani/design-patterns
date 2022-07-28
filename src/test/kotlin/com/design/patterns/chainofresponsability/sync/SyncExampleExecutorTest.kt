package com.design.patterns.chainofresponsability.sync

import com.design.patterns.chainofresponsability.infrastructure.sync.executors.SyncExampleExecutor
import com.design.patterns.chainofresponsability.infrastructure.sync.executors.SyncExecutorContext
import org.junit.jupiter.api.Test

class SyncExampleExecutorTest {

    @Test
    fun runSyncExecutor() {
        val context = SyncExecutorContext("one", "two")
        val executor = SyncExampleExecutor()
        executor.execute(context)
    }

}