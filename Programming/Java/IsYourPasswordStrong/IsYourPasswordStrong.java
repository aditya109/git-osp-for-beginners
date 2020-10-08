''' Create a Program that checks if the given password is strong or not. If the password is strong then it should return True and if password is not strong enough then it should return False.

Here are the conditions for the password to be strong:
  Its length is at least 8.
  It contains at least one digit.
  It contains at least one lowercase English character.
  It contains at least one uppercase English character.
  It contains at least one special character. The special characters are: !@#$%^&*()-+

Author: @BhargaviChada
'''

public class IsPasswordStrong{
	
    // function to check if it contains at least one digit using isDigit() method
      public static boolean hasLeastOneDigit (String password) {
        for(int i=0;i<password.length();i++){
         char c=password.charAt(i);
         if(Character.isDigit(c)){
	   return true;
           }
         }
	  return false;
      }
   // function to check if it contains at least one lowercase letter using isLowerCase() method
     public static boolean hasLowerCaseLetter(String password){
        for(int i=0;i<password.length();i++){
	 char c=password.charAt(i);
	   if(Character.isLowerCase(c)){
	     return true;
	     }
         }
          return false;
     }    
   // function to check if it contains at least one uppercase letter using isUpperCase() method
     public static boolean hasUpperCaseLetter(String password){
        for(int i=0;i<password.length();i++){
	 char c=password.charAt(i);
	    if(Character.isUpperCase(c)){
		return true;
		    }
	 }
	   return false;
    }    
   // function to check if it contains at least one special character by using in keyword to check if character is available in our required characters.
      public static boolean hasLeastOneSpecialChar(String password){
	 for(int i=0;i<password.length();i++){
          char c=password.charAt(i);
            if(c =='!'||c =='@'||c =='#'||c =='$'||c =='%'||c =='^'||
	       c =='&'||c =='*'||c =='('||c =='\''||c ==')'||c =='-'||c =='+'){
		 return true;
		    }
         }
           return false;
    }
    // The below function will check if it contains at least 8 characters and check if all other conditions are also true. And it will return final answer.
    public static boolean isStrong(String password){
	if (password.length()>= 8){
	 if (hasLeastOneDigit(password) && hasLowerCaseLetter(password) && hasUpperCaseLetter(password) && hasLeastOneSpecialChar(password)){
	   return true;
           }
          else{
	     return false;
	     }
           }
           return false;
    }

    public static void main(String args[]) 
    { 
  
         // To check the function, uncomment the code below.
         //   String str1 = "ADG787gbujI^%^%T&g"; 
	 //   System.out.println(isStrong(str1));
	 //   String str2 ="AGjy%^&gtf";
	 //   System.out.println(isStrong(str2));
      
    } 
} 