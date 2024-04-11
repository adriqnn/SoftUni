function negative_or_positive_numbersV1(array){
    let newArray = [];

    array.map(e => Number(e)).forEach(e => e >= 0 ? newArray.push(e) : newArray.unshift(e));
    return newArray.join("\n");
}

const negative_or_positive_numbersV2 = function(array){
    let newArray = [];

    array.map(e => Number(e)).forEach(e => e >= 0 ? newArray.push(e) : newArray.unshift(e));
    return newArray.join("\n");
}

const negative_or_positive_numbersV3 = (array) => {
    let newArray = [];

    array.map(e => Number(e)).forEach(e => e >= 0 ? newArray.push(e) : newArray.unshift(e));
    return newArray.join("\n");
}