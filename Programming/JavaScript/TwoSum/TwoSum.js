const twoSum = (nums, target) => {
  const map = {};
  let complement;
  for (let i = 0; i < nums.length; i++) {
    complement = target - nums[i];
    if (map.hasOwnProperty(complement)) {
      return [i, map[complement]]
    }
    map[nums[i]] = i;
  }
}
