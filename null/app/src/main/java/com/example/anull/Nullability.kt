package com.example.anull

fun main() {
    printText("abcdefg")
    printText(null)
}

fun printText(text: String?) { // ? indicates optional argument
    val text2 = text ?: "Variable is null" // Assign the value of text if not null, else assign the text after colon
    println("Text2: $text2")

    println(text?.length) // If is not null, get the length / equivalent to "if(text != null)"
    println(text!!.length) // If is null, throw exception. If is not null, get the length

}