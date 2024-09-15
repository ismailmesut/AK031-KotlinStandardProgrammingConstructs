package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    while (true) {

        println("Enter number")
        val number = input.nextInt()

        val result = number % 2

        if (result == 0) {
            println("The number entered is an even number.")
        }
        if (result == 1) {
            println("The number entered is an odd number.")
        }

        println("To exit (1) - other numbers to continue")
        val exit = input.nextInt()

        if (exit == 1) {
            println("Exited")
            break
        }
    }
}