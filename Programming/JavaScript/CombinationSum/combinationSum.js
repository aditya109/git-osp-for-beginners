const combinationSum = (candidates, target) => {
  const result = [];
  const permute = (arr = [], sum = 0, idx = 0) => {
    if (sum > target) return;
    if (sum === target) result.push(arr);

    for (let i = idx; i < candidates.length; i++) {
      permute([...arr, candidates[i]], sum + candidates[i], i);
    }
  };
  permute();
  return result;
};

combinationSum([2, 3, 6, 7], 7);        // returns [ [ 2, 2, 3 ], [ 7 ] ]
combinationSum([2, 3, 5], 8);           // returns [ [ 2, 2, 2, 2 ], [ 2, 3, 3 ], [ 3, 5 ] ]
combinationSum([2], 1);                 // returns [ ]
combinationSum([1], 1);                 // returns [ [ 1 ] ]
combinationSum([1], 2);                 // returns [ [ 1, 1 ] ]
