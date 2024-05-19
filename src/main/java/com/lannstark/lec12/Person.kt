package com.lannstark.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
){
    // static 대신 companion object 사용
    companion object Factory : Log {
        private const val MIN_AGE = 1

        /**
         * Java에서 Kotlin companion object를 사용하려면
         * @JvmStatic을 붙여야 한다.
         */
        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory 에요.")
        }
    }
}

// 싱글톤
object Singleton {
    var a: Int = 0
}