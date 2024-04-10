function perfect_numberV1(number){
    if (number <= 0) {
        return false;
    }

    let sumOfDivisors = 0;

    for (let i = 1; i <= number / 2; i++) {
        if (number % i === 0) {
            sumOfDivisors += i;
        }
    }

    return sumOfDivisors === number ? "We have a perfect number!" : "It's not so perfect.";
}

const perfect_numberV2 = function(number){
    if (number <= 0) {
        return false;
    }

    let sumOfDivisors = 0;

    for (let i = 1; i <= number / 2; i++) {
        if (number % i === 0) {
            sumOfDivisors += i;
        }
    }

    return sumOfDivisors === number ? "We have a perfect number!" : "It's not so perfect.";
}

const perfect_numberV3 = (number) => {
    if (number <= 0) {
        return false;
    }

    let sumOfDivisors = 0;

    for (let i = 1; i <= number / 2; i++) {
        if (number % i === 0) {
            sumOfDivisors += i;
        }
    }

    return sumOfDivisors === number ? "We have a perfect number!" : "It's not so perfect.";
}