package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    println("Enter name")
    val name = input.next()

    println("Enter repeat number")
    val repeat = input.nextInt()

    for (i in 1..repeat) {
        println("$i. $name")
    }
}