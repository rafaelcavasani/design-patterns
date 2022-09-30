package com.design.patterns.structural.adapter

class TV: HDMI {

    override fun setImage(image: String) {
        println("this is your video: $image")
    }

    override fun setSound(sound: String) {
        println("this is your sound: $sound")
    }

}