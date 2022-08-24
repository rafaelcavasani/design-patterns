package com.design.patterns.creational.abstract_factory

import com.design.patterns.DesignPatternsApplication
import com.design.patterns.creational.abstract_factory.impl.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    classes = [DesignPatternsApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class AbstractFactoryTest {

    @Test
    fun `test iphone abstract factory`() {
        val iosCertificate = IOSCertificates()
        val iphone = IphoneFactory(iosCertificate).factory()
        assert(iphone is IphoneImpl)
        assertEquals(iphone.getOS(), "iOS")
        assertEquals(iphone.getCertificate(), "Apple certificates")
    }

    @Test
    fun `test motorola abstract factory`() {
        val motorolaCertificate = MotorolaCertificates()
        val motorola = MotorolaFactory(motorolaCertificate).factory()
        assert(motorola is MotorolaImpl)
        assertEquals(motorola.getOS(), "Android")
        assertEquals(motorola.getCertificate(), "Motorola certificates")
    }

    @Test
    fun `test samsung abstract factory`() {
        val samsungCertificate = SamsungCertificates()
        val samsung = SamsungFactory(samsungCertificate).factory()
        assert(samsung is SamsungImpl)
        assertEquals(samsung.getOS(), "Android")
        assertEquals(samsung.getCertificate(), "Samsung certificates")
    }

}