var swap = function (array, firstIndex, secondIndex) {
    var temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
};
var selectionSort = function (array) {
    for (var i = 0; i < array.length; i++) {
        var min = i;
        for (var j = i + 1; j < array.length; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
        }
        swap(array, i, min);
    }
    return array;
};
var array = [3, 2, 10, 1]
console.log(selectionSort(array));