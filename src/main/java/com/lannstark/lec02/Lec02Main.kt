package com.lannstark.lec02

fun main() {
    val str: String? = "ABC"
    println(str?.length)

    // Safe Call ( ?. )
    // null이 아니면 실행하고, null이면 실행하지 않는다.
    // str.length // 불가능
    str?.length // 가능
    
    // Elvis 연산자
    // 앞의 연산 결과가 null이면 뒤의 값을 사용
    str?.length ?: 0

    val person = Person("공부하는 개발자")
    startsWithA1(person.name)
}

// 1. str이 null일 경우 Exception을 낸다.
fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    } else {
//        return str.startsWith("A")
//    }
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

// 2. str이 null일 경우 null을 반환한다.
fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

// 3. str이 null일 경우 false를 반환한다.
fun startsWithA3(str: String?): Boolean {
//    return str?.startsWith("A")
    return str?.startsWith("A") ?: false
}

// nullable 타입이지만, 아무리 생각해도 null이 될 수 없는 경우 ( !!. )
// null이 들어오면 NullPointerException이 나옴
fun startsWithNotNullable(str: String?): Boolean {
    return str!!.startsWith("A")
}