package com.lannstark.lec10

class Cat(
    species: String
) : Animal(species, 4) {    // 상위 클래스의 생성자르 바로 호출해야 한다.

    // override 필수
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}