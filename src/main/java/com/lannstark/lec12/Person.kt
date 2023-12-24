package com.lannstark.lec12

fun main() {
    moveSomething(object : Movable{
        override fun move() {
            println("움직인다")
        }

        override fun fly() {
            println("난다~~")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}