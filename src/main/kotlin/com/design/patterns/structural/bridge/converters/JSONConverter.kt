package com.design.patterns.structural.bridge.converters

import com.design.patterns.structural.bridge.employees.Employee

class JSONConverter: Converter {
    override fun getEmployeeFormated(employee: Employee): String {
        return "{\"name\": ${employee.name}, \"age\": ${employee.age}, \"salary\": ${employee.salary}}"
    }
}