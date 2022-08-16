package com.design.patterns.creational.prototype


class Rectangle : Shape {
    private val width: Int
    private val height: Int

    constructor(width: Int, height: Int) : super(width, height) {
        this.width = width
        this.height = height
    }

    constructor(rectangle: Rectangle) : super(rectangle) {
        this.width = rectangle.width
        this.height = rectangle.height
    }

    override fun clone(): Shape {
        return Rectangle(this)
    }

    override fun getWidth() = this.width
    override fun getHeight() = this.height

}