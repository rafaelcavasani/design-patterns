package com.design.patterns.creational.abstract_factory

abstract class PhoneAbstractFactory(
    certificates: Certificates
) {
    abstract fun factory(): PhoneAbstract
}