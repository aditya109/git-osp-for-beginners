package main

/* Problem: Given an string, count the number of words beginning with vowels.
Eg:
	Sample Input: "Apple and banana are healthy fruits."
	Sample Output: The input sentence contains 3 words that begin with vowels.
*/

import (
	"fmt"
	"strings"
)

//counts number of words beginning with vowels
func countVowelBeginWords(s string) int {
	count := 0

	words := strings.Fields(s)
	for i := range words {
		temp := string(words[i][0])
		switch strings.ToUpper(temp) {
		case "A", "E", "I", "O", "U":
			count++
		}
	}
	return count
}

func main() {
	s := "Apple and banana are healthy fruits."
	ans := countVowelBeginWords(s)
	fmt.Printf("The input sentence contains %v words that begin with vowels.\n", ans)
}
