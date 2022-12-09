package com.example.oop_collections

fun main() {
    val numbers = listOf(6,10,14,4,100)

    println("The sum is ${numbers.sum()}")
    println("The count is ${numbers.count()}")
    println("The average is ${numbers.average()}")
    println("The max is ${numbers.maxOrNull()}")
    println("The min is ${numbers.minOrNull()}")
    println("The sum is: ${numbers.sumOf { it*2 }}")
}