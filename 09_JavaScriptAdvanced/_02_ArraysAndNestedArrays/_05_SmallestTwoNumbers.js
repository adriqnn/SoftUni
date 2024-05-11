function smallest_two_numbersV1(arr){
    return arr.sort((a, b) => a - b).slice(0, 2);
}

function smallest_two_numbersV2(arr){
    return arr.sort((a, b) => a - b).slice(0, 2).join(" ");
}
