package com.design.patterns.creational.abstract_factory.impl

import com.design.patterns.creational.abstract_factory.Certificates
import com.design.patterns.creational.abstract_factory.PhoneAbstract
import com.design.patterns.creational.abstract_factory.PhoneAbstractFactory

class MotorolaFactory(
    private val certificates: Certificates
) : PhoneAbstractFactory(certificates) {

    override fun factory(): PhoneAbstract {
        return MotorolaImpl(certificates = certificates)
    }

}