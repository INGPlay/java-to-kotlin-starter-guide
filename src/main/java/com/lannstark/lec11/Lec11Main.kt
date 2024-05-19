package com.lannstark.lec11

/**
 * public : 기본값. 어디서든 접근할 수 있다.
 * protected : 파일(최상단)에는 사용 불가능
 * internal : 같은 모듈에서만 접근 가능
 * private : 같은 파일 내에서만 접근 가능
 */

val a = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

/**
 * Interal은 바이트 코드 상 public이 된다.
 * 때문에 Java 코드에서는 Kotlin 모듈의 interanl 코드를 가져올 수 있다.
 *
 * Kotlin의 protected와 Java의 protected는 다르다.
 * Java는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다.
 */
class Cat (
    internal val name: String,
    val owner : String,
    _price : Int
){
    var price = _price
        private set
}