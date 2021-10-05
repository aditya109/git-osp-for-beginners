package com.example.testapp

import java.util.*

fun main(){
    val numbers = arrayListOf<Int>()
    val output = arrayListOf<Int>()
    val scanner = Scanner(System.`in`)

    println("Enter the size of the list")
    val listSize = scanner.nextInt()

    println("Enter the $listSize numbers in a non-decreasing sorted manner")
    for (i in 0 until listSize) numbers.add(scanner.nextInt())

    println("Enter the target number")
    val targetNum = scanner.nextInt()

    outerLoop@
    for (i in 0 until listSize){
        for (j in i+1 until listSize){
            if (numbers[i]+numbers[j] == targetNum){
                output.addAll(arrayListOf(i+1,j+1))
                break@outerLoop
            }
        }
    }

    if (output.isNotEmpty()) println("[${output[0]},${output[1]}]")
    else println("The list does not contain the required numbers to satisfy the condition")
}