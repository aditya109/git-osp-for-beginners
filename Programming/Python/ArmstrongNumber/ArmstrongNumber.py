def ArmstrongNumber(num):
    # Changed num variable to string,
    # and calculated the length (number of digits)
    order = len(str(num))

    # initialize sum
    sum = 0

    # find the sum of the cube of each digit
    temp = num
    while temp > 0:
        digit = temp % 10
        sum += digit ** order
        temp //= 10
    if num == sum:
        return True
    return False


# Driver Code
# num = 407
# result = ArmstrongNumber(num)
# if result == True:
#     print("Armstrong Number")
# else:
#     print("Not an Armstrong Number")
