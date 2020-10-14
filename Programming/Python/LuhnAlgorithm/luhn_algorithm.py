# This is an algorithm that checks whether the given credit card is valid or not as well
# as displays it belongs to which company.
#
# Based on the explanation of this README.md file:
# https://github.com/hryxna/git-osp-for-beginners/blob/master/Programming/Java/Luhn'sAlgorithm/README.md
#
# Attempt to solve this issue:
# https://github.com/aditya109/git-osp-for-beginners/issues/178

def clean_input(cc_number: str) -> str:
    """Function to clean the input from the user. It will remove all the characters
    in the string that are not a number.

    :param str cc_number: Credit card number to be cleaned.
    :return: The resulting string.
    """
    import re
    return re.sub(r'^[0-9]$', '', cc_number)


def is_valid_issuer(cc_number: str) -> bool:
    """Function that returns whether a credit card number is issued by one of the
    documented issuers. The validation is made using a dictionary that contains all the
    conditions to be created by a certain issuer. It will also print the issue name.

    :param str cc_number: Credit card number to verify.
    :return: True if is valid, False otherwise.
    """
    card_issuers = [
        {
            'name': 'MASTERCARD',
            'first_digits': ['51', '52', '53', '54', '55'],
            'n_digits': [16]
        },
        {
            'name': 'AMERICA EXPRESS',
            'first_digits': ['34', '37'],
            'n_digits': [15]
        },
        {
            'name': 'VISA',
            'first_digits': ['4'],
            'n_digits': [13, 16]
        }
    ]

    # Total length of the card number.
    length = len(cc_number)
    # We need to get the first character and the first 2 characters to validate.
    prefix1, prefix2 = cc_number[0], cc_number[:2]
    for issuer in card_issuers:
        # Check that the length is appropriate.
        if length not in issuer['n_digits']:
            continue
        # Check if the number starts with the characters that'd be used by the issuer.
        if prefix1 in issuer['first_digits'] or prefix2 in issuer['first_digits']:
            print(f"Issuer: {issuer['name']}")
            return True
    else:
        return False


def luhn_algorithm(digits: [int]) -> bool:
    """Function that implements the Luhn algorithm. It receives a list of digits,
    applies Luhn's algorithm and returns whether the credit card is valid or not.

    :param [int] digits: List of digits.
    :return: True if the card number passes the test, False otherwise.
    """

    # One way to take the even numbers starting from the end is to simply separate both
    # groups and decide which is which according to the length of the number.
    if len(digits) % 2 == 0:
        even_digits = digits[::2]
        odd_digits = digits[1::2]
    else:
        even_digits = digits[1::2]
        odd_digits = digits[::2]

    # Next step is to take the even numbers, multiply them by 2 and sum the result.
    # If the multiplication result is 10 or more, sum the digits. In order to prevent
    # implementing a function to sum the digits, since the possible combinations are
    # pretty limited, I used a dictionary with the only possible values after
    # multiplying and adding the digits.
    loop_prevention = {5: 1, 6: 3, 7: 5, 8: 7, 9: 9}
    even_sum = 0
    for element in even_digits:
        if element >= 5:
            even_sum += loop_prevention[element]
        else:
            even_sum += element * 2

    # Sum the digits in the odd positions and create the checksum.
    odd_sum = sum(odd_digits)
    checksum = even_sum + odd_sum

    # Return True if the checksum ends with 0.
    return checksum % 10 == 0


def verify_credit_card(cc_number: str) -> bool:
    """Function to verify if a user given input is a valid credit card or not.
    It will clean the user's input, check if there's any valid issuer and perform
    Luhn's algorithm to validate the number. It will also log the results.

    :param str cc_number: The user input.
    :return: Whether the cleaned user input is a valid credit card number.
    """

    # Clean the card number.
    card_number = clean_input(cc_number)
    print(f"Card: {card_number}")

    # Check if there's any valid issuer.
    if not is_valid_issuer(card_number):
        print("Invalid issuer")
        return False

    # Split the string into a list of integers, one element for each digit.
    digits = list(map(int, list(card_number)))
    result = luhn_algorithm(digits)
    print(f"Status: {'' if result else 'in'}valid")
    return result


if __name__ == "__main__":
    # List of valid credit card numbers taken from this website:
    # https://www.paypalobjects.com/en_US/vhelp/paypalmanager_help/credit_card_numbers.htm
    test_cards = ['378282246310005', '5105105105105100', '4012888888881881']
    for card in test_cards:
        print('---------------')
        verify_credit_card(card)
    print('---------------')
