function removeDuplicate(arr) {
    let n = 0;
    for(let i = 1; i <= arr.length; i++){
        if(arr[n] - arr[i] !== 0) {
            arr[n+1] = arr[i];
            n++;
        }
    }
    return arr;
}