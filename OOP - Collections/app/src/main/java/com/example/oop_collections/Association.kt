package com.example.oop_collections

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val z =
        numbers.associateWith { it.length } // creates a map with keys from numbers and values based on the expression informed
    println(z)

    val x = numbers.associateBy { it.first().uppercase() }
    println(x)

    val y = numbers.associateBy(keySelector = {
        it.first().uppercase()
    }, valueTransform = {
        it.length
    })
    println(y)
}