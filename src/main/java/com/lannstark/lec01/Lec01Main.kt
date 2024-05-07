package com.lannstark.lec01

fun main() {

    // 가변
    var number1 = 10L
    number1 = 20L
    // 불변
    val number2 = 10L
    // number2 = 20L

    var number3 : Long = 10L
    val number4 : Long = 10L

    // 모든 변수는 val, 필요한 경우 var로 변경

    var number5 = 10L

    // 변수에 null을 넣고 싶다면 타입에 ?를 표시한다.
    var number6: Long? = 1_000L
    number6 = null

    // 객체
    var Person = Person("이름")
}