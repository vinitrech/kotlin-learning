package com.example.abstractclasses

fun main() {
    val car = Car("Car1", "blue", 4, 2)

    car.move()
    car.stop()
    car.showText()
}

// Classes can implement any number of interfaces, but can inherit only one
abstract class Vehicle(val text: String) { // abstract classes are created only to be inherited
    // interfaces can have properties too, but they can't hold values

    fun showText(){
        println("Showing text: $text")
    }

    abstract fun move() // abstract methods MUST be implemented
    abstract fun stop()
}

class Car(var name: String, var color: String, val engines: Int, val doors: Int): Vehicle("$name Test") {
    override fun move() {
        println("Car $name is moving")
    }

    override fun stop() {
        println("Car $name has stopped")
    }
}