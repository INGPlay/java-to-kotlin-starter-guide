package com.lannstark.lec16

fun main() {
    val str = "ABC"
    // 원래 String에 있는 함수처럼 사용할 수 있다
    println(str.lastChar())

    // 멤버함수가 우선적으로 호출된다.
    // 확장함수를 만들었지만, 다른 기능의 똑같은 멤버함수가 생기면 오류가 발생할 수 있다.
    val person = Person("A", "B", 100)
    person.nextYearAge()

    // 해당 변수의 현재 타입
    // 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.
    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive()  // Train의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive()  // Srt의 확장함수

    3.add(4)

    3.add2(4)
    3 add2 4
}

// 확장함수
// 확장함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다
fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int{
    println("확장 함수")
    return this.age + 1
}

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price > 10_000
}

class Srt : Train("SRT", 10_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price > 10_000
}

fun Int.add(other: Int): Int {
    return this + other
}

// 중위 함수 만들기
// Infix는 멤버함수에도 붙일 수 있다
infix fun Int.add2(other: Int): Int {
    return this + other
}

// inline
// - 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
// - 하지만 inline 함수의 사용은 성능 측정과 함께 신중하게 사용되어야 한다
inline fun Int.add3(other: Int): Int {
    return this + other
}