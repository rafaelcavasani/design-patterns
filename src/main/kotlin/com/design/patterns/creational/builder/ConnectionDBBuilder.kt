package com.design.patterns.creational.builder

interface ConnectionDBBuilder {
    fun createMinimumMySqlConnection(): ConnectionDB
    fun createCompleteMySqlConnection(): ConnectionDB
    fun createMinimumOracleConnection(): ConnectionDB
    fun createCompleteOracleConnection(): ConnectionDB
}