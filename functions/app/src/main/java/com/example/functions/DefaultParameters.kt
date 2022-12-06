package com.example.functions

fun main() {
    sendMessage(name = "John") // named parameters
    sendMessage(message = "Hi")
    sendMessage("John", "Hello")
}

fun sendMessage(
    name: String = "Name", message: String = "Message"
) { // with default value the parameters are optional
    println("Name: $name and message = $message")
}
