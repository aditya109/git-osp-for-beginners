package main

import (
	"fmt"
	"strconv"
	"math/big"
)

// Take input from user and add to all the previous inputs and then print out the prime numbers

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
