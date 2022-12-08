package com.example.lateinit

fun main() {
    var user1 = User(
        "Vini", "Tonello", 24
    )

    //println("Favorite movie: ${user1.favoriteMovie}") <- this throws an exception due to variable not initialized
    user1.favoriteMovie = "Interstellar"
    println("Favorite movie: ${user1.favoriteMovie}")
}

class User(var firstName: String, var lastName: String, var age: Int) {
    lateinit var favoriteMovie: String // only works with classes
}