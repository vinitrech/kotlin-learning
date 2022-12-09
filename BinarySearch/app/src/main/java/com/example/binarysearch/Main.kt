package com.example.binarysearch

fun main() {
    // Binary search only works with ORDERED collections

    searchElement(27, mutableListOf(1, 5, 6, 20, 27, 30))
    println()
    binarySearchElement(27, mutableListOf(1, 5, 6, 20, 27, 30))
    println()

    // Much more simple way to perform binary search, but it is important to know how it works under the hood
    println(mutableListOf(1, 5, 6, 20, 27, 30).binarySearch(27))
}

private fun searchElement(searchedElement: Int, numbers: MutableList<Int>): Int {
    var i = 0
    for (number in numbers) {
        i++
        println(i)
        if (number == searchedElement) {
            return number
        }
    }
    return -1
}

private fun binarySearchElement(searchedElement: Int, numbers: MutableList<Int>): Int {
    var low = 0
    var high = numbers.size - 1

    var i = 0
    while (low <= high) {
        i++
        println(i)
        val mid = (low + high) / 2
        val comparison = numbers[mid].compareTo(searchedElement)

        low = if (comparison < 0) {
            mid + 1
        } else if (comparison > 0) {
            mid - 1
        } else {
            return numbers[mid]
        }
    }

    return -1
}