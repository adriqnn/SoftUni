function helperV1(array){
    let arrPartOne = array.slice(0, Number(2));
    array.splice(0, Number(2));
    array.push(...arrPartOne);

    return array;
}

const helperV2 = function(){
    let arrPartOne = array.slice(0, Number(2));
    array.splice(0, Number(2));
    array.push(...arrPartOne);

    return array;
}

const helperV3 = () => {
    let arrPartOne = array.slice(0, Number(2));
    array.splice(0, Number(2));
    array.push(...arrPartOne);

    return array;
}

// console.log(helperV1([1]));
// console.log(helperV1([1, 2, 4, 5, 6, 7]));
// console.log(helperV1([1, 2, 3, 4, 5]));
// console.log(helperV1([2, 2, 4, 2, 4]));