package com.design.patterns.structural.bridge.employees

import java.math.BigDecimal

open class Employee(
    open val name: String,
    open val age: Int,
    open val salary: BigDecimal
)
