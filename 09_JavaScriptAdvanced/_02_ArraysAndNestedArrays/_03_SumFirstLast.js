function sum_first_lastV1(input){
    let first = [...input].shift();
    let last = [...input].pop();

    return Number(first) + Number(last);
}

function sum_first_lastV2(input){
    input = input.map(Number);
    return input[0] + input[input.length - 1];
}
