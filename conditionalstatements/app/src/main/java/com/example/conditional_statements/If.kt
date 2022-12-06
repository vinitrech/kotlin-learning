package com.example.conditional_statements

fun main() {
    if (true) {
        println("Is Vinicius.")
    } else if (false) {
        println("Is Vinicius13.")
    } else {
        println("Is neither.")
    }

    val text = if (1 == 1) { // The last expression inside curly braces will be the value assigned to the variable
        println("abc")
        "abc" // This value is assigned to the variable
    } else {
        println("cba")
        "cba"
    }

    println(text)
}