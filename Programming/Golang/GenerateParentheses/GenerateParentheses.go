// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

//Steps: 1. Add left paren only when open < n and right paren only when close < open

package main

import "fmt"

func main() {
	// Taking Example Input- 1
	output := generateParenthesis(3)
	fmt.Println(output)

	// Taking Example Input-2
	output = generateParenthesis(1)
	fmt.Println(output)

}

//Priting the pairs
func generateParenthesis(n int) []string {
	input := ""
	for i := 0; i < n; i++ {
		input = input + "  "
	}
	output := generateParenthesisUtil(0, n, 0, 0, []rune(input))
	return output
}

//Recursive Function
func generateParenthesisUtil(pos, n, open, close int, input []rune) []string {

	var output []string
	if pos == n*2 {
		output = append(output, string(input))
		return output
	}

	if close < open {
		input[pos] = ')'
		result := generateParenthesisUtil(pos+1, n, open, close+1, input)
		output = append(output, result...)

	}

	if open < n {
		input[pos] = '('
		result := generateParenthesisUtil(pos+1, n, open+1, close, input)
		output = append(output, result...)
	}

	return output
}
