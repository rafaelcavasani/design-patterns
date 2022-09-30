package com.design.patterns.structural.decorator

abstract class DrinkDecorator(
    private val drink: Drink
) : Drink