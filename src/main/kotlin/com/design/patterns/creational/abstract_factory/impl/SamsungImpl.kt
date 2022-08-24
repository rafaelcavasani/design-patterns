package com.design.patterns.creational.abstract_factory.impl

import com.design.patterns.creational.abstract_factory.Certificates
import com.design.patterns.creational.abstract_factory.PhoneAbstract

class SamsungImpl(certificates: Certificates) : PhoneAbstract(certificates) {
    override fun call() {
        println("samsung call")
    }

    override fun getOS(): String {
        return "Android"
    }
}