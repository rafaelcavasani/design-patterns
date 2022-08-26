package com.design.patterns.behavioral.state

class HeadPhone(
    private var state: HeadPhoneState = HeadPhoneOffState(),
    var isOn: Boolean = false,
    var isPlaying: Boolean = false
) {

    fun onClick() {
        state.click(this)
    }

    fun onLongClick() {
        state.longClick(this)
    }

    fun getState() = state

    fun setState(headPhoneState: HeadPhoneState) {
        state = headPhoneState
    }
}