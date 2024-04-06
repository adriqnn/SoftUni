function maxNumberV1(array){
    return array.filter((x, i) => array.slice(i + 1).every(y => x > y)).join(" ");
}

const maxNumberV2 = function(array){
    return array.filter((x, i) => array.slice(i + 1).every(y => x > y)).join(" ");
}

const maxNumberV3 = (array) => {
    return array.filter((x, i) => array.slice(i + 1).every(y => x > y)).join(" ");
}

// console.log(maxNumberV1([1, 4, 3, 2]));
// console.log(maxNumberV1([27, 19, 42, 2, 13, 45, 48]));
