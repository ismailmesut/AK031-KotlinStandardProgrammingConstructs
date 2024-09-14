package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    println("Delete   (1)")
    println("Add      (2)")
    println("Update   (3)")
    val yourChoise = input.nextInt()

    when(yourChoise) {
        1 -> println("Data deleted")
        2 -> println("Data added")
        3 -> println("Data updated")
        else -> println("There is no such transaction")
    }
}