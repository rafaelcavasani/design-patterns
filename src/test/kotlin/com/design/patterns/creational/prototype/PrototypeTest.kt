package com.design.patterns.creational.prototype

import com.design.patterns.DesignPatternsApplication
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(
    classes = [DesignPatternsApplication::class],
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class PrototypeTest {

    @Test
    fun `run prototype circle`() {
        val circle = Circle(10, 12)
        val copy = circle.clone()
        Assertions.assertEquals(circle.getWidth(), copy.getWidth())
        Assertions.assertEquals(circle.getHeight(), copy.getHeight())
    }

    @Test
    fun `run prototype rectangle`() {
        val rectangle = Rectangle(10, 12)
        val copy = rectangle.clone()
        Assertions.assertEquals(rectangle.getWidth(), copy.getWidth())
        Assertions.assertEquals(rectangle.getHeight(), copy.getHeight())
    }

}