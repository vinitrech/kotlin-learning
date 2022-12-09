package com.example.oop_collections

fun main() {
    val numbers = listOf("one", "two", "three", "four", "five")

    println(numbers.elementAt(4))
    println(numbers.first())
    println(numbers.last())

    println(numbers.first { it.length > 3 })
    println(numbers.last { it.startsWith("f") })
    println(numbers.random())
    println(numbers.isEmpty())
}