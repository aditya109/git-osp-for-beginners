# **Luhn's Algorithm**

> This is an algorithm that checks whether the given **credit card** is valid or not as well as displays it belongs to which company.<br>
> That is whether it belongs to **MASTERCARD**, **VISA**, **AMERICAN EXPRESS**.<br>

### NOTE :
#### For the mentioned cards it will check their first digits as well as the total no. of digits that are mentioned below :

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

#### For the main part find whether checksum % 10 is "0" or not ?
<pre>
- Inorder to calculate checksum we have to do two things
  
  1. Multiply the even no. of digits starting from the rear-end till front-end.
    * E.g: 123456 = 5*2 + 3*2 + 1*2 = 10 + 6 + 2.
    * Also if any product is 2-digit no. then we have to split them add them.
    * i.e : 5 * 2  = 10  which would be written as 1 + 0 + 6 + 2 = 9.
    
  2. Add the digits that are not multiplied by 2 starting from rear-end till front-end.
    * E.g: 6 + 4 + 2 = 12.
  
  3. Lastly add both sum of even and odd no. of digits which we calculated earlier.
    * E.g checksum = odd + even = 9 + 12 = 21.

</pre>

#### Very Last step is to check whether the checksum divided by 10 would give us remainder "0" or not ?

> If so then the credit no. is valid and needs to verify its length and if it's also valid then woo-hoo :tada: you have a valid credit card.<br>

> Else if it doesn't which means you have an invalid card :stuck_out_tongue:.<br>

> In our example 21 % 10 = 1. which means our credit card is not valid. 
