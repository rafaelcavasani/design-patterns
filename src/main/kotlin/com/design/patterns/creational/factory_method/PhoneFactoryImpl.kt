package com.design.patterns.creational.factory_method

import com.design.patterns.creational.builder.ConnectionDBBuilder
import com.design.patterns.creational.factory_method.impl.Iphone
import com.design.patterns.creational.factory_method.impl.Motorola
import com.design.patterns.creational.factory_method.impl.Samsung
import org.springframework.stereotype.Component

@Component
class PhoneFactoryImpl(
    private val connectionDBBuilder: ConnectionDBBuilder
) : PhoneFactory {

    override fun factory(type: PhoneTypeEnum): Phone {
        return when (type) {
            PhoneTypeEnum.IPHONE -> Iphone()
            PhoneTypeEnum.MOTOROLA -> Motorola()
            PhoneTypeEnum.SAMSUNG -> Samsung()
        }
    }

}