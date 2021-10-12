const twoSumIndexes = (numbers, target) => {
    for(let index = 0; index <= numbers.length - 2; index += 1) {
        for(let j = index +1; j <= numbers.length -1; j +=1){
            if(numbers[index] + numbers[j] === target) {
                return [index+1,j+1]
            }
        }
    }
}

const firstInput = twoSumIndexes([2,7,11,15], 9)
console.log(firstInput) // returns [1,2]

const secondInput = twoSumIndexes([2,3,4], 6)
console.log(secondInput) // returns [1,3]

const thridInput = twoSumIndexes([-1,0], -1)
console.log(thridInput) // returns [1,2]