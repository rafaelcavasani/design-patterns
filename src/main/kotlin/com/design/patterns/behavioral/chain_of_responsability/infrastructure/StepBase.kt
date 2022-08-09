package com.design.patterns.behavioral.chain_of_responsability.infrastructure

interface StepBase<T> {

    fun execute(context: T): T

    fun fallBack(context: T, ex: Exception)

    fun skipStep(context: T) = Unit

}