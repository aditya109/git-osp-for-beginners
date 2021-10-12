package com.example.testapp

import java.util.*
import kotlin.math.sign

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter a number to check if it is a Palindrome")
    val input = scanner.nextInt()

    if (input.sign == -1){
        println(false)
        return
    }
    var a = input
    var b = 0
    do{
        b = (b*10)+(a%10)
        a /= 10
    }while (a != 0)

    println(b==input)
}