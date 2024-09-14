package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)
    println("Sum       (1)")
    println("Subtract  (2)")
    println("Multiply  (3)")
    println("Divide    (4)")

    val yourChoice = input.nextInt()
    println("Your Choice : $yourChoice")

    println("Enter number 1")
    val number1 = input.nextInt()
    println("Enter number 2")
    val number2 = input.nextInt()

    if(yourChoice == 1) {
        println("Sum      : ${number1 + number2}")
    } else if (yourChoice == 2) {
        println("Subtract : ${number1 - number2}")
    } else if (yourChoice == 3) {
        println("Multiply : ${number1 * number2}")
    } else if (yourChoice == 4) {
        println("Divide   : ${number1 / number2}")
    }


}