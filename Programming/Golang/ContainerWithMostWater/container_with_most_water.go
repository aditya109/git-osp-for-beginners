package main

// Problem statement :
// Given n non-negative integers a1, a2, ..., an ,
// where each represents a point at coordinate (i, ai).
// n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
// Find two lines, which, together with the x-axis forms a container,
// such that the container contains the most water.

import (
	"fmt"
)

func Min(x, y uint) uint {
	if x > y {
		return y
	}
	return x
}

func Max(x, y uint) uint {
	if x > y {
		return x
	}
	return y
}

func maxArea(heights []uint) uint {
	l := uint(0)
	r := uint(len(heights) - 1)
	area := uint(0)
	for l < r {
		area = Max(area, Min(heights[l], heights[r])*(r-l))

		if heights[l] < heights[r] {
			l = l + 1
		} else {
			r = r - 1
		}
	}

	return area
}

func main() {
	fmt.Print("Enter the number of inputs : ")
	var inputCount uint
	fmt.Scanln(&inputCount)
	heights := make([]uint, inputCount)

	for i := uint(0); i < inputCount; i++ {
		fmt.Printf("Enter height of %d column: ", i+1)
		var temp uint
		fmt.Scanln(&temp)
		heights[i] = temp
	}

	fmt.Printf("The maximum Area of water is : %d \n", maxArea(heights))

}
