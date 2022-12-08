package com.example.oop_gettersandsetters

fun main() {
    var user1 = User("Vinicius", "Tonello", 24)

    user1.lastName = "John" // getter and setter are implicit, always used under the hood

    println(user1.lastName)
}

class User(var firstName: String, lastName: String, var age: Int) {
    var lastName = lastName
        get() { //Overriding getter and setter
            return "getting $field"
        }
        set(value) { // set is not executed when new instance is created
            field = "lastname: $value"
        }
}