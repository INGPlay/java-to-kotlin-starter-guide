package com.lannstark.lec10

class Penguin(species: String
) : Animal(species, 2), Swimable, Flayable {

    private val wingCount : Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }

    // 프로퍼티를 상속 받아 오버라이딩할 때 꼭 open을 붙여줘야 한다.
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        super<Swimable>.act()
        super<Flayable>.act()
    }

    override val swimAbility: Int
        get() = 3
}