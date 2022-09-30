package com.design.patterns.structural.composite

class File(
    private val name: String
): FileSystemItem {

    override fun print(structure: String) {
        println("$structure$name")
    }
}