package com.example.datatypes

fun main() {

    val byte: Byte = 5 // 8 bits width
    val maxByteValue = Byte.MAX_VALUE
    val minByteValue = Byte.MIN_VALUE

    println("Byte maximum value: $maxByteValue")
    println("Byte minimum value: $minByteValue\n")

    val short: Short = 5 // 16 bits width
    val maxShortValue = Short.MAX_VALUE
    val minShortValue = Short.MIN_VALUE

    println("Short maximum value: $maxShortValue")
    println("Short minimum value: $minShortValue\n")

    val integer: Int = 5 // 32 bits width
    val maxIntValue = Int.MAX_VALUE
    val minIntValue = Int.MIN_VALUE

    println("Integer maximum value: $maxIntValue")
    println("Integer minimum value: $minIntValue\n")

    val long: Long = 50 // 64 bits width
    val maxLongValue = Long.MAX_VALUE
    val minLongValue = Long.MIN_VALUE

    println("Long maximum value: $maxLongValue")
    println("Long minimum value: $minLongValue\n")

    //Inferring long type
    val myInt = 28
    val myLong = 28L
}