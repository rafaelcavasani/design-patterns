package com.design.patterns.behavioral.observer

class SubscriberTwo: Subscriber {
    override fun alert() {
        println("Subscriber two has been alerted")
    }
}