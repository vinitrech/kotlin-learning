package com.example.vararg

fun main() {
    println(sum(5, 6, 7, 8, 9))
}

fun sum(vararg numbers: Int): Int {
    var result: Int = 0

    for (number in numbers) {
        result += number
    }

    return result
}