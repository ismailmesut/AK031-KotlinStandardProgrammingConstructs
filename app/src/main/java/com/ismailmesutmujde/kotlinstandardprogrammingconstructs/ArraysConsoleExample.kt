package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    val names = Array<String>(5) {""}  // ["","","","",""]
    for (i in 0 until names.count()) {
        println("${i+1}. adı giriniz")
        val name = input.next()
        names[i] = name
    }

    for ((index, name) in names.withIndex()) {
        println("${index+1}. ad : $name")
    }
}