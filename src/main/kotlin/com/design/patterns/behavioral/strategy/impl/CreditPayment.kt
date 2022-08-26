package com.design.patterns.behavioral.strategy.impl

import com.design.patterns.behavioral.strategy.PaymentMethods
import com.design.patterns.behavioral.strategy.PaymentType
import org.springframework.stereotype.Component

@Component
class CreditPayment : PaymentMethods {

    override val type = PaymentType.CREDIT

    override fun pay(): String {
        return "Credit payment"
    }


}