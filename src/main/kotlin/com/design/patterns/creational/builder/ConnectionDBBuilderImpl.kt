package com.design.patterns.creational.builder

import org.springframework.stereotype.Component

@Component
class ConnectionDBBuilderImpl : ConnectionDBBuilder {

    override fun createMinimumMySqlConnection(): ConnectionDB {
        return ConnectionDB(
            dbType = "mySQL",
            url = "localhost",
            noSQL = false,
            port = 8232,
            dialect = "MySqlDialect",
            username = "",
            password = "",
            basename = "",
            encoding = "",
            jdbcSchema = ""
        )
    }

    override fun createCompleteMySqlConnection(): ConnectionDB {
        return ConnectionDB(
            dbType = "mySQL",
            url = "localhost",
            noSQL = false,
            port = 8232,
            dialect = "MySqlDialect",
            username = "root",
            password = "root",
            basename = "mysql",
            encoding = "base64",
            jdbcSchema = "MySQLSchema"
        )
    }

    override fun createMinimumOracleConnection(): ConnectionDB {
        return ConnectionDB(
            dbType = "oracle",
            url = "localhost",
            noSQL = false,
            port = 5432,
            dialect = "OracleDialect",
            username = "",
            password = "",
            basename = "",
            encoding = "",
            jdbcSchema = ""
        )
    }

    override fun createCompleteOracleConnection(): ConnectionDB {
        return ConnectionDB(
            dbType = "oracle",
            url = "localhost",
            noSQL = false,
            port = 5432,
            dialect = "OracleDialect",
            username = "oracle",
            password = "oracle",
            basename = "oracle",
            encoding = "base64",
            jdbcSchema = "OracleSchema"
        )
    }

}