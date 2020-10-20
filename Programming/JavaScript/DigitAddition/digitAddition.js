var digitAddition = (num) => {

    if(isNaN(parseInt(num))) {
        return 0;
    }
    return num.toString().split("").reduce((acc, item) => parseInt(acc) + parseInt(item));
}

digitAddition(152);