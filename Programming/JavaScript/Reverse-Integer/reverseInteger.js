function reverseInteger(num) {
  let signed = 1;

  if(+num < 0) {
    signed = -1;
    num = signed * num;
  }

  const digitsArray = num.toString().split('');
  digitsArray.reverse();

  return +digitsArray.join('') * signed;
}

// Test
const num = 123;
console.log(reverseInteger(num));
