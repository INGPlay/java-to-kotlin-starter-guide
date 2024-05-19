package com.lannstark.lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    // 람다를 만드는 방법 1
    val isApple : (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2 : (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
    filterFruits(fruits, isApple2)

    // Kotlin에서는 함수는 1급 시민이다. (Java에서는 2급 시민)
    filterFruits(fruits, fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    })
    // 마지막 파라미터가 함수 인 경우, 소괄호 밖에 람다 사용 가능
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    // 람다를 작성할 대, 람다의 파라미터를 it 으로 직접 참조할 수 있다.
    filterFruits(fruits) { it.name == "사과" }

    // 람다를 여러줄 작성할 수 있고, 마지막 줄의 결과가 람다의 반환값이다.
    filterFruits(fruits) { fruit ->
        println("사과만 받는다..!!")
        fruit.name == "사과"
    }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {

//    val results = mutableListOf<Fruit>()
//    for (fruit in fruits) {
//        if (filter(fruit)) {
//            results.add(fruit)
//        }
//    }
//
//    return results

    return fruits.filter(filter)
}