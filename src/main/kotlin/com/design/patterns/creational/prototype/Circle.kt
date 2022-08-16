package com.design.patterns.creational.prototype

class Circle : Shape {
    private val width: Int
    private val height: Int

    constructor(width: Int, height: Int) : super(width, height) {
        this.width = width
        this.height = height
    }

    constructor(circle: Circle) : super(circle) {
        this.width = circle.width
        this.height = circle.height
    }

    override fun clone(): Shape {
        return Circle(this)
    }

    override fun getWidth() = this.width
    override fun getHeight() = this.height

}