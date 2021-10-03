package main
import (
	"fmt"
)

func get_integer_from_roman(roman string) int {
	ma := map[string]int{
		"I": 1,
		"V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000,
	}
	var prev, curr, ans int
	for _, char := range roman {
		curr = ma[string(char)]
		if curr > prev {
			ans += curr - 2*prev
		} else {
			ans += curr
		}
		prev = curr
	}
	return ans
}

func main() {
	var roman string
	fmt.Println("Enter the roman number!\n")
	fmt.Scan(&roman)
	var integer int
	integer = get_integer_from_roman(roman)
	fmt.Println(roman, "-->", integer)
}