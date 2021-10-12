"""
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example -1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
"""

class Solution(object):
    
   #  Storing the generated string
   def generateParenthesis(self, n):
      result = []
      self.generateRecurParen(n,n,"",result)
      return result
   
   # Recursive call to left and right paren
   def generateRecurParen(self, left,right,temp,result):
      if left == 0 and right == 0:
         result.append(temp)
         return
      if left>0:
         self.generateRecurParen(left-1,right,temp+'(',result)
      if right > left:
         self.generateRecurParen(left, right-1, temp + ')', result)

# Making object
object1 = Solution()
n = int(input("Enter the number of pairs: "))
print(object1.generateParenthesis(n))