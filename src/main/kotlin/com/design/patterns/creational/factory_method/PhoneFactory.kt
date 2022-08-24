package com.design.patterns.creational.factory_method

interface PhoneFactory {
    fun factory(type: PhoneTypeEnum): Phone
}