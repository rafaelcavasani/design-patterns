package com.design.patterns.behavioral.template_method

class UserModelPersist: ModelPersist() {

    override fun preSave() {
        println("Pre save function")
    }

    override fun prePersist() {
        println("Pre persist function")
    }

    override fun postPersist() {
        println("Post persist function")
    }

}