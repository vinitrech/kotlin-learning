package com.example.oop_collections

fun main() {
    val names = listOf("Name 1", "Name 2", "Name 3") // immutable, cannot add/remove elements
    val names2 = mutableListOf("Name 2", "Name 2", "Name 3") // mutable, can add or remove items
    names2.add("Name 4")
    names2.removeAt(0)
    names2.forEach { println(it) }

    val names3 = setOf(
        "Name 2", "Name 2", "Name 3"
    ) // immutable, cannot add/remove elements <- can only store unique items(it uses the equals method to check if item exists already)
    val names4 = mutableSetOf(
        "Name 2", "Name 2", "Name 3"
    ) // mutable, can add or remove items <- can only store unique items(it uses the equals method to check if item exists already)
    names4.add("Name 4")
    names4.remove("Name 3")
    names4.forEach { println(it) }

    val mapItems = mapOf("1" to "Value 1", "2" to "Value 2") // immutable
    val mapItems2 = mutableMapOf("1" to "Value 1", "2" to "Value 2") // mutable

    println(mapItems["1"])
    println(mapItems2["2"])

    mapItems2.forEach { (key, value) -> // more than 1 parameter, () are necessary
        println("Key: $key, value: $value")
    }
}