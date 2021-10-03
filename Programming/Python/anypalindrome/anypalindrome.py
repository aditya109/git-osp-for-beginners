#A program to check if the list whose values are given by the user follow these conditions:
#1. All of the numbers are positive
#2.Atleast one palindromic integer
# If both these conditions are satisfied, it will return True otherwise it will return false

#Function to check if a number is a palindrome
#we are taking the given number as string and reversing it checking if they are equal
def is_palindrome(x):
	if x == x[::-1]: 
		return True
	else:
		return False

#function to check if number is positive
def is_positive(x):
	num = int(x)
	if num>0:
		return True
	else:
		return False

input_list = input("Enter the numbers you want to add to your list : ")

#the following line splits our input when a space is detected and convert into an element of a list
final_list = input_list.split()  

#calling our functions
if all(is_positive(x) for x in final_list): 
	if any(is_palindrome(x) for x in final_list):
		print("True")
else:
	print("False")
