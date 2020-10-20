// Java Program to convert decimal number to 
// roman numerals 
class IntegerToRoman { 

// To add corresponding base symbols in the array 
// to handle cases that follow subtractive notation. 
// Base symbols are added index 'i'. 
	static int sub_digit(char num1, char num2, int i, char[] c) { 
		c[i++] = num1; 
		c[i++] = num2; 
		return i; 
	} 

// To add symbol 'ch' n times after index i in c[] 
	static int digit(char ch, int n, int i, char[] c) { 
		for (int j = 0; j < n; j++) { 
			c[i++] = ch; 
		} 
		return i; 
	} 

// Function to convert decimal to Roman Numerals 
	static void printRoman(int number) { 
		char c[] = new char[10001]; 
		int i = 0; 

		// If number entered is not valid 
		if (number <= 0) { 
			System.out.printf("Invalid number"); 
			return; 
		} 

		// TO convert decimal number to roman numerals 
		while (number != 0) { 
			// If base value of number is greater than 1000 
			if (number >= 1000) { 
				// Add 'M' number/1000 times after index i 
				i = digit('M', number / 1000, i, c); 
				number = number % 1000; 
			} // If base value of number is greater than or 
			// equal to 500 
			else if (number >= 500) { 
				// To add base symbol to the character array 
				if (number < 900) { 
					// Add 'D' number/1000 times after index i 
					i = digit('D', number / 500, i, c); 
					number = number % 500; 
				} // To handle subtractive notation in case of number 
				// having digit as 9 and adding corresponding base 
				// symbol 
				else { 
					// Add C and M after index i/. 
					i = sub_digit('C', 'M', i, c); 
					number = number % 100; 
				} 
			} // If base value of number is greater than or equal to 100 
			else if (number >= 100) { 
				// To add base symbol to the character array 
				if (number < 400) { 
					i = digit('C', number / 100, i, c); 
					number = number % 100; 
				} // To handle subtractive notation in case of number 
				// having digit as 4 and adding corresponding base 
				// symbol 
				else { 
					i = sub_digit('C', 'D', i, c); 
					number = number % 100; 
				} 
			} // If base value of number is greater than or equal to 50 
			else if (number >= 50) { 
				// To add base symbol to the character array 
				if (number < 90) { 
					i = digit('L', number / 50, i, c); 
					number = number % 50; 
				} // To handle subtractive notation in case of number 
				// having digit as 9 and adding corresponding base 
				// symbol 
				else { 
					i = sub_digit('X', 'C', i, c); 
					number = number % 10; 
				} 
			} // If base value of number is greater than or equal to 10 
			else if (number >= 10) { 
				// To add base symbol to the character array 
				if (number < 40) { 
					i = digit('X', number / 10, i, c); 
					number = number % 10; 
				} // To handle subtractive notation in case of 
				// number having digit as 4 and adding 
				// corresponding base symbol 
				else { 
					i = sub_digit('X', 'L', i, c); 
					number = number % 10; 
				} 
			} // If base value of number is greater than or equal to 5 
			else if (number >= 5) { 
				if (number < 9) { 
					i = digit('V', number / 5, i, c); 
					number = number % 5; 
				} // To handle subtractive notation in case of number 
				// having digit as 9 and adding corresponding base 
				// symbol 
				else { 
					i = sub_digit('I', 'X', i, c); 
					number = 0; 
				} 
			} // If base value of number is greater than or equal to 1 
			else if (number >= 1) { 
				if (number < 4) { 
					i = digit('I', number, i, c); 
					number = 0; 
				} // To handle subtractive notation in case of 
				// number having digit as 4 and adding corresponding 
				// base symbol 
				else { 
					i = sub_digit('I', 'V', i, c); 
					number = 0; 
				} 
			} 
		} 

		// Printing equivalent Roman Numeral 
		System.out.printf("Roman numeral is: "); 
		for (int j = 0; j < i; j++) { 
			System.out.printf("%c", c[j]); 
		} 
	} 

//Driver program 
	public static void main(String[] args) { 
		int number = 3549; 

		printRoman(number); 
	} 
} 

