package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

fun main() {

    for (i in 3..5) {
        println(i)
    }

    // 10 ile 20 arasında 5 er 5 er artsın
    var start = 10
    var finish = 20
    var increase = 5
    for (a in start..finish step increase) {
        println("a : $a")
    }

    var decrease = 2
    // 20 ile 10 arasında 2 şer 2 şer azalsın
    for (b in finish downTo start step decrease) {
        println("b : $b")
    }

    // until de son değer dahil edilmiyor
    for (c in 1 until 5) {
        println("c : $c")
    }

    var counter = 1
    while (counter < 4) {
        println("counter : $counter")
        counter += 1   // counter = counter + 1
    }
}