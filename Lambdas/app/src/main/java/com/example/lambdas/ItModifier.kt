package com.example.lambdas

fun main() {
    println(uppercase("random string") { s: String -> s.uppercase() })
    println(uppercase("random string") { it.uppercase() })
}

fun uppercase(str: String, myFun: (String) -> String): String {
    return myFun(str)
}