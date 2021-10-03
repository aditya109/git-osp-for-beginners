// If the password is strong then it should return True and if the password is not strong enough then it should return False.
// Here are the conditions for the password to be strong:

// Its length is at least 8.
// It contains at least one digit.
// It contains at least one lowercase English character.
// It contains at least one uppercase English character.
// It contains at least one special character. The special characters are: !@#$%^&*()-+
// "ADG787gbujI^%^%T&g" will output True
// "AGjy%^&gtf" will output False


import java.util.*;
//Checks if the password is strong or not
public class IsStrongPassword {
    public boolean PasswordCheck(String s){                       //.* represents any character
        if(s.length()>=8){                                        //Checks the length of password
            if(s.matches("(.*[A-Z].*)")){                         //Checks if there is atleast one Uppercase Character
                if(s.matches("(.*[a-z].*)")){                     //Checks if there is atleast one Lowercase Character
                    if(s.matches("(.*[0-9].*)")){                 //Checks if there is atleast one digit
                        if(s.matches("(.*[ !@#$%^&*()-+].*)")){   //Checks if there is atleast one special character
                            return true;
                        }
                        //Uncomment print statements to check what the password is missing if not strong.
                        else{
                            //System.out.println("Not Strong: Enter a special character");
                            return false;
                        }
                            
                    }
                    else{
                        //System.out.println("Not Strong: Enter a digit");
                        return false;
                    }
                        
                }
                else{
                    //System.out.println("Not Strong: Enter a letter in Lowercase");
                    return false;
                }
            }
            else{
                //System.out.println("Not Strong: Enter a letter in Uppercase");
                return false;
            }  
        }
        else{
            //System.out.println("Not Strong: Password should be greater than length 7 ");
            return false;
        }
    }
    //Driver function
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //input password
        String s = scan.next();
        IsStrongPassword obj= new IsStrongPassword();
        //calls function PasswordCheck
        System.out.println(obj.PasswordCheck(s));
        scan.close();
    }
}
