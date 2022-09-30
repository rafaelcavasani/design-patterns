package com.design.patterns.structural.composite

class Folder(
    private val name: String,
    private val children: List<FileSystemItem>
) : FileSystemItem {

    override fun print(structure: String) {
        println("$structure$name")
        for (child in children) {
            child.print("$structure | ")
        }
    }
}