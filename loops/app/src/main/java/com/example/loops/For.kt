package com.example.loops

fun main() {
    for (i in 1..10) { // includes 10
        println(i)
    }

    for (i in 1 until 10) { // excludes 10
        println(i)
    }

    for (i in 10 downTo 1){ // includes 1
        println(i)
    }

    for(i in 1 until 10 step 2){
        println(i)
    }
}