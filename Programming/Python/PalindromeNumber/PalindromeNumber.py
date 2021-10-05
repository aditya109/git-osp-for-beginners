# Given an integer x, return true if x is palindrome integer.
def palindromeNumber(x):
    # Negative numbers can not be palindrome
    if x < 0:
        return False

    # 1 digit numbers are palindrome
    if x < 10:
        return True

    # Converting the number to string and comparing with its reverse
    return str(x) == str(x)[::-1]
