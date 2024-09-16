package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {

    for (i in 1..10) {
        val randomNumber = Random.nextInt(0, 10)  // 0 ile 9 arasında rastgele sayı üretir
        println(randomNumber)
    }

    val c = ceil(6.5)  // yukarı yuvarlama
    println("c : $c")

    val f = floor(6.5) // aşağı yuvarlama
    println("f : $f")

    val s = sqrt(4.0)  // karekökünü alma
    println("s : $s")

    val a = abs(-10)  // mutlak değerini alma
    println("a : $a")

    val mx = max(100,200)  // max değeri bulma
    println("max : $mx")

    val mn = min(100, 200) // min değeri bulma
    println("min : $mn")

    val p = 2.0.pow(3.0)  // üssünü alma
    println("p : $p")

}