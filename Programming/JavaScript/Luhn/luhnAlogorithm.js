/*Implementation of the Luhn Algorithm used to validate
a variety of identification numbers
such as credit card numbers
IMEI numbers, National Provider Identifier numbers etc.
*/

function luhnCheck(num) {
  var inputNum = num.toString();
  var sum = 0;
  var doubleUp = false;

  /* from the right to left, double every other digit starting with the second to last digit.*/
  for (var i = inputNum.length - 1; i >= 0; i--) {
    var curDigit = parseInt(inputNum.charAt(i));

    /* double every other digit starting with the second to last digit */
    if (doubleUp) {
      /* doubled number is greater than 9 than subtracted 9 */
      if (curDigit * 2 > 9) {
        sum += curDigit * 2 - 9;
      } else {
        sum += curDigit * 2;
      }
    } else {
      sum += curDigit;
    }
    var doubleUp = !doubleUp;
  }

  /* sum and divide it by 10. If the remainder equals zero, the original credit card number is valid.  */
  return sum % 10 == 0 ? true : false;
}

// This is a simple vanilla test suit i made to ensure that luhnCheck is work
// in order to run this suit use NodeJs on your CLI as below:
// node luhnALogorithm.js
testObj = {
  test1: luhnCheck("8675309") ? "PASS" : "FAILED", //Invalid number. Expcected False
  test2: luhnCheck("912030") ? "PASS" : "FAILED", // Valid number .Expected True
  test3: luhnCheck("829633842010") ? "PASS" : "FAILED", // Valid number .Expected True
  test4: luhnCheck("24859215489621") ? "PASS" : "FAILED", // Invalid number .Expected False
};
console.table(testObj);
