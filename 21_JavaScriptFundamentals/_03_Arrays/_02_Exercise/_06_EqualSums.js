function equal_sumsV1(array){
    let magic = array.map((e, i) => ({ value: e, index: i })).filter((e, i) => array.slice(0, i + 1).reduce((a, v) => a + v) === array.slice(i).reduce((a, v) => a + v)).map(({index}) => index);
    return magic.length > 0 ? magic[0] : "no";
}

const equal_sumsV2 = function(array){
    let magic = array.map((e, i) => ({ value: e, index: i })).filter((e, i) => array.slice(0, i + 1).reduce((a, v) => a + v) === array.slice(i).reduce((a, v) => a + v)).map(({index}) => index);
    return magic.length > 0 ? magic[0] : "no";
}

const equal_sumsV3 = (array) => {
    let magic = array.map((e, i) => ({ value: e, index: i })).filter((e, i) => array.slice(0, i + 1).reduce((a, v) => a + v) === array.slice(i).reduce((a, v) => a + v)).map(({index}) => index);
    return magic.length > 0 ? magic[0] : "no";
}

// console.log(equal_sumsV1([1, 2, 3, 3]));
// console.log(equal_sumsV1([1]));