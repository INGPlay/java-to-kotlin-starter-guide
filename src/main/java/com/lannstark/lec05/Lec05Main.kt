package com.lannstark.lec05

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0 이상이어야 합니다.")
    }
}

fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 0부터 100입니다.")
    }
}

/**
 * Java에서 if-else는 Statement이지만,
 * Kotlin에서는 Expression이다.
 * : Statement - 프로그램의 문장, 하나의 값으로 도출되지 않는다
 * : Expression - 하나의 값으로 도출되는 문장
 *
 * Kotlin에서는 if-else를 Expression으로 사용할 수 있기 때문에
 * 3항 연산자가 없다
 */
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("-1, 0, 1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수 입니다")
    }
}