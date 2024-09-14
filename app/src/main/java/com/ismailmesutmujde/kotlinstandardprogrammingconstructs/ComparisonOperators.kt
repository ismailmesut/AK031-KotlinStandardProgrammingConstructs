package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

fun main() {

    // Comparison Operators

    var s1 = 60
    var s2 = 50

    var y1 = 70
    var y2 = 80

    println(s1 == s2)   // false
    println(s1 != s2)   // true
    println(s1 > s2)    // true
    println(s1 >= s2)   // true
    println(s1 < s2)    // false
    println(s1 <= s2)   // false

    // OR  : ||
    println(s1>s2 || y1 >y2 )   // true or false : true
    // AND : &&
    println(s1>s2 && y1 >y2 )   // true and false : false

    // NOT : ! (true ise false, false ise true yapar.)
    var a = true
    println(!a)
}