var temp = [];

function bubbleSort(arr){
  var split = arr.toString().split(',');
  for(var i = 0; i<split.length;i++){
    for(var j = 0; j<split.length; j++){
      if(split[j] > split[j+1]){
        temp = split[j];
        split[j] = split[j+1];
        split[j+1] = temp;
      }
    }
  }
  return split.join(' ');
}

bubbleSort([9, 7, 5, 3, 1, 2, 4, 6, 8]);