package com.example.oop_collections

fun main() {
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))

    // Without flatten
    for (numbers in numberSets) {
        for (number in numbers) {
            println(number)
        }
        println("\n")
    }

    // With flatten
    val flattenNumberSets = numberSets.flatten() // Breaks multi-dimensional vectors in one single vector
    for (number in flattenNumberSets) {
        println(number)
    }
}