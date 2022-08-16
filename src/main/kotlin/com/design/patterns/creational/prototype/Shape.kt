package com.design.patterns.creational.prototype

abstract class Shape {

    private val width: Int
    private val height: Int

    constructor(width: Int, y: Int) {
        this.width = width
        this.height = y
    }

    constructor(source: Shape) {
        this.width = source.width
        this.height = source.height
    }

    abstract fun clone(): Shape
    abstract fun getWidth(): Int
    abstract fun getHeight(): Int

}