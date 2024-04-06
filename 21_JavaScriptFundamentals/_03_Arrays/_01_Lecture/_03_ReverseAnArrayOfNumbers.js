function reverse_an_array_of_numbersV1(number, array){
    let newArray = [];

    for (let i = 0; i < number; i++) {
        newArray.unshift(array.shift());
    }

    return newArray.join(" ");
}

const reverse_an_array_of_numbersV2 = function(number, array){
    let newArray = [];

    for (let i = 0; i < number; i++) {
        newArray.unshift(array.shift());
    }

    return newArray.join(" ");
}

const reverse_an_array_of_numbersV3 = (number, array) => {
    let newArray = [];

    for (let i = 0; i < number; i++) {
        newArray.unshift(array.shift());
    }

    return newArray.join(" ");
}