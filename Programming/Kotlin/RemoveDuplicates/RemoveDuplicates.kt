package com.example.testapp

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter the size of array")
    val size = scanner.nextInt()

    val nums = arrayListOf<Int>()
    println("Enter the $size numbers")
    for(i in 0 until size) nums.add(scanner.nextInt())

    val k = removeDuplicates(nums)

    println("Size of the new array is $k")
    print("The new array is:\n[")
    for(num in nums){
        if (num==nums[nums.size-1]) print("$num]")
        else print("$num,")
    }

}

fun removeDuplicates(nums : ArrayList<Int>): Int{
    var size = nums.size
    var i = 0
    while (i<size){
        innerLoop@
        for(j in i+1 until size){
            if (nums[i] == nums[j]){
                nums.removeAt(i)
                size = nums.size
                i--
                break@innerLoop
            }
        }
        i++
    }
    return nums.size
}