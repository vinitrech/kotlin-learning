package com.example.operators

fun main() {
    val x = 10
    val y = 5

    val sum = x + y
    val subtraction = x - y
    val division = x / y
    val multiplication = x * y
    val module = x % y

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
}