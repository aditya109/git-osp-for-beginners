function isPalindrome(str) {
  // Convert to lower case and replace
  // any non - alpha or digit character with empty string.
  str = str.toLowerCase().replace(/[^a-z\d]/g, '');
  
  //Now by 2 pointer approach by making pointers at initial position and end position
  // either they meet or pass each other.
  for (let i = 0, j = str.length - 1; i < j; i++, j--) {
    if (str[i] !== str[j]) return false;
  }
  
  // If the loop completed with no issues,
  // the string is a valid palindrome.
  return true;
}

//Example - String is 'race a car':
//Output : False

//Example - String is 'madam';
//Output : True

//Time Complexity:
//Best ,Worst and Average complexity : O(n)

//Space Complexity:
//Space Complexity of above program : O(1)