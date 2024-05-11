function greatest_common_divisorV1(num1, num2){
    let gcd;

    num1 < num2 ? gcd = num1 : gcd = num2;
    while(!(num1 % gcd === 0 && num2 % gcd === 0)){
        gcd--;
    }

    return gcd;
}

function greatest_common_divisorV2(...args){
    let result = 1;
    for (let i = 2; i < 9; i++) {
        result = args.every(x => x % i === 0) ? i : result;
    }

    return result;
}

