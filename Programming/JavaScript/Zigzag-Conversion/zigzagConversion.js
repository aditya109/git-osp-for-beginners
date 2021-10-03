function zigzag(s, n) {
  const arraySet = [];
  for (let i = 0; i < n; i++) {
    arraySet[i] = [];
  }

  let change = false;
  let count = 1;
  for (let i = 0; i < s.length; i++) {
    if (!change) {
      arraySet[count - 1].push(s.charAt(i));
    } else {
      arraySet[n - count - 1].push(s.charAt(i));
    }

    if ((count === n && !change) || (count === n - 2 && change)) {
      count = 0;
      change = !change;
    }
    count++;
  }

  let convertedString = "";
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < arraySet[i].length; j++) {
      convertedString = convertedString + arraySet[i][j];
    }
  }

  return convertedString;
}

function main() {
  let s = "WE_ARE_HIRING";
  var n = 4;
  /* eslint-disable no-console */
  console.log(zigzag(s, n));
  /* eslint-enable no-console */
}

main();
