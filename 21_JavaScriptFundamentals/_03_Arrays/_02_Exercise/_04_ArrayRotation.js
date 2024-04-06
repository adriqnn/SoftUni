function array_rotationV1(array, number){
    let moves = array.length % number;

    for (let i = 0; i < number; i++) {
        let current = array.shift();
        array.push(current);
    }

    return array.join(" ");
}

const array_rotationV2 = function(array, number){
    let moves = array.length % number;

    for (let i = 0; i < number; i++) {
        let current = array.shift();
        array.push(current);
    }

    return array.join(" ");
}

const array_rotationV3 = (array, number) => {
    let moves = array.length % number;

    for (let i = 0; i < number; i++) {
        let current = array.shift();
        array.push(current);
    }

    return array.join(" ");
}