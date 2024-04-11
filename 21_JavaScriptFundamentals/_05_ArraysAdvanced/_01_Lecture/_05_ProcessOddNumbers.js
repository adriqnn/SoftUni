function process_odd_numbersV1(array){
    return array.filter((e, i) => i % 2 !== 0).map(e => e * 2).reverse().join(" ");
}

const process_odd_numbersV2 = function(array){
    return array.filter((e, i) => i % 2 !== 0).map(e => e * 2).reverse().join(" ");
}

const process_odd_numbersV3 = (array) => {
    return array.filter((e, i) => i % 2 !== 0).map(e => e * 2).reverse().join(" ");
}