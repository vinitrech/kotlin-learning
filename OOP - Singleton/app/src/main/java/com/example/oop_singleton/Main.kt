package com.example.oop_singleton

fun main() {
    //Old usage
    val instance = OldWayDatabase.getInstance()
    val instance2 = OldWayDatabase.getInstance()
    println(instance)
    println(instance2)

    // New usage
    println(Database)
}

// New and correct way
object Database {
    init{
        println("Database created")
    }
}

// Old way
class OldWayDatabase private constructor() {
    companion object {
        private var instance: OldWayDatabase? = null

        fun getInstance(): OldWayDatabase? {
            if (instance == null) {
                instance = OldWayDatabase()
            }

            return instance
        }
    }
}