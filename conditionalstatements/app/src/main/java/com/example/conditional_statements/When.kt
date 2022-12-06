package com.example.conditional_statements

fun main() {
    val alarm = 8

    when { // when can be used with or without arguments
        alarm == 8 -> {
            println("Time to wake up")
        }
    }

    val alarmText =
        when (alarm) { //The last expression inside the curly braces block will be assigned to the variable
            12 -> {
                println("Time for lunch")
                "Time for lunch"
            }
            10, 11 -> {
                println("Time to prepare lunch")
                "Time to prepare lunch"
            }
            9 -> {
                println("Time for breakfast")
                "Time for breakfast"
            }
            in 6..8 -> {
                println("Time for gym")
                "Time for gym" // This is the value assigned to the variable
            }
            !in 6..23 -> {
                println("Time to sleep")
                "Time to sleep"
            }
            else -> {
                println("Go study")
                "Go study"
            }
        }

    println(alarmText)
}