package com.design.patterns.creational.abstract_factory.impl

import com.design.patterns.creational.abstract_factory.Certificates

class MotorolaCertificates : Certificates {
    override fun getCertificates(): String {
        return "Motorola certificates"
    }
}