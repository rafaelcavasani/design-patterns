package com.design.patterns.structural.decorator

import java.math.BigDecimal

interface Drink {
    fun serve()
    fun getPrice(): BigDecimal
}