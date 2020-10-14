# **Luhn's Algorithm**

> This is an algorithm that checks whether the given **credit card** is valid or not as well as displays it belongs to which company.<br>
> That is whether it belongs to **MASTERCARD**, **VISA**, **AMERICAN EXPRESS**.<br>

### NOTE :
#### For the mentioned cards it will check their first digits as well as the total no. of digits that here mentioned below :

<pre>
- MASTERCARD
  * First Digits  = 51, 52, 53, 54, 55. 
  * No. of digits = 16
  
- AMERICAN EXPRESS          
  * First Digits  = 34 or 37.
  * No. of digits = 15
  
- VISA                               
  * First Digits  = 4.
  * No. of digits = 13 or 16
</pre>

#### For the main part it find whether checksum is "0" or not
<pre>
- Inorder to calculate checksum we have to do two things
  
  1. Multiply the even no. of digits starting from the rear-end till front-end.
    * E.g: 123456 = 5*2 + 3*2 + 1*2 = 10 + 6 + 2.
    * Also if any product is 2-digit no. then we have to split them add them.
    * i.e : 5 * 2  = 10 which would be written as 1 + 0 + 6 + 2 = 13.
    
  2. Add the digits that are not multiplied by 2 starting from rear-end front-end.
    * E.g: 6 + 4 + 2 = 12.
  
  3. Lastly add both sum of even and odd no. of digits which we calculated earlier.

</pre>

#### Very Last step is to check whether the checksum divided my 10 would give us remainder "0"
> if so then the credit no. is valid and need to very it's length and it's also valid then woo-hoo :tada: you have a valid credit card<br>
> else if doesn't which mean you have invalid card :stuck_out_tongue:
