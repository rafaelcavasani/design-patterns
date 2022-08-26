package com.design.patterns.behavioral.template_method

import org.junit.jupiter.api.Test

class TemplateMethodTest {

    @Test
    fun `test user model template`() {
        val userModel = UserModelPersist()
        userModel.save()
    }

    @Test
    fun `test product model template`() {
        val productModel = ProductModelPersist()
        productModel.save()
    }

}