#Contributed by @Hinal-Srivastava

import array as arr
from sympy import *

a = arr.array(int,[])
print("Enter any 20 elements in the array",end='')
for i in range(20):
    value = int(input())
    a.insert(value)

for i in range(20):    
    if(isprime(value)==True):
        print(a[i], " is prime", end='')
