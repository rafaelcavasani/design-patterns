package com.design.patterns.behavioral.template_method

abstract class ModelPersist {

    fun save(): ModelPersist {
        this.preSave()
        println("Save model in data base")
        this.postPersist()
        return this
    }

    fun update(model: ModelPersist): ModelPersist {
        this.prePersist()
        println("Update model in data base")
        this.postPersist()
        return this
    }

    open fun preSave() = Unit
    open fun prePersist() = Unit
    open fun postPersist() = Unit

}