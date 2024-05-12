package com.lannstark.lec08

fun main() {
    repeat("Hello World", 3, true)
    repeat("Hello World")

    repeat("Hello World", useNewLine = false)
    
    printNameAndGender(name = "이름", gender = "FEMALE")
    // Kotlin에서 Java 함수를 가져다 사용할 때는
    // named argument를 사용할 수 없다


    printAll("A", "B", "C")

    // 배열을 바로 넣는 대신 스프레드 연산자(*)를 붙여주어야 한다
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for(i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// ...을 타입 뒤에 쓰는 대신 제일 앞에 vararg를 적어주어야 한다
fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}