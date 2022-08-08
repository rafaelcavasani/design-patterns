package com.design.patterns.chainofresponsability

import com.design.patterns.chainofresponsability.context.ExecutorContext
import com.design.patterns.chainofresponsability.infrastructure.ExecutorBase
import com.design.patterns.chainofresponsability.infrastructure.StepBase
import com.design.patterns.chainofresponsability.steps.StepOne
import com.design.patterns.chainofresponsability.steps.StepThree
import com.design.patterns.chainofresponsability.steps.StepTwo
import org.springframework.stereotype.Component

@Component
class ExampleExecutor {

    private val syncStepOne: StepBase<ExecutorContext> = StepOne()
    private val syncStepTwo: StepBase<ExecutorContext> = StepTwo()
    private val syncStepThree: StepBase<ExecutorContext> = StepThree()


    fun execute(context: ExecutorContext) {
        val executor = ExecutorBase<ExecutorContext>()
        executor
            .initContext(context)
            .addStep(syncStepOne)
            .addStep(syncStepTwo)
            .addStep(syncStepThree)
            .apply()
    }
}