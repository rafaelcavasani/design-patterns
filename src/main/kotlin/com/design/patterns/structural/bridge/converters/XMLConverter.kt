package com.design.patterns.structural.bridge.converters

import com.design.patterns.structural.bridge.employees.Employee

class XMLConverter : Converter {
    override fun getEmployeeFormated(employee: Employee): String {
        return "<employee><name>${employee.name}</name><age>${employee.age}</age><salary>${employee.salary}</salary></employee>"
    }
}