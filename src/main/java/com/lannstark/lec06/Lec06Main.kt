package com.lannstark.lec06

fun main() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // 1..3 : 1부터 3까지
    for (i in 1..3) {
        println(i)
    }

    // 3부터 1까지 출력
    for (i in 3 downTo 1) {
        println(i)
    }

    // 2칸씩 올라가는 경우
    for (i in 1..5 step 2) {
        println(i)
    }

    /**
     * 3 downTo 1 : 시작값3, 끝값 1, 공차가 -1인 등차수열
     * 1..5 step 2 : 시작값 1, 끝값 5, 공차가 2인 등차수열
     *
     * downTo, Step도 함수이다 (중위함수 호출)
     * - 변수.함수(argument) 대신 변수 함수이름 argument
     */

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}