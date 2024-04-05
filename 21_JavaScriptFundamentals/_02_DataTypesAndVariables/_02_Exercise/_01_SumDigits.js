function sum_digitsV1(number){
    let numString = number.toString();
    let sum = 0;

    for (let i = 0; i < numString.length; i++) {
        sum += Number(numString.charAt(i));
    }

    return sum;
}

const sum_digitsV2 = function(number){
    let numString = number.toString();
    let sum = 0;

    for (let i = 0; i < numString.length; i++) {
        sum += Number(numString.charAt(i));
    }

    return sum;
}

const sum_digitsV3 = (number) => {
    let numString = number.toString();
    let sum = 0;

    for (let i = 0; i < numString.length; i++) {
        sum += Number(numString.charAt(i));
    }

    return sum;
}
