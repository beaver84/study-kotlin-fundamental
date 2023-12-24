package com.lannstark.lec10

class Penguin(
    species: String
) : Animal(species, 2), Swimmable, Flyable{

    private val wingCount:Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }

    override  val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }
}