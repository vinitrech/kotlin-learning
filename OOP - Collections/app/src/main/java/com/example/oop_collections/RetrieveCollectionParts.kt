package com.example.oop_collections

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")

    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3,4,0)))

    println("\n")

    println(numbers.take(3))
    println(numbers.takeLast(3))

    println("\n")

    println(numbers.drop(1))
    println(numbers.dropLast(4))

    println("\n")

    println(numbers.takeWhile { !it.startsWith("f") })
    println(numbers.takeLastWhile { it != "three" })

    println("\n")

    println(numbers.dropWhile { it.length == 3 })
    println(numbers.dropLastWhile { it.contains("i") })

    println("\n")

    println(numbers.dropWhile { it.length == 3 })
    println(numbers.dropLastWhile { it.contains("i") })

    val numbersChunked = (0..15).toList()
    println(numbersChunked.chunked(2))
    println(numbersChunked.chunked(3){it.sum()})

    println(numbers.windowed(3))
}