package com.example.oop_dataclasses

fun main() {
    val name1 = "Alex"
    val name2 = "Alexas"

    println(name1 == name2) // structural
    println(name1 === name2) // referential

    val user1 = User("Alex", "Dobbin", 33)
    val user2 = User("Alex", "Dobbin", 33)

    println(user1 == user2) // performs the equals() check, by default it includes the hashcode, unless overriden
    println(user1.equals(user2)) // equals performs referential equality check
    println(user1 === user2) // compares values and hashcode to check if they point to the same object
    println(user1) // using the toString() method overriden
}

class User(var firstName: String, var lastName: String, var age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (other is User) {
            return this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age
        }

        return false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "Name: ${this.firstName} - Last name: ${this.lastName} - Age: ${this.age}"
    }
}