package com.design.patterns.behavioral.observer


class Observer(
    private val subscribers: MutableList<Subscriber>
) {

    fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    fun alertAllSubscribers(event: String) {
        subscribers.forEach {
            it.alert(event)
        }
    }

}