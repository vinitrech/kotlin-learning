package com.example.loops

fun main() {
    var number = 0
    var number2 = 0

    // continue: stop the execution of the loop and fires the next iteration
    // break: stop the execution and quits it <- works with for loops also

    while (number < 10) {
        println(number)
        ++number
    }

    do { // runs at least 1 time
        println(number)
        ++number

    } while (number < 20)

    outer@ while (number2 < 20) { // Labels <- can only be used form inside loop to break outer loop
        ++number2

        while (number2 < 10) {
            println(number2)
            ++number2

            if (number2 == 5) break@outer
        }
    }
}