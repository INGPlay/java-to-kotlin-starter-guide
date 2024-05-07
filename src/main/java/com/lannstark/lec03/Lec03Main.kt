package com.lannstark.lec03

fun main() {
    val number1 = 3
    // 코틀린은 암시적인 타입캐스팅 불가
    // val number2 = number1
    val number2 : Long = number1.toLong()

    // 변수가 nullable 이라면 적절한 처리가 필요하다
    val number3 : Int? = 3
    val number4 : Long = number3?.toLong() ?: 0L

    println(Person("", 100))

    /**
     * Any
     * - Java의 Object 역할 (모든 객체의 최상위 타입)
     * - 모든 Primitive Type의 최상의 타입도 Any이다
     * - Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현
     * - Any에 equals / hashCode / toString 존재
     */

    /**
     * Unit
     * - Unit은 Java의 void와 동일한 역할
     * - (살짝 어려운 내용) void와 다르게 Unit은 그 자체로 타입 인자로 사용가능하다.
     * - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미, 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
     */

    /**
     * Nothing
     * - Nothing은 함수가 정상적으로 끝나지 않았따는 사실을 표현하는 역할
     * - 무조건 예외를 반한하는 함수 / 무한루프 함수 등
     */

    val person = Person("최태현", 100)
    println("이름 : ${person.name}")

    val name = "최태현"
    println("이름 : $name")

    val str = """
        ABC
        EFG
        $name
        ${person.name}
    """.trimIndent()

    println(str)

    println(str[0])
    println(str[2])
}

fun printAgeIfPerson(obj : Any?) {
    /// is -> instanceof
    if (obj is Person) {
    // if (obj !is Person) {
//        val person = obj as Person        // 생략 가능
        println(obj.age)
    }
}