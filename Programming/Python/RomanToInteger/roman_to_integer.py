from contextlib import suppress
from enum import IntEnum


class InvalidRomanNumber(Exception):
    """Custom exception to handle the particular exceptions
    that involve handling an invalid roman number.
    """

    def __init__(self, roman_number: str):
        """Constructor to add the invalid roman number to the message.

        :param str roman_number: String with the invalid roman number.
        """
        self.string = roman_number
        self.message = f"Invalid Roman Number: {roman_number}"


class RomanValues(IntEnum):
    """Class to know the conversion of a letter into integer.
    Each letter also specifies to what other letter they can subtract value.
    """

    I = 1, ['I', 'V', 'X']
    V = 5, ['V']
    X = 10, ['X', 'L', 'C']
    L = 50, ['L']
    C = 100, ['C', 'D', 'M']
    D = 500, ['D', 'M']
    M = 1000, ['M']

    def __new__(cls, value, next_values):
        obj = int.__new__(cls)
        obj._value_ = value
        obj.next_values = next_values
        return obj

    def __gt__(self, other):
        return self.value > other.value

    def __ne__(self, other):
        return other is None or self.value != other.value

    @classmethod
    def from_string(cls, number: str):
        """Function to receive a string with roman
        values and return an array of RomanValues.
        """
        array = []
        try:
            for letter in number:
                array.append(RomanValues[letter])
        except KeyError:
            raise InvalidRomanNumber(number)
        return array

    @classmethod
    def to_string(cls, roman_values) -> str:
        """Function to receive an array of RomanValues and return the original string.

        :param roman_values: Array of RomanValue to convert.
        :return str: Resulting string.
        """
        return ''.join([value.name for value in roman_values])


def assert_roman_number(roman_values: [RomanValues]):
    """Function to validate whether a sequence of RomanValues is valid.
    It checks that there are no more than 3 consecutive appearances of the same letter.
    It also checks that a letter is not subtracting from an invalid one (e.g. IM)

    :param [RomanValues] roman_values: Array of RomanValues to verify.
    :raise InvalidRomanSyntax:
    """

    cur = None
    count = 0
    for index in range(len(roman_values)):

        letter = roman_values[index]
        if letter != cur:
            cur = letter
            count = 1
        else:
            # Count occurrences of the same letter.
            count += 1
            if count > 3:
                raise InvalidRomanNumber(RomanValues.to_string(roman_values))

        with suppress(IndexError):
            next_letter = roman_values[index + 1]
            if next_letter.name not in letter.next_values and next_letter > letter:
                # Not every letter can be used to subtract from another one.
                # In the RomanValue constructor it is specified which ones are allowed.
                raise InvalidRomanNumber(RomanValues.to_string(roman_values))


def roman_to_integer(roman_string: str) -> int:
    """Function that receives a string with roman values and returns the integer value.
    It ensures the validity of the string and performs the conversion to integer.

    :param str roman_string: String from where to extract the roman number.
    :return int: Integer value of the roman number.
    """

    # Roman numbers must be in capital letters.
    roman_string = roman_string.upper()
    # Extract the sequence of RomanValue.
    roman_values = RomanValues.from_string(roman_string)
    # Ensure that it is a valid roman number
    assert_roman_number(roman_values)

    # Iterate for every letter except the last one.
    # It will be added afterwards if necessary.
    index = total_sum = 0
    while index < len(roman_values) - 1:
        # Take the current letter and the next one.
        value = roman_values[index].value
        next_value = roman_values[index + 1].value
        # If the current letter is less than the next one,
        # subtract it and skip one position.
        if value < next_value:
            total_sum += next_value - value
            index += 1
        else:
            # Otherwise, add the letter's value to the total sum.
            total_sum += value
        index += 1

    with suppress(IndexError):
        # If the last digit was a subtraction there
        # is no last number to sum (IndexError).
        total_sum += roman_values[index].value

    return total_sum


if __name__ == "__main__":
    roman = 'III'  # 3
    integer = roman_to_integer(roman)
    print(f'Roman {roman} converts to {integer}')

    roman = 'IX'  # 9
    integer = roman_to_integer(roman)
    print(f'Roman {roman} converts to {integer}')

    roman = 'XC'  # 90
    integer = roman_to_integer(roman)
    print(f'Roman {roman} converts to {integer}')

    roman = 'MCMXCIV'  # 1994
    integer = roman_to_integer(roman)
    print(f'Roman {roman} converts to {integer}')

    try:
        roman = 'IIII'  # INVALID
        integer = roman_to_integer(roman)
        print(f'Roman {roman} converts to {integer}')
    except InvalidRomanNumber:
        print(f'The string {roman} does not contain a valid roman number.')

    try:
        roman = 'IM'  # INVALID
        integer = roman_to_integer(roman)
        print(f'Roman {roman} converts to {integer}')
    except InvalidRomanNumber:
        print(f'The string {roman} does not contain a valid roman number.')
