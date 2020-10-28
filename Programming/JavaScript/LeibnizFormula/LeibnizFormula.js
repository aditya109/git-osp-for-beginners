const leibnizStep = k => Math.pow(-1, k) / (2 * k + 1);

const leibniz = k => {
    let sum = 0;
    for (let i = 0; i < k; i++) {
        sum += leibnizStep(i);
    }

    return sum * 4;
};

console.log(leibniz(10000));
