package com.ismailmesutmujde.kotlinstandardprogrammingconstructs

fun main() {

    // Example 1 : if statement

    var name = "ismail"
    var age = 17

    if (age >= 18) {
        println("You are an adult")
    }

    // Example 2 : if-else statement
    if (age >= 18) {
        println("You are an adult")
    } else {
        println("You are not an adult")
    }

    // Example 3 : if-else statement
    if (name == "mesut") {
        println("Hello mesut")
    } else {
        println("Unknown person")
    }

    // Example 4 : if-elseif-else statement
    if (name == "mesut") {
        println("Hello mesut")
    } else if (name == "ismail"){
        println("Hello ismail")
    } else {
        println("Unknown person")
    }

    // Example 5 : multiple conditions
    var userName = "adminx"
    var password = 12345

    if(password == 12345 && userName == "admin") { // true and true : true
        println("Welcome")
    } else {
        println("Wrong entry")
    }

    // Example 6 : multiple conditions (OR)
    var sinif = 10
    if (sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12) {
        println("You can prepare for the AYT exam")
    }

    // Example 7 : shortcut
    var a = 10
    var b = 15
    if (a == b) println("Equal") else println("Not equal")

}