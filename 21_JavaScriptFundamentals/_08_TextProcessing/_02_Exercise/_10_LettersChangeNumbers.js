function letter_change_numbersV1(input){
    let inputArray = input.split(/\s+/).filter(e => e.length > 0);
    let sum = 0;

    for (let i = 0; i < inputArray.length; i++) {
        let first = inputArray[i].charCodeAt(0);
        let last = inputArray[i].charCodeAt(inputArray[i].length - 1);
        let currentNumber = Number(inputArray[i].substring(1, inputArray[i].length - 1));

        let value = 0;

        first >= 97 ? value = currentNumber * (first - 96) : value = currentNumber / (first  - 64);
        last >= 97 ? value += last - 96 : value -= last - 64;

        sum += value;
    }

    return `${sum.toFixed(2)}`;
}

const letter_change_numbersV2 = function(input){
    let inputArray = input.split(/\s+/).filter(e => e.length > 0);
    let sum = 0;

    for (let i = 0; i < inputArray.length; i++) {
        let first = inputArray[i].charCodeAt(0);
        let last = inputArray[i].charCodeAt(inputArray[i].length - 1);
        let currentNumber = Number(inputArray[i].substring(1, inputArray[i].length - 1));

        let value = 0;

        first >= 97 ? value = currentNumber * (first - 96) : value = currentNumber / (first  - 64);
        last >= 97 ? value += last - 96 : value -= last - 64;

        sum += value;
    }

    return `${sum.toFixed(2)}`;
}

const letter_change_numbersV3 = (input) => {
    let inputArray = input.split(/\s+/).filter(e => e.length > 0);
    let sum = 0;

    for (let i = 0; i < inputArray.length; i++) {
        let first = inputArray[i].charCodeAt(0);
        let last = inputArray[i].charCodeAt(inputArray[i].length - 1);
        let currentNumber = Number(inputArray[i].substring(1, inputArray[i].length - 1));

        let value = 0;

        first >= 97 ? value = currentNumber * (first - 96) : value = currentNumber / (first  - 64);
        last >= 97 ? value += last - 96 : value -= last - 64;

        sum += value;
    }

    return `${sum.toFixed(2)}`;
}

// console.log(letter_change_numbersV1('A12b s17G'));
// console.log(letter_change_numbersV1('P34562Z q2576f   H456z'));
// console.log(letter_change_numbersV1('             P34562Z  q2576f   H456z                                   '));
// console.log(letter_change_numbersV1('a1A'));