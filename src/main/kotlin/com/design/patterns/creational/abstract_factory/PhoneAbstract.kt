package com.design.patterns.creational.abstract_factory

abstract class PhoneAbstract(
    open val certificates: Certificates
) {
    abstract fun call()
    abstract fun getOS(): String
    fun getCertificate(): String {
        return certificates.getCertificates()
    }
}