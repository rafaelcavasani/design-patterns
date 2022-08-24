package com.design.patterns.creational.factory_method.impl

import com.design.patterns.creational.factory_method.Phone

class Motorola: Phone {

    override fun call() {
        println("motorola call")
    }

    override fun getOS(): String {
        return "Android"
    }
}