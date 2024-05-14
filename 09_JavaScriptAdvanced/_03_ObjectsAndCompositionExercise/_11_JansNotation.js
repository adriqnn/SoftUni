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

function jans_notationV2(arr){
    let result = [];
    let workArr = arr.includes("error") ? arr.slice(0, arr.indexOf("error")) : arr.slice();
    const operators = {
        "+": (x, y) => x + y,
        "-": (x, y) => y - x,
        "/": (x, y) => y / x,
        "*": (x, y) => x * y,
    }

    const updateArr = (arr, o) => {
        const temp = arr.slice();
        temp.push(operators[o](temp.pop(), temp.pop()));

        return temp;
    }

    for (let i = 0; i < workArr.length; i += 1) {
        if (typeof workArr[i] === "number") {
            result.push(workArr[i]);
        } else {
            if (result.length < 2) {
                return `Error: not enough operands!`;
            }

            result = updateArr(result, workArr[i]);
        }
    }

    return result.length === 1 ? result[0] : `Error: too many operands!`;
}
