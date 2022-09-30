package com.design.patterns.behavioral.observer

interface Subscriber {
    fun alert(event: String)
}