package com.example.functions

fun main() {
    val max = getMax(5, 10)
    val maxDouble = getMax(5.0, 10.0)
    val max3Doubles = getMax(5.0, 10.0, 15.0)

    println("max: $max")
    println("max: $maxDouble")
    println("max: $max3Doubles")

}

fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Double, b: Double) = if (a > b) a else b
fun getMax(a: Double, b: Double, c: Double): Double {
    if (a > b && a > c) {
        return a
    } else if (b > a && b > c) {
        return b
    } else {
        return c
    }
}