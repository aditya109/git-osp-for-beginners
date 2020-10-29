function maximumGap(arr) {
	let max = 0;
	if (arr.length >= 2) {
		arr.sort((a, b) => a - b);

		for (let i in arr) {
			const diff = arr[i] - arr[i - 1];
			
			if (diff > max) {
				max = diff;
			}
		}

	}
	return max;
}

const arr = [1, 30, 4, 21, 10];
console.log(maximumGap(arr));
