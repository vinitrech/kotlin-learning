package com.example.oop

// creating properties inside constructor
class Car(var name: String, var model: String, var color: String, var doors: Int) {

    fun move() {
        println("Car is moving")
    }

    fun stop() {
        println("Car stopped")
    }
}

// declaring class with values passed by constructor with validations before assignment, using init
class User(name: String, lastname: String, age: Int) {
    var name: String
    var lastname: String
    var age: String

    init { // the names of variables here must respect 'this' scope, because it refers to the variables declared in the constructor
        if (name.lowercase().startsWith("v")) {
            this.name = name
        } else {
            this.name = "User"
        }

        if (lastname.lowercase().startsWith("t")) {
            this.lastname = lastname
        } else {
            this.lastname = "User last name"
        }

        if (age > 17) {
            this.age = "an adult"
        } else {
            this.age = "a minor"
        }
    }
}

// secondary constructor passes default values for fields that are not informed by the user, so they can be assigned by the main constructor
// the secondary constructor is the one used in the instantiation, then it calls the main constructor passing the values
class SecondaryConstructor(var name: String, var lastname: String, var age: Int) {
    constructor(name: String) : this(name, "Default lastname", 30) {
        println("2rd")
    }

    constructor(name: String, lastname: String) : this(name, lastname, 50) {
        println("3rd")
    }
}

class DefaultParameters(var name: String = "First name", var lastname: String = "Last name", var age: Int = 0){

}

class AnyClass() { // declaring class without constructor
    var name = "name"
    var model = "model"
    var color = "color"
    var doors = 0
}