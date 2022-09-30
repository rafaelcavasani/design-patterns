package com.design.patterns.structural.adapter

class Computer {
    private var port: HDMI? = null

    fun connectPort(screen: HDMI) {
        println("Connecting on HDMI port...")
        this.port = screen
    }

    fun sendImageAndSound(image: String, sound: String) {
        if (port == null) {
            println("Connect a HDMI cable first")
        } else {
            port?.setImage(image)
            port?.setSound(sound)
        }
    }


}