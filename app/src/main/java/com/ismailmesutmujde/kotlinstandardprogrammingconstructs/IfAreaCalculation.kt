package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)
    println("Square Arae    (1)")
    println("Rectangle Area (2)")
    println("Circle Area    (3)")

    val yourChoice = input.nextInt()
    println("Your Choice : $yourChoice")

    if (yourChoice == 1) {
        println("Enter the side of the square")
        val side = input.nextInt()
        println("Square Area")
        val squareArea = side * side
        println("Result : $squareArea")
    }
    if (yourChoice == 2) {
        println("Enter the short side of the rectangle")
        val shortSide = input.nextInt()
        println("Enter the long side of the rectangle")
        val longSide = input.nextInt()
        println("Rectangle Area")
        val rectangleArea = shortSide * longSide
        println("Result : $rectangleArea")
    }
    if (yourChoice == 3) {
        println("Enter the radius of the circle")
        val radius = input.nextInt()
        println("Circle Area")
        val circleArea = 3.14 * radius * radius
        println("Result : $circleArea")
    }
}