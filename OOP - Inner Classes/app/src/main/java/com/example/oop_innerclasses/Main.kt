package com.example.oop_innerclasses

fun main() {
    val listView = ListView(arrayOf("Item1", "Item2"))
    listView.ListViewItem(1).displayItem()
}

class ListView(val items: Array<String>) {

    inner class ListViewItem(val index: Int) {

        fun displayItem() {
            println(items[index])
        }
    }
}