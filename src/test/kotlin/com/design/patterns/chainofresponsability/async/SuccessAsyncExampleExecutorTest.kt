package com.design.patterns.chainofresponsability.async

import com.design.patterns.chainofresponsability.infrastructure.async.executors.success.SuccessAsyncExampleExecutor
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import org.junit.jupiter.api.Test

class SuccessAsyncExampleExecutorTest {

    @Test
    fun runAsyncExecutor() {
        val context = AsyncExecutorContext("one", "two", "three")
        val executor = SuccessAsyncExampleExecutor()
        executor.execute(context)
    }

}