function first_and_last_k_numbersV1(array){
    let k = array.shift();
    let first = array.slice(0, k);
    let last = array.slice(-k);

    return `${first.join(" ")}\n${last.join(" ")}`;
}

const first_and_last_k_numbersV2 = function(array){
    let k = array.shift();
    let first = array.slice(0, k);
    let last = array.slice(-k);

    return `${first.join(" ")}\n${last.join(" ")}`;
}

const first_and_last_k_numbersV3 = (array) => {
    let k = array.shift();
    let first = array.slice(0, k);
    let last = array.slice(-k);

    return `${first.join(" ")}\n${last.join(" ")}`;
}

// console.log(first_and_last_k_numbersV1([2, 7, 8, 9]));