package main

import (
	"fmt"
	"math/big"
	"strconv"
)

func main() {
	var arr [20]int64
	var input string

	fmt.Println("Enter Integer value")
	for i := 0; i < 20; i++ {

		_, _ = fmt.Scan(&input)

		val, err := strconv.ParseInt(input, 10, 64)
		if err != nil {
			fmt.Println("Not a number")
		} else {
			arr[i] = val
		}
	}
	fmt.Println("Result")
	for i := 0; i < 20; i++ {
		if big.NewInt(arr[i]).ProbablyPrime(0) {
			fmt.Println(arr[i])
		}
	}
}
