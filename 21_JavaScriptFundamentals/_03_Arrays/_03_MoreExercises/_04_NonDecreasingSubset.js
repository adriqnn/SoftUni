function non_decreasing_subsetV1(array){
    let arr = [];
    let max = array[0];

    for (let i = 0; i < array.length; i++) {
        if(array[i] >= max){
            max = array[i];
            arr.push(max);
        }
    }

    return arr.join(" ");
}

const non_decreasing_subsetV2 = function(array){
    let arr = [];
    let max = array[0];

    for (let i = 0; i < array.length; i++) {
        if(array[i] >= max){
            max = array[i];
            arr.push(max);
        }
    }

    return arr.join(" ");
}

const non_decreasing_subsetV3 = (array) => {
    let arr = [];
    let max = array[0];

    for (let i = 0; i < array.length; i++) {
        if(array[i] >= max){
            max = array[i];
            arr.push(max);
        }
    }

    return arr.join(" ");
}

