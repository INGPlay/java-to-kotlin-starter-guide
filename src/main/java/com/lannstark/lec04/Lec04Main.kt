package com.lannstark.lec04

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("money1이 money2보다 더 큽니다.")
    }

    /**
     * Java에서는 동일성에 ==를 사용, 동등성에 equals를 직접 호출
     */

    /**
     * Kotlin에서는 동일성에 ===를 사용, 동등성에 ==를 호출
     * ==를 사용하면 간접적으로 equals를 호출해준다.
     */

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    // 값이 같다
    println(money3 == money5)

    // 해쉬값이 같다
    println(money3 === money5)

    /**
     * in / !in
     * - 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다
     *
     * a..b
     * - a부터 b까지의 범위 객체를 생성한다
     *
     * a[i]
     * - a에서 특정 Index i로 값을 가져온다
     *
     * a[i]] = b
     * - a의 특정 index i에 b를 넣는다
     */

    // Operator 정의
    val money6 = KotlinMoney(1_000L)
    val money7 = KotlinMoney(2_000L)
    println(money6 + money7)
}