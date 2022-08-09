package com.design.patterns.creational.singleton

class ConnectionDBSingleton private constructor() {

    companion object {
        private val instance: ConnectionDBSingleton? = null
        private var connected: Boolean = false

        fun getInstance(): ConnectionDBSingleton {
            return instance ?: ConnectionDBSingleton()
        }
    }

    fun connect() {
        connected = true
    }

    fun disconnect() {
        connected = false
    }

    fun isConnected(): Boolean {
        return connected
    }

}