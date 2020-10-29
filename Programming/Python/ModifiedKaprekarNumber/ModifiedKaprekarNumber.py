#!/bin/python3

# Program to find all the Kaprekar Numbers in the given range.

import math
import os
import random
import re
import sys

# Function to find the Kaprekar Numbers.
def kaprekarNumbers(p, q):
    lst = []
    for i in range(p, q+1):
        y = len(str(i))
        sq = i**2
        x = len(str(sq))
        r = int(sq%(10**y))
        l = int(sq/(10**y))
        if r+l == i:
            lst.append(int(i))
    if lst == []:
        print("INVALID RANGE")
        return
    lst.sort()
    for j in range(len(lst)):
        print(lst[j], end=' ')


# Main funtion to take inputs
if __name__ == '__main__':
    p = int(input())

    q = int(input())

    kaprekarNumbers(p, q)
