function even_and_odd_subtractionV1(array){
    let evenSum = 0;
    let oddSum = 0;

    array.forEach(x => x % 2 === 0 ? evenSum += x : oddSum += x);
    return evenSum - oddSum;
}

const even_and_odd_subtractionV2 = function(array){
    let evenSum = 0;
    let oddSum = 0;

    array.forEach(x => x % 2 === 0 ? evenSum += x : oddSum += x);
    return evenSum - oddSum;
}

const even_and_odd_subtractionV3 = (array) => {
    let evenSum = 0;
    let oddSum = 0;

    array.forEach(x => x % 2 === 0 ? evenSum += x : oddSum += x);
    return evenSum - oddSum;
}