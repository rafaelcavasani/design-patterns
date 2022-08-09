package com.design.patterns.creational.builder

import org.junit.jupiter.api.Test

class BuilderTest {

    @Test
    fun `test Builder pattern`() {
        val mySqlConnection = ConnectionDBBuilderImpl().createMinimumMySqlConnection()
    }

}