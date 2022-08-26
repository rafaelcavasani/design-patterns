package com.design.patterns.behavioral.strategy

import com.design.patterns.DesignPatternsApplication
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    classes = [DesignPatternsApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class StrategyTest {

    @Autowired
    lateinit var makePayment: MakePayment

    @Test
    fun `run strategy with Cash type`() {
        val result = makePayment.execute(PaymentType.CASH)
        Assertions.assertEquals(result, "Cash payment")
    }

    @Test
    fun `run strategy with Debit type`() {
        val result = makePayment.execute(PaymentType.DEBIT)
        Assertions.assertEquals(result, "Debit payment")
    }

    @Test
    fun `run strategy with Credit type`() {
        val result = makePayment.execute(PaymentType.CREDIT)
        Assertions.assertEquals(result, "Credit payment")
    }

}