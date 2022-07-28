package com.design.patterns.chainofresponsability.async

import com.design.patterns.chainofresponsability.infrastructure.async.executors.success.SuccessAsyncExampleExecutor
import com.design.patterns.chainofresponsability.infrastructure.async.executors.AsyncExecutorContext
import com.design.patterns.chainofresponsability.infrastructure.async.executors.fallback.FallbackAsyncExampleExecutor
import org.junit.jupiter.api.Test

class FallbackAsyncExampleExecutorTest {

    @Test
    fun runAsyncExecutor() {
        val context = AsyncExecutorContext("one", "two", "three")
        val executor = FallbackAsyncExampleExecutor()
        executor.execute(context)
    }

}