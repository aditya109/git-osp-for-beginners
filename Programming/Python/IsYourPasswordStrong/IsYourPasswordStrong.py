''' Create a Program that checks if the given password is strong or not. If the password is strong then it should return True and if password is not strong enough then it should return False.

Here are the conditions for the password to be strong:
  Its length is at least 8.
  It contains at least one digit.
  It contains at least one lowercase English character.
  It contains at least one uppercase English character.
  It contains at least one special character. The special characters are: !@#$%^&*()-+

Author: @Aashrut
'''

# Function that will check if password is strong or not.    
def isStrong(password):
    
    # function to check if it contains at least one digit using isdigit() string method.
    def have_least_one_digit(password):
        for word in password:
            if word.isdigit():
                return True
        return False
        
    # function to check if it contains at least one lowercse letter using islower() string method.
    def have_least_lower_letter(password):
        for word in password:
            if word.islower():
                return True
        return False
        
    # function to check if it contains at least one uppercase letter using isupper() string method.
    def have_least_upper_letter(password):
        for word in password:
            if word.isupper():
                return True
        return False
        
    # function to check if it contains at least one special character by using in keyword to check if character is avilable in our required characters.
    def have_least_special_char(password):
        for word in password:
            if word in "!@#$%^&*()-+":
                return True
        return False
    
    # The below function will check if it contains at least 8 characters and check if all other conditions are also true. And it will return final answer.
    if len(password) >= 8:
        if have_least_one_digit(password) and have_least_lower_letter(password) and have_least_upper_letter(password) and have_least_special_char(password):
            return True
        else:
            return False

# To check the function, uncomment the code below.
# print(isStrong('ADG787gbujI^%^%T&g')) # Outputs True
# print(isStrong('AGjy%^&gtf')) # Outputs False
