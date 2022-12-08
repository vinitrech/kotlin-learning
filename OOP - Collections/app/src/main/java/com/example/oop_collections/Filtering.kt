package com.example.oop_collections

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 101" to 101)
    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)

    val filterIndexed = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    println(filterIndexed)

    val filterNot = numbers.filterNot { it.length < 3 }
    println(filterNot)

    val mixedList = listOf(1, "two", 3, '4', false)
    mixedList.filterIsInstance<Char>().forEach {
        println(it)
    }

    // Partition
    val (match, rest) = numbers.partition { it.length > 3 } // breaks the filtering into 2 lists, the matches and the rest
    println(match)
    println(rest)
}