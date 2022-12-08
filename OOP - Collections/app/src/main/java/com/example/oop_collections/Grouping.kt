package com.example.oop_collections

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() }))
}