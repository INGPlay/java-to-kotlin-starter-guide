package com.lannstark.lec12

fun main() {
    moveSomething(object  : Movable {
        override fun move() {
            println("이동합니다.")
        }

        override fun fly() {
            println("날아갑니다.")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}