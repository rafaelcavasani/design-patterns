package com.design.patterns.structural.adapter

class OldMonitor: VGA {

    override fun setImage(image: String) {
        println("this is your video: $image")
    }

}