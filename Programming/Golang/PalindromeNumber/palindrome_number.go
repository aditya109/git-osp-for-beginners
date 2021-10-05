package main

import "fmt"

func main() {
	result := IsPalindrome(121)

	fmt.Println(result)
}

func IsPalindrome(num int) bool {
	if num < 0 {
		return false
	}

	numSlice := intToSlice(num)

	for i, v := range numSlice {
		rightCtr := len(numSlice) - i - 1

		if v != numSlice[rightCtr] {
			return false
		}
	}

	return true
}

func intToSlice(num int) []int {
	var numSlice []int

	for i := num; i > 0; i = i / 10 {
		numSlice = append(numSlice, i%10)
	}

	return numSlice
}
