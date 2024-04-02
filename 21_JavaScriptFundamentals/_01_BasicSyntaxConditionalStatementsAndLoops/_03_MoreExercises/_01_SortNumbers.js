function sort_numbersV1(one, two, three){
    let array = [one, two, three];
    return array.sort((a, b) => b - a).join("\n");
}

const sort_numbersV2 = function(one, two, three){
    let array = [one, two, three];
    return array.sort((a, b) => b - a).join("\n");
}

const sort_numbersV3 = (one, two, three) => {
    let array = [one, two, three];
    return array.sort((a, b) => b - a).join("\n");
}

