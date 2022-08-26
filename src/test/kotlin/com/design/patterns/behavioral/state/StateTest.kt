package com.design.patterns.behavioral.state

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StateTest {

    @Test
    fun `test turn on head phone`() {
        val headPhone = HeadPhone()

        Assertions.assertFalse(headPhone.isOn)
        assert(headPhone.getState() is HeadPhoneOffState)

        headPhone.onClick()
        Assertions.assertFalse(headPhone.isOn)
        assert(headPhone.getState() is HeadPhoneOffState)

        headPhone.onLongClick()
        Assertions.assertTrue(headPhone.isOn)
        assert(headPhone.getState() is HeadPhoneOnState)

        headPhone.onClick()
        Assertions.assertTrue(headPhone.isPlaying)
        assert(headPhone.getState() is HeadPhonePlayingState)

        headPhone.onClick()
        Assertions.assertFalse(headPhone.isPlaying)
        assert(headPhone.getState() is HeadPhoneOnState)
        
        headPhone.onLongClick()
        Assertions.assertFalse(headPhone.isOn)
        assert(headPhone.getState() is HeadPhoneOffState)
    }

}