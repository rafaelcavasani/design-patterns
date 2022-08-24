package com.design.patterns.creational.abstract_factory.impl

import com.design.patterns.creational.abstract_factory.Certificates
import com.design.patterns.creational.abstract_factory.PhoneAbstract

class MotorolaImpl(certificates: Certificates) : PhoneAbstract(certificates) {
    override fun call() {
        println("motorola call")
    }

    override fun getOS(): String {
        return "Android"
    }
}