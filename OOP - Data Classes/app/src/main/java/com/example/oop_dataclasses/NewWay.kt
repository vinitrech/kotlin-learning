package com.example.oop_dataclasses

fun main() {

    val user1 = User2("Alex", "Dobbin", 33)
    val user2 = User2("Alex", "Dobbin", 33)

    println(user1 == user2)
    println(user1.equals(user2))
    println(user1 === user2)
    println(user1)
}

data class User2( // data classes cannot have parameters, only variables
    var firstName: String,
    var lastName: String,
    var age: Int
) {} // data class already provides overriden equals, hashcode, toString, copy and component methods, considering the properties informed inside the constructor