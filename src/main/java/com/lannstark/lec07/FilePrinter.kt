package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    /**
     * throws 구문이 없다
     *
     * Kotlin에서는 Checked Exception과
     * Unchecked Exception을 구분하지 않는다
     *
     * 모두 Unchecked Exception이다
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File("${currentFile.absoluteFile}/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // try with resources 대신 use
    fun readFile2(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}