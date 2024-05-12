function rotate_arrayV1(arr, rotations){
    for (let i = 0; i < rotations; i++) {
        arr.unshift(arr.pop());
    }

    return arr.join(" ");
}

function rotate_arrayV2(arr, rotations){
    while(rotations-- > 0){
        arr.unshift(arr.pop());
    }

    return arr.join(" ");
}
