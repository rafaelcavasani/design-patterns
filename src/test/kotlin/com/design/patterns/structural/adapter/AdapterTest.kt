package com.design.patterns.structural.adapter

import org.junit.jupiter.api.Test

class AdapterTest {

    @Test
    fun `test adapter`() {
        //it works because TV has HDMI port
        val computer = Computer()
        computer.connectPort(TV())
        computer.sendImageAndSound("image", "sound")

        //it needs the adapter
        computer.connectPort(HDMIToVGAAdapter(OldMonitor()))
        computer.sendImageAndSound("image", "sound")
    }
}