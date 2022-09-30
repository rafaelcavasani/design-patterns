package com.design.patterns.structural.decorator

import java.math.BigDecimal

class Expresso : Drink {
    override fun serve() {
        println("- Adding 50ml of expresso")
    }

    override fun getPrice() = BigDecimal.ONE
}