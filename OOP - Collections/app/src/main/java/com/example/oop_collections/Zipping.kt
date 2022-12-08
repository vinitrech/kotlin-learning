package com.example.oop_collections

fun main() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")

    // Zip creates a list of pairs
    println(colors.zip(animals))
    println(colors zip animals)

    println(colors.zip(animals) { color, animal ->
        "The ${animal.replaceFirstChar { it.uppercase() }} is $color"
    })

    val numberPairs = listOf(1 to "red",2 to "brown",3 to "grey")
    println(numberPairs)
    println(numberPairs.unzip())
}