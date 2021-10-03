public class CheckStrongPassword {


	public static void main(String[] args) {
		/*Test Case 1
		 * Input :"ADG787gbuj%"
		 * Expected Output: true
		 */
		System.out.println(checkPassword("ADG787gbuj%"));

		/*Test Case 2
		 * Input :"AGjy%^&gtf"
		 * Expected Output: false
		 */
		System.out.println(checkPassword("AGjy%^&gtf"));

		/*Test Case 3
		 * Input :"Aa1*"
		 * Expected Output: false
		 */
		System.out.println(checkPassword("Aa1*"));


	}

	public static boolean checkPassword(String str) {
		//Check length of string
		if (str.length() < 8) {
			return false;
		}
		boolean lowerCase = false;
		boolean upperCase = false;
		boolean special = false;
		boolean number = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// Check if the required conditions are already satisfied.
			if (lowerCase && upperCase && special && number)
				return true;
			// Check for upper case letter
			if (Character.isUpperCase(ch))
				upperCase = true;
			// Check for lower case letter
			else if (Character.isLowerCase(ch))
				lowerCase = true;
			// Check for number
			else if (Character.isDigit(ch))
				number = true;
			// Check for special characters
			else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&'
					|| ch == '*' || ch == '(' || ch == '\'' || ch == ')' || ch == '-' || ch == '+')
				special = true;
			// If none of the required ,return false
			else
				return false;

		}
		// Final check if the conditions get satisfied at the very last character
		if (lowerCase && upperCase && special && number)
			return true;
		else
			return false;
	}

}
