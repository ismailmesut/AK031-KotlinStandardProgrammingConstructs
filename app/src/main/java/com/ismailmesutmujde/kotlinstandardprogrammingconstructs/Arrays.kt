package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

fun main() {

    // definition
    val array1 = Array<Int>(5) {0} // [0,0,0,0,0]
    val array2 = arrayOf(1,10,7)
    val array3 = arrayOf<Int>(1,36,9)
    val array4 = arrayOf<String>("Strawberry","İsmail")
    val array5 = arrayOf(3,8,"Apple","Bursa")

    val fruits = arrayOf<String>("Strawberry", "Banana", "Apple", "Kiwi", "Cherry")

    // access to data
    val str1 = fruits[2]
    println(str1)

    val str2 = fruits.get(3)
    println(str2)

    // performing operations on data
    fruits[1] = "New Banana"
    println(fruits.contentToString())

    fruits.set(2, "New Apple")
    println(fruits.contentToString())

    // array operations
    println(fruits.isEmpty())
    println(fruits.count())
    println(fruits.first())
    println(fruits.last())
    println(fruits.indexOf("Kiwi"))
    println(fruits.contains("New Banana"))
    println(fruits.max())
    println(fruits.min())
    println(fruits.sort())
    println(fruits.contentToString())
    println(fruits.reverse())
    println(fruits.contentToString())
}