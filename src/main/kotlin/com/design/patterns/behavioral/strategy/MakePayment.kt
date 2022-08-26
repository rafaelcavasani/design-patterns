package com.design.patterns.behavioral.strategy

import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class MakePayment(
    val paymentMethods: List<PaymentMethods>
) {

    fun execute(paymentType: PaymentType): String {
        val paymentMethod = paymentMethods.firstOrNull { it.type == paymentType }
            ?: throw RuntimeException("Payment method does not exist.")

        return paymentMethod.pay()
    }

}