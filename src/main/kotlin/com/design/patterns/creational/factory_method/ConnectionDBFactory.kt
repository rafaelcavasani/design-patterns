package com.design.patterns.creational.factory_method

import com.design.patterns.creational.builder.ConnectionDB

interface ConnectionDBFactory {
    fun getConnection(type: String, category: String): ConnectionDB
}