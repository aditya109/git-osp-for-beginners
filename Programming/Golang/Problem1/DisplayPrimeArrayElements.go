package main

import "fmt"

func main() {

	var arr [20]int

	for i := 1; i < len(arr); i++ {
		arr[i] = i
	}

	for i := 1; i < len(arr); i++ {
		isPrime := true
		for j := 2; j < i+1; j++ {
			if (i+1) != j && (i+1)%j == 0 {
				isPrime = false
				break
			}
		}
		if isPrime {
			fmt.Printf("%d ", i+1)
		}
	}
}
