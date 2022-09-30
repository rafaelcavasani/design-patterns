package com.design.patterns.structural.memento

class Memento {

    private val states: MutableList<String> = mutableListOf()
    private var currentState: String = ""

    fun addState(state: String) {
        states.add(state)
        currentState = state
    }

    fun restoreState(index: Int) {
        currentState = states[index]
    }

    fun getCurrentState() = currentState

}