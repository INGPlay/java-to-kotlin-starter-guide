package com.lannstark.lec14

fun main() {
    val dto1 = PersonDto("최태현", 100)
    val dto2 = PersonDto("최태현", 100)
    println(dto1 == dto2)
    println(dto1)
}

// data : equals, hashCode, toString을 자동으로 만들어준다.
data class PersonDto(
    val name: String,
    val age: Int,
) {
}