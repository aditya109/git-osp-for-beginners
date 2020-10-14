def clean_input(cc_number) -> str:
    import re
    return re.sub(r'^[0-9]$', '', cc_number)


def is_valid_issuer(cc_number: str) -> bool:
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

    length = len(cc_number)
    prefix1, prefix2 = cc_number[0], cc_number[:2]
    for issuer in card_issuers:
        if length not in issuer['n_digits']:
            continue
        if prefix1 in issuer['first_digits'] or prefix2 in issuer['first_digits']:
            return True
    else:
        return False


def luhn_algorithm(digits: [int]) -> bool:
    if len(digits) % 2 == 0:
        even_digits = digits[::2]
        odd_digits = digits[1::2]
    else:
        even_digits = digits[1::2]
        odd_digits = digits[::2]

    loop_prevention = {5: 1, 6: 3, 7: 5, 8: 7, 9: 9}
    even_sum = 0
    for element in even_digits:
        if element >= 5:
            even_sum += loop_prevention[element]
        else:
            even_sum += element * 2

    odd_sum = sum(odd_digits)
    checksum = even_sum + odd_sum

    return checksum % 10 == 0


def verify_credit_card(cc_number: str) -> bool:
    card_number = clean_input(cc_number)
    if not is_valid_issuer(card_number):
        print(f"Card '{card_number}' is invalid.")
        return False

    digits = list(map(int, list(card_number)))
    result = luhn_algorithm(digits)
    print(f"Card '{card_number}' is {'' if result else 'in'}valid.")
    return result


if __name__ == "__main__":
    # American Express
    verify_credit_card('378282246310005')
    # Mastercard
    verify_credit_card('5105105105105100')
    # Visa
    verify_credit_card('4012888888881881')
