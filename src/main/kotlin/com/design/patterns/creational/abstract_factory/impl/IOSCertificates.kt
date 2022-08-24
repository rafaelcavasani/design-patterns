package com.design.patterns.creational.abstract_factory.impl

import com.design.patterns.creational.abstract_factory.Certificates

class IOSCertificates : Certificates {
    override fun getCertificates(): String {
        return "Apple certificates"
    }
}