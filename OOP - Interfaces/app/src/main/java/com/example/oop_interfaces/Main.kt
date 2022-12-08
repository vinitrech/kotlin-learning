package com.example.oop_interfaces

fun main() {
    val vehicle = Vehicle()
    val car = Car("Car", "Blue")
    val plane = Truck("Truck", "Blue")
    val truck = Plane("Plane", "Blue")
    val tesla = Tesla("Tesla", "Blue")

    vehicle.classify()
    car.startEngine()
    truck.startEngine()
    plane.startEngine()
    tesla.startEngine()
}

interface Engine {
    fun startEngine()
}

open class Vehicle() {
    fun classify() {
        println("This is a Vehicle")
    }
}

class Car(val name: String, val color: String) : Vehicle(), Engine {
    override fun startEngine() {
        println("Car $name is starting engine")
    }
}

class Truck(val name: String, val color: String) : Vehicle(), Engine {
    override fun startEngine() {
        println("Truck $name is starting engine")
    }
}

class Plane(val name: String, val color: String) : Vehicle(), Engine {
    override fun startEngine() {
        println("Plane $name is starting engine")
    }
}

class Tesla(val name: String, val color: String) : Vehicle(), Engine {
    override fun startEngine() {
        println("Tesla $name is starting engine")
    }
}