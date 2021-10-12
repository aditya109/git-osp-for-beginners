package main

import (
	"fmt"
)

func main() {
	fmt.Println("This program will remove duplicate elements from a sorted array!")
	fmt.Println(removeDuplicates([]int{1}))
	fmt.Println(removeDuplicates([]int{1, 1, 2}))
	fmt.Println(removeDuplicates([]int{0,0,1,1,1,2,2,3,3,4}))
	fmt.Println(removeDuplicates([]int{2, 2, 2, 2, 2}))
	fmt.Println(removeDuplicates([]int{1, 2, 2, 3, 4, 4, 4, 5, 5}))
}


func removeDuplicates(nums []int) []int {
    m := make(map[int]int)

    for i := range nums {
        if _,k := m[nums[i]] ; k {
            m[nums[i]]+=1
        } else {
            m[nums[i]]=1
        }
    }
   
    for i :=0 ; i<len(nums);i++ {
        nums = append(nums[:i+1] , nums[i+m[nums[i]]: ]...)
    }
    return nums
}