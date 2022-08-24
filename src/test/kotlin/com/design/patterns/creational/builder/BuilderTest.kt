package com.design.patterns.creational.builder

import com.design.patterns.DesignPatternsApplication
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    classes = [DesignPatternsApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class BuilderTest {

    @Autowired
    lateinit var connectionDBBuilder: ConnectionDBBuilder

    @Test
    fun `test Builder pattern createMinimumMySqlConnection`() {
        val mySqlConnection = connectionDBBuilder.createMinimumMySqlConnection()
        assertEquals(mySqlConnection.dbType, "mySQL")
        assertEquals(mySqlConnection.username, "")
        assertEquals(mySqlConnection.password, "")
    }

    @Test
    fun `test Builder pattern createCompleteMySqlConnection`() {
        val mySqlConnection = connectionDBBuilder.createCompleteMySqlConnection()
        assertEquals(mySqlConnection.dbType, "mySQL")
        assertEquals(mySqlConnection.username, "root")
        assertEquals(mySqlConnection.password, "root")
    }

    @Test
    fun `test Builder pattern createMinimumOracleConnection`() {
        val mySqlConnection = connectionDBBuilder.createMinimumOracleConnection()
        assertEquals(mySqlConnection.dbType, "oracle")
        assertEquals(mySqlConnection.username, "")
        assertEquals(mySqlConnection.password, "")
    }

    @Test
    fun `test Builder pattern createCompleteOracleConnection`() {
        val mySqlConnection = connectionDBBuilder.createCompleteOracleConnection()
        assertEquals(mySqlConnection.dbType, "oracle")
        assertEquals(mySqlConnection.username, "oracle")
        assertEquals(mySqlConnection.password, "oracle")
    }

}