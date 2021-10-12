const containerWithMostWater = (heights) => {
  let result = 0,
    startIndex = 0,
    endIndex = heights.length - 1;
  while (startIndex < endIndex) {
    result = Math.max(result, Math.min(heights[startIndex], heights[endIndex]) * (endIndex - startIndex));
    heights[startIndex] <= heights[endIndex] ? startIndex++ : endIndex--;
  }
  return result;
};

containerWithMostWater([1, 8, 6, 2, 5, 4, 8, 3, 7]);    // returns 49
containerWithMostWater([1,1])                           // returns 1
containerWithMostWater([4,3,2,1,4])                     // returns 16
containerWithMostWater([1,2,1])                         // returns 2
