package com.lannstark.lec05

import java.lang.IllegalArgumentException

fun validationScoreISNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String{
    return if(score >= 50){
        "P"
    }else {
        "F"
    }
}

fun getGrage(score:Int): String{
    if (score >= 90) {
        return "A"
    }
    else {
        return "B"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89-> "B"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean{
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int){
    when(number){
        1,0,-1 -> println("어디서 많이 본 숫자입니다")
        else -> "1,0,-1이 아닙니다."
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number == 0 -> println("주어진 숫자는 0입니다.")
        number == 0 -> println("주어진 숫자는 0입니다.")
    }
}