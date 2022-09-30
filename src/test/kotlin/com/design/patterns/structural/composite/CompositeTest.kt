package com.design.patterns.structural.composite

import org.junit.jupiter.api.Test

class CompositeTest {

    @Test
    fun `composite test`() {
        val file1 = File("File1.txt")
        val file2 = File("File2.txt")
        val file3 = File("File3.txt")
        val file4 = File("File4.txt")
        val folder1 = Folder("folder1", listOf(file1))
        val folder2 = Folder("folder2", listOf(folder1, file1))
        val folder3 = Folder("folder3", listOf(folder1, folder2, file1, file2, file3, file4))

        println("------ files -------")
        file1.print("")
        file2.print("")
        file3.print("")
        file4.print("")
        println("------ folder 1 -------")
        folder1.print("")
        println("------ folder 2 -------")
        folder2.print("")
        println("------ folder 3 -------")
        folder3.print("")
    }

}