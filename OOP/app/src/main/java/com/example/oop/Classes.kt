package com.example.oop

fun main() {
    var car1 = Car("Tesla", "TSL01", "Grey", 2)

    println("Car is a ${car1.name}, model ${car1.model}. The color is ${car1.color} and have ${car1.doors} doors.")
    car1.move()
    car1.stop()
}

class Car(name: String, model: String, color: String, doors: Int) {
    var name = name // These fields can be declared with "var" inside the constructor itself
    var model = model
    var color = color
    var doors = doors

    fun move() {
        println("Car is moving")
    }

    fun stop() {
        println("Car stopped")
    }
}

class Car2{ // declaring class without constructor
    var name = "name"
    var model = "model"
    var color = "color"
    var doors = 0
}