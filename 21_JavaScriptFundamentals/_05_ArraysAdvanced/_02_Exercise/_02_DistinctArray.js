function distinct_arrayV1(array){
    let set = new Set(array);
    return [...set].join(" ");
}

const distinct_arrayV2 = function(array){
    let set = new Set(array);
    return [...set].join(" ");
}

const distinct_arrayV3 = (array) => {
    let set = new Set(array);
    return [...set].join(" ");
}

// console.log(distinct_arrayV1([1, 2, 3, 4]));