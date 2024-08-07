function calculatorV1(...args){
    const actions = {
        "+": (x, y) => x + y,
        "-": (x, y) => x - y,
        "*": (x, y) => x * y,
        "/": (x, y) => x / y,
        "**": (x, y) => x ** y,
        "%": (x, y) => x % y,
    }

    return (actions[args[1]](args[0], args[2])).toFixed(2);
}

const calculatorV2 = function(...args){
    const actions = {
        "+": (x, y) => x + y,
        "-": (x, y) => x - y,
        "*": (x, y) => x * y,
        "/": (x, y) => x / y,
        "**": (x, y) => x ** y,
        "%": (x, y) => x % y,
    }

    return (actions[args[1]](args[0], args[2])).toFixed(2);
}

const calculatorV3 = (...args) => {
    const actions = {
        "+": (x, y) => x + y,
        "-": (x, y) => x - y,
        "*": (x, y) => x * y,
        "/": (x, y) => x / y,
        "**": (x, y) => x ** y,
        "%": (x, y) => x % y,
    }

    return (actions[args[1]](args[0], args[2])).toFixed(2);
}
