package com.design.patterns.chainofresponsability.infrastructure.sync

interface SyncStepBase<T> {

    fun execute(context: T): T

    fun fallBack(context: T, ex: Exception)

    fun skipStep(context: T) = Unit

}