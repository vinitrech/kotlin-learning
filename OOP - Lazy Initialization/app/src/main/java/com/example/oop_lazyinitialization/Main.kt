package com.example.oop_lazyinitialization

fun main() {
    val user1 by lazy {
        User("Vinicius", "Tonello", 24) // will be initialized only when used in the code
    }

    println(user1.firstName) // initialized and used
}

class User(var firstName: String, var lastname: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }
}