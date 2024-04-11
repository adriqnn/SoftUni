function smallest_two_numbersV1(array){
    return array.sort((a, b) => a - b).slice(0, 2).join(" ");
}

const smallest_two_numbersV2 = function(array){
    return array.sort((a, b) => a - b).slice(0, 2).join(" ");
}

const smallest_two_numbersV3 = (array) => {
    return array.sort((a, b) => a - b).slice(0, 2).join(" ");
}