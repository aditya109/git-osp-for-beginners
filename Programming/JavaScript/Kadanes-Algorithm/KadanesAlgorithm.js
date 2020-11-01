const kadanesAlgorithm = (nums) => {
  let maxCurrent = [nums[0]];
  let maxGlobal = [nums[0]];

  for (let i = 1; i < nums.length; i++) {
    if (nums[i] + maxCurrent[i - 1] > nums[i]) {
      maxCurrent[i] = nums[i] + maxCurrent[i - 1];
    } else {
      maxCurrent[i] = nums[i];
    };

    if (maxCurrent[i] > maxGlobal[i - 1]) {
      maxGlobal[i] = maxCurrent[i];
    } else {
      maxGlobal[i] = maxGlobal[i - 1];
    };
  }
  return maxGlobal[maxGlobal.length - 1];
}
