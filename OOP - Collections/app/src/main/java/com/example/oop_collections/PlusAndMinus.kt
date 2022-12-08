package com.example.oop_collections

fun main() {
    val numbers = mutableListOf("one", "two", "three", "four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("one", "two").toSet()

    println(numbers)
    println(plusList)
    println(minusList)
}