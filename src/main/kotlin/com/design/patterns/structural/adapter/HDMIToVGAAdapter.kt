package com.design.patterns.structural.adapter

class HDMIToVGAAdapter(
    private val vga: VGA
): HDMI {

    override fun setImage(image: String) {
        vga.setImage(image)
    }

    override fun setSound(sound: String) {
        //do nothing
        println("VGA does not work with sound")
    }

}