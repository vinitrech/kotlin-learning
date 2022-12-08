package com.example.oop_delegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val user = User()

    with(user) { // with puts the object in context, to assign values or to use them directly <- "with this object, do the following"
        firstName = "Alex"
        lastName = "John"
    }

    with(user){
        println(firstName)
        println(lastName)
    }
}

// Implement interface A using the implementation contained in the FirstDelegate class
// Implement interface B using the implementation contained in the SecondDelegate class
class App : A by FirstDelegate(), B by SecondDelegate() {
    override fun print() {
        println("New print")
    }

    override fun print2() {
        println("New print2")
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate : A {
    override fun print() {
        println("print")
    }
}

open class SecondDelegate : B {
    override fun print2() {
        println("print2")
    }
}

// Delegating properties

class User {
    var firstName by FormatDelegate() // with this, the Getter and Setter will work accordingly to what is defined in the FormatDelegate class
    var lastName by FormatDelegate()
}

class FormatDelegate() : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        formattedString = value.lowercase()
    }

}