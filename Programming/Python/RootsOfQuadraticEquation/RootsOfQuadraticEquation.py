# Python program to find roots of quadratic equation 
from math import sqrt
while 1:
    a = int(input('Value of a : '))
    if a == 0:
        print('Not Quadratic Equation.')
        continue
    else:
        break
b = int(input('Value of b : '))
c = int(input('Value of c : '))



# calculating discriminant using formula 
dis = b * b - 4 * a * c 
sqrt_val = sqrt(abs(dis)) 

# checking condition for discriminant 
if dis > 0: 
	print(" real and different roots ") 
	print((-b + sqrt_val)/(2 * a)) 
	print((-b - sqrt_val)/(2 * a)) 

elif dis == 0: 
	print(" real and same roots") 
	print(-b / (2 * a)) 
	
# when discriminant is less than 0 
else: 
	print("Complex Roots") 
	print(- b / (2 * a), " + i", sqrt_val) 
	print(- b / (2 * a), " - i", sqrt_val) 





