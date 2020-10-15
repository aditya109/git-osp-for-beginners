// Implementation of the Luhn Algorithm used to validate
//  a variety of identification numbers
// such as credit card numbers
// IMEI numbers, National Provider Identifier numbers etc.

const luhnCheck = (num) => {
  let arr = (num + "")
    //   Use Array.prototype.splice(0,1) to obtain the last digit.
    .split("")
    .reverse()
    .map((x) => parseInt(x));
  let lastDigit = arr.splice(0, 1)[0];
  //   Use Array.prototype.reduce() to implement the Luhn Algorithm.
  let sum = arr.reduce(
    (acc, val, i) => (i % 2 !== 0 ? acc + val : acc + ((val * 2) % 9) || 9),
    0
  );
  sum += lastDigit;
  //   Return true if sum is divisible by 10, false otherwise.
  return sum % 10 === 0;
};

// This is a simple vanilla test suit i made to ensure the luhnCheck is word
// in orer to run this suite use NodeJs on your CLI as below:
// node luhnALogorithm.js
testObj = {
  test1: luhnCheck("4485275742308327") ? "PASS" : "FAILD", //Expcected True
  test2: luhnCheck("6011329933655299") ? "FAILD" : "PASS", // Expected False
  test3: luhnCheck("123456789") ? "FAILD" : "PASS", //Exptected False
};
console.table(testObj);
