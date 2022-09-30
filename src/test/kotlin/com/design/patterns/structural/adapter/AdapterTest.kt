package com.design.patterns.structural.adapter

import org.junit.jupiter.api.Test

class AdapterTest {

    @Test
    fun `test adapter`() {
        //it works because TV has HDMI port
        val computer = Computer()
        computer.connectPort(TV())

        //it needs the adapter
        computer.connectPort(HDMIToVGAAdapter(OldMonitor()))
    }
}