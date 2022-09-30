package com.design.patterns.structural.bridge.converters

import com.design.patterns.structural.bridge.employees.Employee

class CSVConverter : Converter {
    override fun getEmployeeFormated(employee: Employee): String {
        return "name,age,salary \n" +
                "${employee.name},${employee.age},${employee.salary}"
    }
}