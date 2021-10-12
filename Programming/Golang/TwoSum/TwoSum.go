// Read the problem description here: https://github.com/aditya109/git-osp-for-beginners/issues/462

package main

import (
	"errors"
	"fmt"
)

// twoSum returns an int array of length 2 that contains the indices
// of the numbers in array `arr` that add up to `target`
func twoSum(target int, arr []int) ([2]int, error) {
	numMap := make(map[int]int)

	for i, num := range arr {
		numMap[num] = i
	}

	for i, num := range arr {
		if complement, ok := numMap[target-num]; ok {
			return [2]int{i + 1, complement + 1}, nil
		}
	}

	return [2]int{}, errors.New("No pair of numbers found in the array that add up to the target value")
}

// main function to test the `twoSum` algorithm
func main() {
	array := []int{2, 7, 11, 15}
	target := 9

	res, err := twoSum(target, array)
	if err != nil {
		panic(err.Error())
	}

	fmt.Println("Result is:", res)
}
