package com.design.patterns.behavioral.observer

class SubscriberOne: Subscriber {
    override fun alert() {
        println("Subscriber one has been alerted")
    }
}