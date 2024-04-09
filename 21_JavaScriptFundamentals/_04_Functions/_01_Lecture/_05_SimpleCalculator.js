function simple_calculatorV1(number1, number2, action){
    let calculator = {
        add: (x, y) => x + y,
        subtract: (x, y) => x - y,
        multiply: (x, y) => x * y,
        divide: (x, y) => x / y
    }

    return calculator[action](number1, number2);
}

const simple_calculatorV2 = function(number1, number2, action){
    let calculator = {
        add: (x, y) => x + y,
        subtract: (x, y) => x - y,
        multiply: (x, y) => x * y,
        divide: (x, y) => x / y
    }

    return calculator[action](number1, number2);
}

const simple_calculatorV3 = (number1, number2, action) => {
    let calculator = {
        add: (x, y) => x + y,
        subtract: (x, y) => x - y,
        multiply: (x, y) => x * y,
        divide: (x, y) => x / y
    }

    return calculator[action](number1, number2);
}