package com.design.patterns.structural.decorator

import org.junit.jupiter.api.Test

class DecoratorTest {

    @Test
    fun `decorator test - expresso`() {
        val expresso = Expresso()
        expresso.serve()
        println("price: R$ ${expresso.getPrice()}")
    }

    @Test
    fun `decorator test - tea`() {
        val tea = Tea()
        tea.serve()
        println("price: R$ ${tea.getPrice()}")
    }

    @Test
    fun `decorator test - double expresso`() {
        val doubleExpresso = DoubleDrink(Expresso())
        doubleExpresso.serve()
        println("price: R$ ${doubleExpresso.getPrice()}")
    }

    @Test
    fun `decorator test - double tea`() {
        val doubleTea = DoubleDrink(Tea())
        doubleTea.serve()
        println("price: R$ ${doubleTea.getPrice()}")
    }

    @Test
    fun `decorator test - expresso with milk`() {
        val milkExpresso = Milk(Expresso())
        milkExpresso.serve()
        println("price: R$ ${milkExpresso.getPrice()}")
    }

    @Test
    fun `decorator test - tea with milk`() {
        val milkTea = Milk(Tea())
        milkTea.serve()
        println("price: R$ ${milkTea.getPrice()}")
    }

    @Test
    fun `decorator test - double expresso with milk`() {
        val doubleMilkExpresso = DoubleDrink(Milk(Expresso()))
        doubleMilkExpresso.serve()
        println("price: R$ ${doubleMilkExpresso.getPrice()}")
    }

    @Test
    fun `decorator test - double tea with milk`() {
        val doubleMilkTea = DoubleDrink(Milk(Tea()))
        doubleMilkTea.serve()
        println("price: R$ ${doubleMilkTea.getPrice()}")
    }
}