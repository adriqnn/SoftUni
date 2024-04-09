function sign_checkV1(number1, number2, number3){
    const negativesCount = [number1, number2, number3].filter(num => num < 0).length;

    if (negativesCount % 2 === 0) {
        return `Positive`;
    } else {
        return `Negative`;
    }
}

const sign_checkV2 = function(number1, number2, number3){
    const negativesCount = [number1, number2, number3].filter(num => num < 0).length;

    if (negativesCount % 2 === 0) {
        return `Positive`;
    } else {
        return `Negative`;
    }
}

const sign_checkV3 = (number1, number2, number3) => {
    const negativesCount = [number1, number2, number3].filter(num => num < 0).length;

    if (negativesCount % 2 === 0) {
        return `Positive`;
    } else {
        return `Negative`;
    }
}