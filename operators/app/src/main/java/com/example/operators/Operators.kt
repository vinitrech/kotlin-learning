package com.example.operators

fun main() {
    val x = 10
    val y = 5

    val sum = x + y
    val subtraction = x - y
    val division = x / y
    val multiplication = x * y
    val module = x % y

    println("Type check: ${sum is Int}") // "is" check the type of any variable

    println("Sum: $sum")
    println("$x + $y: ${x + y}\n")

    println("Subtraction: $subtraction")
    println("$x - $y: ${x - y}\n")

    println("Division: $division")
    println("$x / $y: ${x / y}\n")

    println("Multiplication: $multiplication")
    println("$x * $y: ${x * y}\n")

    println("Module: $module")
    println("$x % $y: ${x % y}\n")

    //Bitwise operators
    println("OR: ${x or y}")
    println("AND: ${x and y}")
    println("XOR: ${x xor y}")

    //Bit-shift operators
    println("INVERT ALL BITS: ${x.inv()}")
    println("SHIFT LEFT 5 TIMES: ${x shl 5}")
    println("SHIFT RIGHT 5 TIMES: ${x shr 5}")
    println("UNSIGNED SHIFT RIGHT 5 TIMES: ${x ushr 5}")

    var result = x + y

    result += 1
    result -= 1
    result *= 1
    result /= 1
    result %= 1
    result++ // returns the value before increment
    ++result // increment the value then returns <- prefer this way

    /*
    * random block comment
    * */

    //Boolean operators
    println(result >= 2)
    println(result <= 2)
    println(result == 2)
    println(result != 2)
    println(result !== 2)
    println(result === 2)// identical operator - checks value and type of variable
    println(result > 2)
    println(result < 2)
    println(!true)
    println(!false)
    println(true && false)
    println(true || false)
}