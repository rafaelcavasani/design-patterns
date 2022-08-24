package com.design.patterns.creational.abstract_factory

import com.design.patterns.creational.factory_method.Phone

abstract class CertificatesAbstractFactory() {
    abstract fun factory(): Phone
}