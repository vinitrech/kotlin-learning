package com.example.lambdas

// Higher order functions can accept or/and return functions
fun main() {
    operation(5, 5, '+') { x: Int -> println(x) }
    operation(5, 5, '-') { x: Int -> println(x) }
    operation(5, 5, '/') { x: Int -> println(x) }
    operation(5, 5, '*') { x: Int -> println(x) }

    // If the lambda function is the last parameter of the target function, it can be declared outside the function call
    operation(5, 5, '+') { x: Int -> println(x) }
}

fun operation(x: Int, y: Int, operator: Char, action: (Int) -> Unit) { // Unit means the function will return nothing (returns void)
    if (operator == '+') {
        action(x + y)
    }

    if (operator == '-') {
        action(x - y)
    }

    if (operator == '/') {
        action(x / y)
    }

    if (operator == '*') {
        action(x * y)
    }
}