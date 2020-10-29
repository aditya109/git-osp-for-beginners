# Lunh's Alogrithm

import re

# Luhn's Algorithm to fing the checksum


def luhnAlgo(ccno):

    even = 0
    odd = 0
    counter = 1
    while ccno > 0:

        if counter % 2 == 0:
            t = (ccno % 10) * 2
            even += (t % 10) + (t // 10)
        else:
            odd += ccno % 10

        ccno //= 10
        counter += 1

    return (even + odd) % 10

# First Digit Checker Function


def fDigitChecker(cno):

    ftcno = int(str(cno)[:2])
    fcno = int(str(cno)[:1])

    # American Express
    if ftcno == 34 or ftcno == 37:
        return 15
    # Master Card
    elif 51 <= ftcno <= 55:
        return 16
    # Visa
    elif fcno == 4:
        return 13
    # if not found
    else:
        return -1

# Length Validator Function


def lenValidator(len):

    if len == 13 or len == 15 or len == 16:
        return True
    else:
        return False


# Loop that runs infinitely and breaks on the correct input
while True:

    creditCardString = str(input("Enter the Credit-Card No. : "))

    # removing unwanted '-' characters from the input if they are there
    creditCard = int(re.sub('-', '', creditCardString))

    if creditCard > 0 and not re.findall('-', creditCardString):
        break

# Getting the length of credit card
creditCardLen = len(str(creditCard))
# Length Validator Boolean
valid = lenValidator(creditCardLen)
# CheckSum from the Algorithm
checkSum = luhnAlgo(creditCard)
# first digit's checker
fDigit = fDigitChecker(creditCard)

if valid and checkSum == 0 and creditCardLen in [13, 15, 16]:

    # Master Card len = 16 and First-Digits are 51, 52, 53, 54, 55
    if creditCardLen == fDigit == 16:
        print("MASTERCARD")

    # American Express len = 15 and First-Digits are 34 or 37
    elif creditCardLen == fDigit == 15:
        print("AMEX")

    # Visa len = 13 or 16 and First-Digit is 4
    else:
        print("VISA")

else:
    print("INVALID")


