/**
 * @param {string} digits
 * @return {string[]}
 */
const LETTER_COMBINATIONS = {
    2: ['a','b','c'],
    3: ['d','e','f'],
    4: ['g','h','i'],
    5: ['j','k','l'],
    6: ['m','n','o'],
    7: ['p','q','r', 's'],
    8: ['t','u','v'],
    9: ['w','x','y', 'z'],
 }

 const letterCombinations = (digits) => {
    return digits.length ? buildLetterCombinations(digits, ['']) : []
};

const buildLetterCombinations = (digits, previousCombinations) => {
    const combinations = []

    for (const previousCombination of previousCombinations) {
        for (const letter of LETTER_COMBINATIONS[digits[0]]) {
            combinations.push(
                previousCombination.concat(letter)
            );
        }
    }

    return digits.length > 1 ? buildLetterCombinations(digits.slice(1), combinations) : combinations
}

console.log(letterCombinations('23'))
console.log(letterCombinations(''))
console.log(letterCombinations('2'))
