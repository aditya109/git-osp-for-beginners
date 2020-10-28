""" DESCRIPTION

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

Example 1:

Input: num = 3
Output: "III"

Example 2:

Input: num = 4
Output: "IV"

Example 3:

Input: num = 9
Output: "IX"

Example 4:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Example 5:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Constraints:
    1 <= num <= 3999

""" 


""" APPROACH

Approach : 1

1. Extract the digits of the number
2. Maintain a leng variable for number of digits
3. Recursively call the process function using leng as argument 
4. Return the roman literal as answer
"""


def convert(num:int)->str:
    """ Function to convert integer to roman literal
    

    Example: 
        >>> convert(5)
        "V"
        >>> convert(1994)
        "MCMXCIV"

    Args:
        num (int): The number to be converted into Roman literal

    Attributes:
        k (List[int]): The list of digits
        leng (int): The number of digits in num
        ans (str): The roman literal created

    Returns: 
        ans (str): The roman literal corresponding to num   
    """

    k = []
    leng = 0
    while num:
        k.append(num%10)
        leng+=1
        num//=10
    ans = ""
    def process(leng):

        """ Function to process digits recursively
    

        Example: 
            >>> process(5)
            "V"
            >>> process(1994)
            "MCMXCIV"

        Args:
            leng (int): The number of digits of the number
            k (List[int]) : The list of digits

        Attributes:
            ans (str): The roman literal being created

        Returns: 
            ans (str): The roman literal corresponding to num   
        """

        nonlocal ans
        if leng==0 or len(k)==0:
            return 
        if leng==4:
            if k[leng-1]!=4:
                ans+="M"*k[leng-1]
            process(leng-1)
        elif leng==3:
            if k[leng-1]>=5:
                if k[leng-1]!=9:
                    ans+="D"+"C"*(k[leng-1]-5)
                else:
                    ans+="CM"
            else:
                if k[leng-1]!=4:
                    ans+="C"*k[leng-1]
                else:
                    ans+="CD"
            process(leng-1)
        elif leng==2:
            if k[leng-1]>=5:
                if k[leng-1]!=9:
                    ans+="L"+"X"*(k[leng-1]-5)
                else:
                    ans+="XC"
            else:
                if k[leng-1]!=4:
                    ans+="X"*k[leng-1]
                else:
                    ans+="XL"
            process(leng-1)
        elif leng==1:
            if k[leng-1]>=5:
                if k[leng-1]!=9:
                    ans+="V"+"I"*(k[leng-1]-5)
                else:
                    ans+="IX"
            else:
                if k[leng-1]!=4:
                    ans+="I"*k[leng-1]
                else:
                    ans+="IV"
            process(leng-1)
    process(leng)
    return ans
    


def main():
    """ Main function to receive input from the user
        
    Example:  For running the program,

            $ python3 integerToRoman.py
            Input:
            num = 5

    Attributes: 
        num(int): 

    Returns: 
        roman(string) : A string corresponding to the roman literal
    """

    print("Input: ")
    num = int(input("num = "))
    print(convert(num))

if __name__ == '__main__':
    main() 