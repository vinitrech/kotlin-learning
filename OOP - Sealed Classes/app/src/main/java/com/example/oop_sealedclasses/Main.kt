package com.example.oop_sealedclasses

fun main() {
    val success = Result.Success("SUCCESS")
    val error = Result.Error("ERROR")

    getData(success)
    getData(error)
}

fun getData(result: Result) {
    when (result) {
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}

sealed class Result(val message: String) { // sealed classes cannot be instantiated
    //Sealed classes are used when a value can have only one of the types from a limited set (restricted hierarchies)

    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
}
