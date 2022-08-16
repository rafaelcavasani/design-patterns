package com.design.patterns.creational.factory_method

import com.design.patterns.DesignPatternsApplication
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    classes = [DesignPatternsApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class FactoryMethodTest {

    @Autowired
    lateinit var connectionDBFactory: ConnectionDBFactory

    @Test
    fun `factory method test minimun MySQL`() {
        val type = "MySQL"
        val category = "minimum"
        val connectionDBFactory = connectionDBFactory.getConnection(type, category)
        Assertions.assertEquals(connectionDBFactory.dbType, "mySQL")
        Assertions.assertEquals(connectionDBFactory.username, "")
        Assertions.assertEquals(connectionDBFactory.password, "")
    }

    @Test
    fun `factory method test complete MySQL`() {
        val type = "MySQL"
        val category = "complete"
        val connectionDBFactory = connectionDBFactory.getConnection(type, category)
        Assertions.assertEquals(connectionDBFactory.dbType, "mySQL")
        Assertions.assertEquals(connectionDBFactory.username, "root")
        Assertions.assertEquals(connectionDBFactory.password, "root")
    }

    @Test
    fun `factory method test minimun ORACLE`() {
        val type = "ORACLE"
        val category = "minimum"
        val connectionDBFactory = connectionDBFactory.getConnection(type, category)
        Assertions.assertEquals(connectionDBFactory.dbType, "oracle")
        Assertions.assertEquals(connectionDBFactory.username, "")
        Assertions.assertEquals(connectionDBFactory.password, "")
    }

    @Test
    fun `factory method test complete ORACLE`() {
        val type = "ORACLE"
        val category = "complete"
        val connectionDBFactory = connectionDBFactory.getConnection(type, category)
        Assertions.assertEquals(connectionDBFactory.dbType, "oracle")
        Assertions.assertEquals(connectionDBFactory.username, "oracle")
        Assertions.assertEquals(connectionDBFactory.password, "oracle")
    }

}