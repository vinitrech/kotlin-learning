package com.example.oop_collections

fun main() {
    val numbers = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    numbers.sorted().forEach { println(it) }

    val laptops = mutableListOf(
        Laptop(2, "Acer", 2022, 8, 1000),
        Laptop(1, "Dell", 2021, 4, 600),
        Laptop(3, "Apple", 2020, 16, 50000)
    )

    println("\n")
    laptops.sorted().forEach { println(it) }
    println("\n")
    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
    println("\n")
    laptops.sortedWith(ComparatorYear()).forEach { println(it) }

    // Creating comparation with lambda (compareBy) instead of inheriting Comparable or creating Comparators
    println("\n")
    laptops.sortedWith(compareBy { it.id }).forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy { it.brand }).forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy { it.year }).forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy { it.price }).forEach { println(it) }

    // Chain criteria using compareBy
    println("\n")
    laptops.sortedWith(compareBy<Laptop> { it.id }.thenBy{it.ram}).forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy<Laptop> { it.brand }.thenBy{it.ram}).forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy{it.ram}).forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy<Laptop> { it.price }.thenBy{it.ram}).forEach { println(it) }

    // An even more concise way to sort by fields, instead of compareBy
    // sortedBy creates comparator internally
    println("\n")
    laptops.sortedBy { it.id }.forEach { println(it) }
    println("\n")
    laptops.sortedBy { it.brand }.forEach { println(it) }
    println("\n")
    laptops.sortedBy { it.year }.forEach { println(it) }
    println("\n")
    laptops.sortedBy { it.price }.forEach { println(it) }
}

data class Laptop(val id: Int, val brand: String, val year: Int, val ram: Int, val price: Int) :
    Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if (this.id > other.id) {
            1 // returns the "this" element
        } else if (this.id < other.id) {
            -1 // return the "other" element
        } else {
            0 // they are equal
        }
    }
}

class ComparatorRam : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram) {
            1
        } else if (laptop1.ram < laptop2.ram) {
            -1
        } else {
            0
        }
    }
}

class ComparatorYear : Comparator<Laptop> {
    override fun compare(p0: Laptop, p1: Laptop): Int {
        return if (p0.year > p1.year) {
            1
        } else if (p0.year < p1.year) {
            -1
        } else {
            0
        }
    }
}