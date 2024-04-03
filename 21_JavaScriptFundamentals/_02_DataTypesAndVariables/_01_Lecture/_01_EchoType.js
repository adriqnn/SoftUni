function echo_typeV1(input){
    let answer = typeof input;
    return `${answer}\n${answer === "string" || answer === "number" ? input : "Parameter is not suitable for printing"}`;
}

const echo_typeV2 = function(input){
    let answer = typeof input;
    return `${answer}\n${answer === "string" || answer === "number" ? input : "Parameter is not suitable for printing"}`;
}

const echo_typeV3 = (input) => {
    let answer = typeof input;
    return `${answer}\n${answer === "string" || answer === "number" ? input : "Parameter is not suitable for printing"}`;
}

// console.log(echo_typeV1('Hello, JavaScript!'));