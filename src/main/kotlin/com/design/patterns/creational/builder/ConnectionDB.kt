package com.design.patterns.creational.builder

data class ConnectionDB(
    val dbType: String,
    val url: String,
    val noSQL: Boolean,
    val port: Int,
    val dialect: String,
    val username: String,
    val password: String,
    val basename: String,
    val encoding: String,
    val jdbcSchema: String
)