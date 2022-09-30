package com.design.patterns.behavioral.observer

class SubscriberOne: Subscriber {
    override fun alert(event: String) {
        println("Subscriber one has been alerted with event: $event")
    }
}