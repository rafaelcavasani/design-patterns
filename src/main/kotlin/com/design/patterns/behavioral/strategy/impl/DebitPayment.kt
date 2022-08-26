package com.design.patterns.behavioral.strategy.impl

import com.design.patterns.behavioral.strategy.PaymentMethods
import com.design.patterns.behavioral.strategy.PaymentType
import org.springframework.stereotype.Component

@Component
class DebitPayment : PaymentMethods {

    override val type = PaymentType.DEBIT

    override fun pay(): String {
        return "Debit payment"
    }


}