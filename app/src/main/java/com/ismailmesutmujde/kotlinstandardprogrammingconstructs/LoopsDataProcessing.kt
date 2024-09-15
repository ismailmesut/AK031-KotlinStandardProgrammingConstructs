package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    println("Enter the amount of data to be processed")
    var data = input.nextInt()

    while (data > 0) {
        println("$data. data")
        data -= 1
    }
}