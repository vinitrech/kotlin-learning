package com.example.oop_collections

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5)

    println(numbers.map {
        it * 2
    })

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3)

    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value * 2 })
    println(numbersMap.map { (key, value) ->
        key.uppercase() + ": " + value*2
    })
}