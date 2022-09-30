package com.design.patterns.structural.bridge.converters

import com.design.patterns.structural.bridge.employees.Employee

interface Converter {
    fun getEmployeeFormated(employee: Employee): String
}