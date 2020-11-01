// Maximum gap in a adjacent element in an Array.

function merge(leftArr, rightArr) {
  let sortedArr = [];
    while (leftArr.length && rightArr.length) {
      if (leftArr[0] <= rightArr[0]) {
        sortedArr.push(leftArr[0]);
        leftArr = leftArr.slice(1)
      } else {
        sortedArr.push(rightArr[0]);
        rightArr = rightArr.slice(1)
      }
    }
  while (leftArr.length)
    sortedArr.push(leftArr.shift());
  while (rightArr.length)
    sortedArr.push(rightArr.shift());
  return sortedArr;
}
function mergesort(arr) {
  if (arr.length < 2) {
    return arr; 
  }
  else {
    let midpoint = parseInt(arr.length / 2);
    let leftArr = arr.slice(0, midpoint);
    let rightArr = arr.slice(midpoint, arr.length);
    return merge(mergesort(leftArr), mergesort(rightArr));
  }
}
function maximumGap(arr) {
  let length = arr.length();
  if (length < 3) {
    return 0
  }
  sortedArry = mergesort(arr);
  for (let index = 0; index < length - 1; index++){
    diff_arr[index] = arr[length - index - 1]-arr[length - index - 2];
    if (diff_arr[index] > max_diff){
      max_diff=diff_arr[index];
    }
  }
  return max_diff  
}
let arr = [2, 13, 7, 3, 5]
maximumGap(arr); // returns 6
let arr = [12, 53]
maximumGap(arr); // returns 0
