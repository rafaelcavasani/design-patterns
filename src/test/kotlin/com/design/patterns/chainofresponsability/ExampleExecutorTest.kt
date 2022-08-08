package com.design.patterns.chainofresponsability

import com.design.patterns.chainofresponsability.context.ExecutorContext
import org.junit.jupiter.api.Test

class ExampleExecutorTest {

    private val executor = ExampleExecutor()

    @Test
    fun runSyncExecutor() {
        val context = ExecutorContext("one", "two")
        executor.execute(context)
    }

}