package com.design.patterns.creational.factory_method

import com.design.patterns.creational.builder.ConnectionDB
import com.design.patterns.creational.builder.ConnectionDBBuilder
import org.springframework.stereotype.Component

@Component
class ConnectionDBFactoryImpl(
    private val connectionDBBuilder: ConnectionDBBuilder
) : ConnectionDBFactory {

    override fun getConnection(type: String, category: String): ConnectionDB {
        return when (type) {
            "MySQL" -> {
                when (category) {
                    "minimum" -> connectionDBBuilder.createMinimumMySqlConnection()
                    else -> connectionDBBuilder.createCompleteMySqlConnection()
                }
            }

            "ORACLE" -> {
                when (category) {
                    "minimum" -> connectionDBBuilder.createMinimumOracleConnection()
                    else -> connectionDBBuilder.createCompleteOracleConnection()
                }
            }

            else -> throw RuntimeException("")
        }

    }


}