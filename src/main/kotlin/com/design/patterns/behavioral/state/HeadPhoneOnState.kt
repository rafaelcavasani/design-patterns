package com.design.patterns.behavioral.state

class HeadPhoneOnState: HeadPhoneState {
    companion object {
        private val instance = HeadPhoneOnState()

        fun getInstance() = instance
    }

    override fun click(headPhone: HeadPhone) {
        headPhone.isPlaying = !headPhone.isPlaying
        headPhone.setState(HeadPhonePlayingState.getInstance())
    }

    override fun longClick(headPhone: HeadPhone) {
        headPhone.isOn = false
        headPhone.setState(HeadPhoneOffState.getInstance())
    }
}