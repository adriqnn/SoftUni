function sum_first_and_lastV1(array){
    let first = Number(array.shift());
    let last = Number(array.pop());

    return first + last;
}

const sum_first_and_lastV2 = function(array){
    let first = Number(array.shift());
    let last = Number(array.pop());

    return first + last;
}

const sum_first_and_lastV3 = (array) => {
    let first = Number(array.shift());
    let last = Number(array.pop());

    return first + last;
}