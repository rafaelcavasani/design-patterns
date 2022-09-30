package com.design.patterns.structural.bridge

import com.design.patterns.structural.bridge.converters.CSVConverter
import com.design.patterns.structural.bridge.converters.JSONConverter
import com.design.patterns.structural.bridge.converters.XMLConverter
import com.design.patterns.structural.bridge.employees.ITGuy
import com.design.patterns.structural.bridge.employees.ProjectManager
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class BridgeTest {

    @Test
    fun `bridge test`() {
        val csvConverter = CSVConverter()
        val jsonConverter = JSONConverter()
        val xmlConverter = XMLConverter()

        val itGuy = ITGuy("it guy", 25, BigDecimal(1000))
        val projectManager = ProjectManager("project manager", 36, BigDecimal(5000))

        println(csvConverter.getEmployeeFormated(itGuy))
        println(csvConverter.getEmployeeFormated(projectManager))
        println(jsonConverter.getEmployeeFormated(itGuy))
        println(jsonConverter.getEmployeeFormated(projectManager))
        println(xmlConverter.getEmployeeFormated(itGuy))
        println(xmlConverter.getEmployeeFormated(projectManager))
    }
}