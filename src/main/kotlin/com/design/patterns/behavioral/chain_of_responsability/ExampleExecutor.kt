package com.design.patterns.behavioral.chain_of_responsability

import com.design.patterns.behavioral.chain_of_responsability.context.ExecutorContext
import com.design.patterns.behavioral.chain_of_responsability.infrastructure.ExecutorBase
import com.design.patterns.behavioral.chain_of_responsability.infrastructure.StepBase
import com.design.patterns.behavioral.chain_of_responsability.steps.StepOne
import com.design.patterns.behavioral.chain_of_responsability.steps.StepThree
import com.design.patterns.behavioral.chain_of_responsability.steps.StepTwo
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