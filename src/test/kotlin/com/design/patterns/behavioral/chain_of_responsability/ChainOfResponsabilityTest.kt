package com.design.patterns.behavioral.chain_of_responsability

import com.design.patterns.behavioral.chain_of_responsability.context.ExecutorContext
import org.junit.jupiter.api.Test

class ChainOfResponsabilityTest {

    private val executor = ExampleExecutor()

    @Test
    fun runSyncExecutor() {
        val context = ExecutorContext("one", "two")
        executor.execute(context)
    }

}