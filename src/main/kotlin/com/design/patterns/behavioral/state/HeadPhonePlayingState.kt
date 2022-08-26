package com.design.patterns.behavioral.state

class HeadPhonePlayingState : HeadPhoneState {
    companion object {
        private val instance = HeadPhonePlayingState()

        fun getInstance() = instance
    }

    override fun click(headPhone: HeadPhone) {
        headPhone.isPlaying = !headPhone.isPlaying
        headPhone.setState(HeadPhoneOnState.getInstance())
    }

    override fun longClick(headPhone: HeadPhone) {
        headPhone.isPlaying = false
        headPhone.isOn = false
        headPhone.setState(HeadPhoneOffState.getInstance())
    }
}