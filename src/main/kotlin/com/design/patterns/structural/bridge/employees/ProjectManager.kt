package com.design.patterns.structural.bridge.employees

import java.math.BigDecimal

data class ProjectManager(
    override val name: String,
    override val age: Int,
    override val salary: BigDecimal
): Employee(name, age, salary)