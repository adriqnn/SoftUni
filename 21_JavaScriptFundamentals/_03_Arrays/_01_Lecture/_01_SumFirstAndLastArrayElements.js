function sum_first_and_last_array_elementsV1(array){
    let first = Number(array.shift());
    let last = Number(array.pop());

    return first + last;
}

const sum_first_and_last_array_elementsV2 = function(array){
    let first = Number(array.shift());
    let last = Number(array.pop());

    return first + last;
}

const sum_first_and_last_array_elementsV3 = (array) => {
    let first = Number(array.shift());
    let last = Number(array.pop());

    return first + last;
}