package com.lannstark.lec15

fun main() {

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "MONDAY"

    mapOf(1 to "MONDAY", 2  to "TUESDAY")

    for (key in oldMap.keys) {
        print(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}
