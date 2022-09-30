package com.design.patterns.structural.memento

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MementoTest {

    @Test
    fun `test memento`() {
        val memento = Memento()
        Assertions.assertEquals(memento.getCurrentState(), "")

        memento.addState("state 1")
        Assertions.assertEquals(memento.getCurrentState(), "state 1")

        memento.addState("state 2")
        Assertions.assertEquals(memento.getCurrentState(), "state 2")

        memento.addState("state 3")
        Assertions.assertEquals(memento.getCurrentState(), "state 3")

        memento.restoreState(0)
        Assertions.assertEquals(memento.getCurrentState(), "state 1")

        memento.restoreState(1)
        Assertions.assertEquals(memento.getCurrentState(), "state 2")

        memento.restoreState(2)
        Assertions.assertEquals(memento.getCurrentState(), "state 3")
    }
}