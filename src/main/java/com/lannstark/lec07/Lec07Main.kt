package com.lannstark.lec07

fun main() {
    FilePrinter().readFile()
}

// try catch 구문은 Java와 문법적으로 동일하다 (finally도 동일)
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}

// Kotlin에서는 try catch 구문 역시 expression이다
fun pareseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}


