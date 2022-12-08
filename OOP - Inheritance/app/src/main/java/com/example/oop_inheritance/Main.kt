package com.example.oop_inheritance

fun main() {
    val car = Car("BMW", "Blue", 1, 4)
    val airplane = Plane("Boeing", "White", 4, 4)

    car.move()
    airplane.move()
    car.stop()
    airplane.stop()

    var view = View()
    var button = Button("Random button", "vertical")
    var roundButton = RoundButton("Login Button", "Horizontal", 4)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class Vehicle(
    val name: String,
    val color: String
) { // open indicates that class can be inherited

    open fun move() { // open indicates that the method can be overriden
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
    override fun move() {
        println("Car $name is about to start trip")
        super.move()
    }
}

class Plane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
    override fun move() {
        println("Plane $name is about to start trip")
        super.move()
    }
}

open class View() {

    open fun draw() {
        println("Drawing the view")
    }
}

open class Button(val text: String, val orientation: String) : View() {
    override fun draw() {
        println("Drawing button")
    }
}

class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation){
    override fun draw(){
        println("Drawing round button")
    }
}