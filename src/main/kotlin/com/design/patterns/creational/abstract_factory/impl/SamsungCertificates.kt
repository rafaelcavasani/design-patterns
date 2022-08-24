package com.design.patterns.creational.abstract_factory.impl

import com.design.patterns.creational.abstract_factory.Certificates

class SamsungCertificates : Certificates {
    override fun getCertificates(): String {
        return "Samsung certificates"
    }
}