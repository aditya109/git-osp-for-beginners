const addParanthesisToResult = (left, right, str, result) => {
  if (left === 0 && right === 0) {
    result.push(str);
  }
  if (left > 0) {
    addParanthesisToResult(left - 1, right + 1, str + "(", result);
  }
  if (right > 0) {
    addParanthesisToResult(left, right - 1, str + ")", result);
  }
};

const generateParenthesis = (n) => {
  const result = [];
  addParanthesisToResult(n, 0, "", result);
  return result;
};


generateParenthesis(3) // ["((()))","(()())","(())()","()(())","()()()"]
generateParenthesis(1) // ["()"]
