package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)
    val lessons = Array<String>(5) {""}  // ["","","","",""]
    val marks = Array<Int>(5) {0}  // [0,0,0,0,0]

    for (i in 0 until lessons.count()) { // 0,1,2,3,4
        println("${i+1}. dersi giriniz")
        val lesson = input.next()
        lessons[i] = lesson
        println("${i+1}. notu giriniz")
        val mark = input.nextInt()
        marks[i] = mark
    }

    var sum = 0

    for (i in 0 until marks.count()) {
        println("${lessons[i]} : ${marks[i]}")
        sum = sum + marks[i]
    }

    val average = sum / marks.count()
    println("Ortalama : $average")

    if(average >= 50) {
        println("GEÇTİ")
    } else {
        println("KALDI")
    }

}