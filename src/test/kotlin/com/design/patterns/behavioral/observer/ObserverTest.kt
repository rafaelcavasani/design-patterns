package com.design.patterns.behavioral.observer

import org.junit.jupiter.api.Test

class ObserverTest {

    @Test
    fun `test if all subscribers has been alerted`() {
        val observer = Observer(mutableListOf())
        observer.subscribe(SubscriberOne())
        observer.subscribe(SubscriberTwo())

        observer.alertAllSubscribers("observerEvent")
    }

}