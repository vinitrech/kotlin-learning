package com.example.oop_collections

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.any{it.endsWith("r")}) // check if any item ends with "r"
    println(numbers.none{it.endsWith("e")}) // check if none of the items end with "e"
    println(numbers.all{it.endsWith("o")}) // check if all items end with "o"
}