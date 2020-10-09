/*If the password is strong then it should return True and if the password is not strong enough then it should return False.
Here are the conditions for the password to be strong:

Its length is at least 8.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
"ADG787gbujI^%^%T&g" will output True
"AGjy%^&gtf" will output False
*/
public class StrongPsswd {
    public static void main(String[] args) {
        String pswd="AGjy%^&gtf";
       boolean b= PsswdStrong(pswd);
        System.out.println(b);
    }
    public static boolean PsswdStrong(String pswd){
        boolean b=false;
        if(pswd.length()<8){
            return false;
        }
        if(pswd.contains(" ")){
            return false;
        }
         if( pswd.matches("(?=.*[a-z]).*") ){
             if(pswd.matches("(?=.*[A-Z]).*")){
                 if(pswd.matches("(?=.*[0-9]).*") ){ 
                     if(pswd.contains("!")||pswd.contains("@")||pswd.contains("#")||pswd.contains("$")||pswd.contains("%")||pswd.contains("^")||pswd.contains("&")||pswd.contains("*")||pswd.contains("(")||pswd.contains(")")||pswd.contains("+")||pswd.contains("-")){
                         b=true;
                     }
                 }
             }
         }
         return b;
}
}