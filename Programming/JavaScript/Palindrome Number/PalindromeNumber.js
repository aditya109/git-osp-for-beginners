function isPalindrome(n){
    const num = n.toString().split('').join('');
    const revNum = n.toString().split('').reverse().join('');

    if(num[0] === '-') return false;
    return num === revNum;
}