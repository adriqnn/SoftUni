function math_operationsV1(...args){
    const [first, second, operand] = args;

    let operations = {
        "+": (a, b) => a + b,
        "-": (a, b) => a - b,
        "*": (a, b) => a * b,
        "/": (a, b) => a / b,
        "%": (a, b) => a % b,
        "**": (a, b) => a ** b
    }

    return operations[operand](first, second);
}

function math_operationsV2(n1, n2, operand){
    let result;

    if(operand === '+'){
        result = n1 + n2;
    }else if(operand === '-'){
        result = n1 - n2;
    }else if(operand === '*'){
        result = n1 * n2;
    }else if(operand === '/'){
        result = n1 / n2;
    }else if(operand === '%'){
        result = n1 % n2;
    }else if(operand === '**'){
        result = n1 ** n2;
    }

    return result;
}

function math_operationsV3(n1, n2, operand){
    let result;

    switch(operand){
        case "+": result = n1 + n2; break;
        case "-": result = n1 - n2; break;
        case "*": result = n1 * n2; break;
        case "/": result = n1 / n2; break;
        case "%": result = n1 % n2; break;
        case "**": result = n1 ** n2; break;
    }

    return result;
}
