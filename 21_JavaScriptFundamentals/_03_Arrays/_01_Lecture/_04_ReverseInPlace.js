function reverse_in_placeV1(array){
    for (let i = 0; i < array.length / 2; i++) {
        let first = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = first;
    }

    return array.join(" ");
}

const reverse_in_placeV2 = function(array){
    for (let i = 0; i < array.length / 2; i++) {
        let first = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = first;
    }

    return array.join(" ");
}

const reverse_in_placeV3 = (array) => {
    for (let i = 0; i < array.length / 2; i++) {
        let first = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = first;
    }

    return array.join(" ");
}

// console.log(reverse_in_placeV1(["a", "b", "c", "d", "e"]));
// console.log(reverse_in_placeV1(["abc", "def", "hig", "klm", "nop"]));