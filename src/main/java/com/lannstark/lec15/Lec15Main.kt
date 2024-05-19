package com.lannstark.lec15

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    // 배열의 값을 추가
    val plus = array.plus(300)

    // withIndex()를 사용하면, 인덱스와 값을 한 번에 가져올 수 있다.
    for ((idx, value) in plus.withIndex()) {
        println("$idx $value")
    }

    // 가변 (Mutable) 컬렉션 : 컬렉션에 element를 추가, 삭제할 수 있다.
    // 불변 컬렉션 : 컬렉션에 element를 추가, 삭제할 수 없다.

    // 불변 리스트 생성
    val numbers = listOf(100, 200)
//    val emptyList = emptyList<Int>()
    printNumbers(emptyList())

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        print("$idx $value")
    }

    // 가변 리스트 생성
    // 기본 구현체는 ArrayList
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)

    // 우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자


    // Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }


    /**
     * List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
     * List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
     * List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
     */

    /**
     * Java는 nullable 타입과 non-nullable 타입을 구분하지 않는다.
     * -> Kotlin 쪽의 컬렉션이 Java에서 호출되면 컬렉션 내용이 변할 수 있음을 감안해야 한다.
     * -> 아니면 코틀린 쪽에서 Collections.unmodifableXXX()를 활용하면 변경 자체를 막을 수는 있다.
     */
}

private fun printNumbers(number: List<Int>) {

}