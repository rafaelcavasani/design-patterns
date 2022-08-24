package com.design.patterns.creational.factory_method.impl

import com.design.patterns.creational.factory_method.Phone

class Samsung: Phone {

    override fun call() {
        println("samsung call")
    }

    override fun getOS(): String {
        return "Android"
    }
}