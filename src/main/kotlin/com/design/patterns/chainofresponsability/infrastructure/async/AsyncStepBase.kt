package com.design.patterns.chainofresponsability.infrastructure.async

interface AsyncStepBase<T> {

    suspend fun execute(context: T): T

    fun fallBack(context: T, ex: Exception)

}