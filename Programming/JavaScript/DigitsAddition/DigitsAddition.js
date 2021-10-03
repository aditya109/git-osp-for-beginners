const main = () => {
  const input = 254;
  const output = sumDigits(input);
  console.log(output);
  return output;
};

const sumDigits = (input) => {
  const inputString = input.toString();
  let subOfDigits = 0;
  for (let index = 0; index < inputString.length; index++) {
    subOfDigits += parseInt(inputString.charAt(index));
  }
  return subOfDigits;
};

main();
