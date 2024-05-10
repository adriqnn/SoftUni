function greatest_common_divisorV1(num1, num2){
    let gcd;

    num1 < num2 ? gcd = num1 : gcd = num2;
    while(!(num1 % gcd === 0 && num2 % gcd === 0)){
        gcd--;
    }

    return gcd;
}
