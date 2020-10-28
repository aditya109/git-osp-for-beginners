import java.util.Scanner;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    String roman;
      System.out.println ("Enter a roman Number");
      roman = s.nextLine ();
    RomantoInteger rm = new RomantoInteger ();
      rm.romantointeger (roman);

  }

  static class RomantoInteger
  {

    void romantointeger (String s)
    {
      int total = 0;
      for (int i = 0; i < s.length (); i++)
	{
	  int s1 = digitval (s.charAt (i));
	  if (i + 1 < s.length ())
	    {
	      int s2 = digitval (s.charAt (i + 1));
	      if (s1 >= s2)
		{
		  total = total + s1;
		}
	      else
		{
		  total = total - s1;
		}
	    }
	  else
	    {
	      total = total + s1;
	    }
	}
      System.out.println ("Output: " + total);
    }


    int digitval (char r)
    {

     if (r == 'I') 
      return 1; 
    if (r == 'V') 
      return 5; 
    if (r == 'X') 
      return 10; 
    if (r == 'L') 
      return 50; 
    if (r == 'C') 
      return 100; 
    if (r == 'D') 
      return 500; 
    if (r == 'M') 
      return 1000; 
    return -1; 
    }
}

} 
