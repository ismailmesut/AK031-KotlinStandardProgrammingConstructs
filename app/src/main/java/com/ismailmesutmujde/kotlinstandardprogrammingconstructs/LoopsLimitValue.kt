package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

fun main() {

    // 3 ile 6
    for (i in 3..6) {
        println("Loop 1 : $i")
    }

    var counter = 3
    while (counter < 7) {
        println("Loop 2 : $counter")
        counter +=1
    }

    // 0 ile 8 arasında 2 şer 2 şer artsın
    for (i in 0..8 step 2) {
        println("Loop 3 : $i")
    }

    var counter2 = 0
    while (counter2 < 9) {
        println("Loop 4 : $counter2")
        counter2 += 2
    }

    // 8 ile 0 arasında 2 şer 2 şer azalsın
    for (i in 8 downTo 0 step 2) {
        println("Loop 5 : $i")
    }

    var counter3 = 8
    while (counter3 > -1) {
        println("Loop 6 : $counter3")
        counter3 -= 2
    }
}