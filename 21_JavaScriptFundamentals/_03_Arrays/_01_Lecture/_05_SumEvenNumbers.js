function sum_even_numbersV1(array){
    let sum = 0;

    array.filter(x => Number(x) % 2 === 0).forEach(x => sum += Number(x));
    return sum;
}

const sum_even_numbersV2 = function(array){
    let sum = 0;

    array.filter(x => Number(x) % 2 === 0).forEach(x => sum += Number(x));
    return sum;
}

const sum_even_numbersV3 = (array) => {
    let sum = 0;

    array.filter(x => Number(x) % 2 === 0).forEach(x => sum += Number(x));
    return sum;
}