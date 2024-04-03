function amazing_numbersV1(number){
    let str = number.toString();
    let sum = 0;

    for (let i = 0; i < str.length; i++) {
        sum += Number(str[i]);
    }

    let result = sum.toString().includes("9");

    return result ? `${number} Amazing? True` : `${number} Amazing? False`;
}

const amazing_numbersV2 = function(number){
    let str = number.toString();
    let sum = 0;

    for (let i = 0; i < str.length; i++) {
        sum += Number(str[i]);
    }

    let result = sum.toString().includes("9");

    return result ? `${number} Amazing? True` : `${number} Amazing? False`;
}

const amazing_numbersV3 = (number) => {
    let str = number.toString();
    let sum = 0;

    for (let i = 0; i < str.length; i++) {
        sum += Number(str[i]);
    }

    let result = sum.toString().includes("9");

    return result ? `${number} Amazing? True` : `${number} Amazing? False`;
}

// console.log(amazing_numbersV1(1233));