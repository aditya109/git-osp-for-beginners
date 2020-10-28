def get_integer_from_roman(roman):
	dictionary = {
		'I': 1,
		'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
	}
	prev, curr, ans = 0, 0, 0
	for char in roman:
		curr = dictionary.get(char)
		if not curr:
			return "Does not exist!"
		ans += curr - 2*prev if curr > prev else curr
		prev = curr
	return ans


def main():
	roman = input('Enter the roman number!\n')
	integer = get_integer_from_roman(roman)
	if integer == "Does not exist!":
		print(integer)
		print('Please give a correct number or in the range of 1 to 3999')
		return
	print(roman, '-->', integer)

if __name__ == '__main__':
	main()