package com.lannstark.lec09

class Person (  // 주 생성자 : 반드시 존재해야 한다.
    name: String = "홍길동",
    var age: Int = 1
){

    var name = name
        // name을 호출하면 get()이 호출되면서 무한루프가 발생됨
        // 그래서 field 를 사용
//        get() = name.uppercase()
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }

    val appercaseName: String
        get() = name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 부 생성자 : 있을 수도 있고 없을 수도 있다.
    // 부 생성자을 사용하기 보다는 기본값이나 정적 팩토리 패턴을 추천
//    constructor(name: String) : this(name, 1) {
//        println("첫 번째 부 생성자")
//    }
//
//    constructor() : this("홍길동") {
//        println("두 번째 부 생성자")
//    }


//    fun isAudit() : Boolean {
//        return this.age >= 20
//    }
    // 함수 대신 프로퍼티를 만들 수 있다
    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
}