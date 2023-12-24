package com.lannstark.lec15

fun main() {

    val array = arrayOf(100, 200)

//    for (i in array.indices) {
//        println("${i} ${array[i]}")
//    }

//    for ((idx,value) in array.withIndex()) {
//        println("$idx $value")
//    }

//    val numbers = listOf(100, 200)
//
//    println(numbers[0])
//
//    for (number in numbers) {
//        println(number)
//    }
//
//    for ((idx, value) in numbers.withIndex()) {
//        println("${idx} ${value}")
//    }

//   val numbers = setOf(100, 100, 200)
//
//    for (number in numbers) {
//        println(number)
//    }
//
//    for ((index, number) in numbers.withIndex()) {
//        println("$index $number")
//    }

//    val oldMap = mutableMapOf<Int, String>()
//    oldMap[1] = "MONDAY"
//    oldMap[2] = "MONDAY"

    val oldMap = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        print(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

