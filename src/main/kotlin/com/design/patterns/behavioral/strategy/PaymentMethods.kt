package com.design.patterns.behavioral.strategy

interface PaymentMethods {
    val type: PaymentType
    fun pay(): String
}