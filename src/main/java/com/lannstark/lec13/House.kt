package com.lannstark.lec13

fun main() {

}

class House (
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    // 기본적으로 바깥 클래스 참조를 하지 않는다. (기본적으로 static class)
    // Java의 내부 클래스
    inner class LivingRoom(
        private val area : Double
    ) {
        val address: String
            get() = this@House.address
    }
}