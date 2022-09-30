package com.design.patterns.structural.decorator

import java.math.BigDecimal

class Tea : Drink {
    override fun serve() {
        println("- Adding 100ml of tea")
    }

    override fun getPrice() = BigDecimal(2)
}