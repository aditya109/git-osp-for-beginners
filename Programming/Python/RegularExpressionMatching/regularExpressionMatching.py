""" DESCRIPTION

Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).


Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

Example 3:

Input: s = "ab", p = "."
Output: true
Explanation: "." means "zero or more (*) of any character (.)".

Example 4:

Input: s = "aab", p = "cab"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".

Example 5:

Input: s = "mississippi", p = "misisp*."
Output: false

Constraints:
0 <= s.length <= 20
0 <= p.length <= 30
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.

""" 


""" APPROACH

Approach : 1

1. Using re in python3 
2. Compile a regex pattern using re
3. Match the regex pattern with given string
4. Generate Appropriate Output 

"""


import re

def check(string:str, pattern:str)->bool:
	""" Function to check if string matches with the pattern 
	

	Example: 
		>>> check("aa","a")
		false
		>>> check("aa", "a*")
		true

	Args:
		string (str): The string to be matched
		pattern (str): The regular expression pattern to match the string
	
	Attributes:
		regex (re): The regular expression compiled using pattern

	Returns: 
		bool
	"""

	regex = re.compile(pattern)
	return True if regex.fullmatch(string) else False


def main():
	""" Main function to recieve input from the user
		
	Example:  For running the program,

			$ python3 regularExpressionMatching.py
			Input:
			s = aa
			p = a

	Attributes: 
		s(string): String to be matched with the given pattern 
		p(string): Regular Expression pattern to match the given string
		
	Returns: 
		None

	Note: 
		Prints true if string matches the regular expression else false
	"""

	print("Input: ")
	s = input("s = ")
	p = input("p = ")
	print(check(s, p))

if __name__ == '__main__':
	main() 