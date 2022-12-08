package com.example.oop_companionobjects

fun main() {
    println("1 + 2: ${Calculator.sum(1, 2)}")
}

class Calculator() {
    companion object { // code inside this block belongs to the class itself, not to object instances of it. Therefore, it can be used directly from the class
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}