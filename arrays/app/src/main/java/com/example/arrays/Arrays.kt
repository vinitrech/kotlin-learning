package com.example.arrays

fun main() {
    val test: Array<Int> = arrayOf(1, 2, 3, 4, 5) // Arrays have fixed size
    val items = arrayOf("John", "Steven", "Megan", 1, 2, 'A', 5.0) // Type-inferred
    println("First index: ${items[0]}")
    items[0] = "Alex"
    println("First index: ${items[0]}")

    for (item in items) {
        if (item is String) { // "is" check the variable type
            println(item)
        }
    }

    test.forEach {
        println(it)
    }
}