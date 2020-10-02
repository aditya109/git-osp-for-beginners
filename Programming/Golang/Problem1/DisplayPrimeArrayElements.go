package main

import "fmt"

func main() {

	// declaring the array
	var arr [20]int

	// Setting values 1-20 into the array
	for i := 0; i < len(arr); i++ {
		arr[i] =i+1
	}

	// Printing values of array
	fmt.Printf("Values of array are as follows: \n")
	for _, value := range arr {
		  
	  fmt.Printf("%d ", value)  
 	}
	
	fmt.Printf("\n")
	
	// Finding if values are prime numbers or not
	fmt.Printf("Prime numbers are as follows: \n")
	
	for i := 0; i < len(arr); i++ {
		checkPrime(arr[i])
	}
}

func checkPrime(value int){
	isValuePrime := true
	for i := 2; i < value+1; i++ {
		if (value+1) != i && (value+1)%i == 0 {
			isValuePrime = false
			break
		}
	}
	if isValuePrime {
		fmt.Printf("%d ", value+1)
	}
}