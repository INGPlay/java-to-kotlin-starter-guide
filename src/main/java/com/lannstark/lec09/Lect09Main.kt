package com.lannstark.lec09

fun main() {
    val person = Person("최태현")
    println(person.name)
//    person.age = 10
    println(person.age)

    val javaPerson = JavaPerson("최태현", 100)
    println(javaPerson.name)
    javaPerson.age = 10
    println(javaPerson.age)

    val person1 = Person()
}