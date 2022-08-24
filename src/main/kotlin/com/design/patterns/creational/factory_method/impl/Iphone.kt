package com.design.patterns.creational.factory_method.impl

import com.design.patterns.creational.factory_method.Phone

class Iphone: Phone {

    override fun call() {
        println("iphone call")
    }

    override fun getOS(): String {
        return "iOS"
    }
}