package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

fun main() {
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println("Loop 1 : $i")
    }

    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println("Loop 2 : $i")
    }
}