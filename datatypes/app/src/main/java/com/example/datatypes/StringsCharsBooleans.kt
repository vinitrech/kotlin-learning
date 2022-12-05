package com.example.datatypes

fun main() {
    val boolean: Boolean = false // 16 bits width
    print("Boolean: $boolean\n")

    val string: String = "string" // (8 bits x length) width (may vary according to encoding)
    print("String: $string\n")

    val char: Char = '5' // 8 bits width
    print("Char: $char\n")
}