package com.design.patterns.structural.decorator

import java.math.BigDecimal

class Milk(private val drink: Drink) : Drink {
    override fun serve() {
        drink.serve()
        println("- Adding 30ml of milk")
    }

    override fun getPrice(): BigDecimal {
        return drink.getPrice().plus(BigDecimal.ONE)
    }


}