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
