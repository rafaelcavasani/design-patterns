package com.design.patterns.behavioral.state

class HeadPhoneOffState: HeadPhoneState {
    companion object {
        private val instance = HeadPhoneOffState()

        fun getInstance() = instance
    }

    override fun click(headPhone: HeadPhone) {
        println("Do nothing")
    }

    override fun longClick(headPhone: HeadPhone) {
        headPhone.isOn = true
        headPhone.setState(HeadPhoneOnState.getInstance())
    }
}