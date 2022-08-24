package com.design.patterns.creational.abstract_factory.impl

import com.design.patterns.creational.abstract_factory.Certificates
import com.design.patterns.creational.abstract_factory.PhoneAbstract

class IphoneImpl(override val certificates: Certificates) : PhoneAbstract(certificates) {
    override fun call() {
        println("iphone call")
    }

    override fun getOS(): String {
        return "iOS"
    }
}