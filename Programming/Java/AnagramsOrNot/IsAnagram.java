package isAnagram;



	import java.util.Scanner;
	public class IsAnagram {
	 

	    static boolean isAnagram(String s1, String s2) {
	        // Complete the function
	        boolean isanagram=false;
	     if(s1.length()==s2.length()){
	        int x=s1.length();
	         boolean[] v=new boolean[x];

	         for(int i=0;i<x;i++)
	         {
	             isanagram=false;
	             char c1=s1.charAt(i);
	             for(int j=0;j<x;j++){
	                 char ch=s2.charAt(j);
	             if(Character.toUpperCase(c1)==Character.toUpperCase(ch) && !v[j])
	{

	          isanagram=true;
	             v[j]=true;
	             break;
	         
	             }
	            if (!isanagram)
	            break;
	         }


	     } 
	     }
	     return isanagram; 
	     
	    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
	

