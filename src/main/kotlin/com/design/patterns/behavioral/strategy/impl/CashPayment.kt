package com.design.patterns.behavioral.strategy.impl

import com.design.patterns.behavioral.strategy.PaymentMethods
import com.design.patterns.behavioral.strategy.PaymentType
import org.springframework.stereotype.Component

@Component
class CashPayment : PaymentMethods {

    override val type = PaymentType.CASH

    override fun pay(): String {
        return "Cash payment"
    }


}