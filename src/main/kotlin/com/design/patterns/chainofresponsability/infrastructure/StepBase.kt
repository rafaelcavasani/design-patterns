package com.design.patterns.chainofresponsability.infrastructure

interface StepBase<T> {

    fun execute(context: T): T

    fun fallBack(context: T, ex: Exception)

    fun skipStep(context: T) = Unit

}