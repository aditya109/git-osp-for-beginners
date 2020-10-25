value_conv = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000
}


def roman_to_integer(roman: str) -> int:
    roman = roman.upper()
    values = []
    for letter in roman:
        values.append(value_conv[letter])

    real_values = []
    index = 0
    while index < len(values):
        try:
            if values[index] < values[index + 1]:
                real_values.append(values[index + 1] - values[index])
                index += 1
            else:
                real_values.append(values[index])
        except IndexError:
            real_values.append(values[index])
        index += 1

    return sum(real_values)


if __name__ == "__main__":
    roman_to_integer('III')
    roman_to_integer('IX')
    roman_to_integer('MCMXCIV')
