package com.example.oop_enum

fun main() {
    println(Direction.NORTH)
    println(Direction.SOUTH)
    println(Direction.EAST)
    println(Direction.WEST)

    println(Direction.NORTH.direction)
    println(Direction.SOUTH.direction)
    println(Direction.EAST.direction)
    println(Direction.WEST.direction)

    println(Direction.NORTH.distance)
    println(Direction.SOUTH.distance)
    println(Direction.EAST.distance)
    println(Direction.WEST.distance)

    println(Direction.NORTH.name)
    println(Direction.SOUTH.name)
    println(Direction.EAST.name)
    println(Direction.WEST.name)

    Direction.NORTH.printData()
    Direction.SOUTH.printData()
    Direction.EAST.printData()
    Direction.WEST.printData()

    val direction = Direction.WEST

    when (direction) {
        Direction.WEST -> {
            println("The direction is WEST")
        }
        else -> {
            println("The direction is NOT WEST")
        }
    }

    val checkDirection = Direction.valueOf("WEST")
    println(checkDirection)
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH(
        "north",
        10
    ), // The properties of Direction are objects, and must comply with the constructor
    SOUTH("south", 20), EAST("east", 30), WEST("west", 40);

    fun printData() {
        println("Direction = $direction and distance: $distance")
    }
}