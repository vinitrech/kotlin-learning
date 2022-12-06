package com.example.functions

import kotlin.math.max

// Functions can only return 1 value, and return one time

fun main() {
    sayHello("Vinicius", 24)

    val maxValue = getMaxValue(6, 1)

    println("max value is $maxValue")

    returnBeforeEnd(maxValue)
    
    println("maxValue times 2: ${oneLineNumber(maxValue)}")
}

fun sayHello(
    name: String, age: Int
) { // Values of arguments CANNOT be altered, they come in as "val" variables
    println("Hello, $name! Congrats for your $age years birthday!")
}

fun getMaxValue(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun returnBeforeEnd(a: Int) {
    if (a > 5) {
        println("$a is bigger than 5")
        return
    }

    if (a > 5) {
        println("$a is bigger than 5 again")
    }
}

fun oneLineNumber(number: Int) = number * 2