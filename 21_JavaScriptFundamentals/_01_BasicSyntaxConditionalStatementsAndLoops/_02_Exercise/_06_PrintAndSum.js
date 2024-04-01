function print_and_sumV1(start, end){
    let numbers = "";
    let sum = 0;

    for (let i = start; i <= end; i++) {
        numbers += i + " ";
        sum += i;
    }

    return `${numbers }\nSum: ${sum}`;
}

const print_and_sumV2 = function(start, end){
    let numbers = "";
    let sum = 0;

    for (let i = start; i <= end; i++) {
        numbers += i + " ";
        sum += i;
    }

    return `${numbers }\nSum: ${sum}`;
}

const print_and_sumV3 = (start, end) => {
    let numbers = "";
    let sum = 0;

    for (let i = start; i <= end; i++) {
        numbers += i + " ";
        sum += i;
    }

    return `${numbers }\nSum: ${sum}`;
}