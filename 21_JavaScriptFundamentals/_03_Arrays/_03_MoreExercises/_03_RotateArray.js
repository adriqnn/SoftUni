function rotate_arrayV1(array){
    let rotation = array.pop();

    for (let i = 0; i < rotation; i++) {
        let str = array.pop();
        array.unshift(str);
    }

    return array.join(" ");
}

const rotate_arrayV2 = function(array){
    let rotation = array.pop();

    for (let i = 0; i < rotation; i++) {
        let str = array.pop();
        array.unshift(str);
    }

    return array.join(" ");
}

const rotate_arrayV3 = (array) => {
    let rotation = array.pop();

    for (let i = 0; i < rotation; i++) {
        let str = array.pop();
        array.unshift(str);
    }

    return array.join(" ");
}