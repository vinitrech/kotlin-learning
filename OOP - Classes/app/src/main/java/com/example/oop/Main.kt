package com.example.oop

fun main() {
    var car1 = Car("Tesla", "TSL01", "Grey", 2)

    println("Car is a ${car1.name}, model ${car1.model}. The color is ${car1.color} and have ${car1.doors} doors.")
    car1.move()
    car1.stop()

    val user = User("Vinicius", "Tonello", 24)
    println("User ${user.name}, last name ${user.lastname}, is ${user.age}")

    val user2 = SecondaryConstructor("Name") // secondary constructor with just the name
    println("Name: ${user2.name}, lastname: ${user2.lastname} and age: ${user2.age}")

    val user3 = SecondaryConstructor("Name", "Lastname") // secondary constructor with just the name and lastname
    println("Name: ${user3.name}, lastname: ${user3.lastname} and age: ${user3.age}")

    var user4 = DefaultParameters(age = 25) // named parameters
    println("Name: ${user4.name}, lastname: ${user4.lastname} and age: ${user4.age}")
}