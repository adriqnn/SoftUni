function jans_notationV1(array){
    let operands = [];
    let length = array.length;
    let result = ``;

    let operations = {
        "+": (a, b) => a + b,
        "-": (a, b) => a - b,
        "*": (a, b) => a * b,
        "/": (a, b) => a / b
    }

    function isNumerical(value) {
        return !isNaN(value) && typeof value === 'number';
    }

    for (let i = 0; i < length; i++) {
        let current = array[i];

        if(isNumerical(current)){
            operands.push(current);
        }else{
            if(operands.length > 1){
                let second = operands.pop();
                let first = operands.pop();

                operands.push(operations[current](first, second));
            }else{
                result += `Error: not enough operands!`;
                break;
            }
        }
    }

    return result === `Error: not enough operands!` ? result : operands.length === 1 ? operands[0] : `Error: too many operands!`;
}

const jans_notationV2 = function(array){
    let operands = [];
    let length = array.length;
    let result = ``;

    let operations = {
        "+": (a, b) => a + b,
        "-": (a, b) => a - b,
        "*": (a, b) => a * b,
        "/": (a, b) => a / b
    }

    function isNumerical(value) {
        return !isNaN(value) && typeof value === 'number';
    }

    for (let i = 0; i < length; i++) {
        let current = array[i];

        if(isNumerical(current)){
            operands.push(current);
        }else{
            if(operands.length > 1){
                let second = operands.pop();
                let first = operands.pop();

                operands.push(operations[current](first, second));
            }else{
                result += `Error: not enough operands!`;
                break;
            }
        }
    }

    return result === `Error: not enough operands!` ? result : operands.length === 1 ? operands[0] : `Error: too many operands!`;
}

const jans_notationV3 = (array) => {
    let operands = [];
    let length = array.length;
    let result = ``;

    let operations = {
        "+": (a, b) => a + b,
        "-": (a, b) => a - b,
        "*": (a, b) => a * b,
        "/": (a, b) => a / b
    }

    function isNumerical(value) {
        return !isNaN(value) && typeof value === 'number';
    }

    for (let i = 0; i < length; i++) {
        let current = array[i];

        if(isNumerical(current)){
            operands.push(current);
        }else{
            if(operands.length > 1){
                let second = operands.pop();
                let first = operands.pop();

                operands.push(operations[current](first, second));
            }else{
                result += `Error: not enough operands!`;
                break;
            }
        }
    }

    return result === `Error: not enough operands!` ? result : operands.length === 1 ? operands[0] : `Error: too many operands!`;
}

// console.log(jans_notationV1([3, 4, '+']));
// console.log(jans_notationV1([5, 3, 4, '*', '-']));
// console.log(jans_notationV1([15, '/']));
// console.log(jans_notationV1([7, 33, 8, '-']));
// console.log(jans_notationV1([31, 2, '+', 11, '/']));
// console.log(jans_notationV1([-1, 1, '+', 101, '*', 18, '+', 3, '/']));
