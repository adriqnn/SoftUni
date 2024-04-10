function odd_and_even_sumV1(number){
    let oddSum = 0;
    let evenSum = 0;

    number.toString().split("").map(x => Number(x)).forEach(e => e % 2 === 0 ? evenSum += e : oddSum += e);

    return `Odd sum = ${oddSum}, Even sum = ${evenSum}`;
}

const odd_and_even_sumV2 = function(number){
    let oddSum = 0;
    let evenSum = 0;

    number.toString().split("").map(x => Number(x)).forEach(e => e % 2 === 0 ? evenSum += e : oddSum += e);

    return `Odd sum = ${oddSum}, Even sum = ${evenSum}`;
}

const odd_and_even_sumV3 = (number) => {
    let oddSum = 0;
    let evenSum = 0;

    number.toString().split("").map(x => Number(x)).forEach(e => e % 2 === 0 ? evenSum += e : oddSum += e);

    return `Odd sum = ${oddSum}, Even sum = ${evenSum}`;
}