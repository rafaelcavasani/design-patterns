package com.design.patterns.structural.decorator

import java.math.BigDecimal

class DoubleDrink(private val drink: Drink) : Drink {
    override fun serve() {
        drink.serve()
        drink.serve()
    }

    override fun getPrice(): BigDecimal {
        return drink.getPrice().multiply(BigDecimal(1.75))
    }


}