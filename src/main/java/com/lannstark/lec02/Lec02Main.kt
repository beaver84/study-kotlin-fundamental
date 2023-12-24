package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main() {
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw  IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}