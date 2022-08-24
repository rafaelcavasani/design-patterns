package com.design.patterns.creational.factory_method

import com.design.patterns.DesignPatternsApplication
import com.design.patterns.creational.factory_method.impl.Iphone
import com.design.patterns.creational.factory_method.impl.Motorola
import com.design.patterns.creational.factory_method.impl.Samsung
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    classes = [DesignPatternsApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class FactoryMethodTest {

    @Autowired
    lateinit var phoneFactory: PhoneFactory

    @Test
    fun `iphone factory method test`() {
        val type = PhoneTypeEnum.IPHONE
        val phone = phoneFactory.factory(type)
        assert(phone is Iphone)
    }

    @Test
    fun `samsung factory method test`() {
        val type = PhoneTypeEnum.SAMSUNG
        val phone = phoneFactory.factory(type)
        assert(phone is Samsung)
    }

    @Test
    fun `motorola factory method test`() {
        val type = PhoneTypeEnum.MOTOROLA
        val phone = phoneFactory.factory(type)
        assert(phone is Motorola)
    }

}