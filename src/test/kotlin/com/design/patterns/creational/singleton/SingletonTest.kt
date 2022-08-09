package com.design.patterns.creational.singleton

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingletonTest {

    @Test
    fun `get always the same instance`() {
        val dbConnection = ConnectionDBSingleton.getInstance()
        assertEquals(dbConnection.isConnected(), false)

        dbConnection.connect()
        val dbConnection1 = ConnectionDBSingleton.getInstance()
        assertEquals(dbConnection1.isConnected(), true)
        dbConnection1.disconnect()

        val dbConnection2 = ConnectionDBSingleton.getInstance()
        assertEquals(dbConnection2.isConnected(), false)
    }

}