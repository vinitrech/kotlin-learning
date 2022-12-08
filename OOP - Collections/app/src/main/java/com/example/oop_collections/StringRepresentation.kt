package com.example.oop_collections

fun main() {
    val numberStrings = listOf("one", "two", "three", "four")
    println(numberStrings)
    println(numberStrings.joinToString())
    println(numberStrings.joinToString{"Element: ${it.uppercase()}"})

    val listString = StringBuffer("The list of numbers: ")
    println(numberStrings.joinTo(listString)) // Appends the numberStrings after the listString

    println(numberStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))

    val numbers = (1 .. 100).toList()
    println(numbers)
    println(numbers.joinToString(limit=15, truncated = "<...>"))
}