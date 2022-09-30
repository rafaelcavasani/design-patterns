package com.design.patterns.behavioral.observer

class SubscriberTwo: Subscriber {
    override fun alert(event: String) {
        println("Subscriber two has been alerted with event: $event")
    }
}