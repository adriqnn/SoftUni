function bigger_halfV1(arr){
    return arr.sort((a, b) => a - b).slice(arr.length / 2, arr.length);
}

function bigger_halfV2(arr){
    return arr.sort((a, b) => a - b).slice(arr.length / 2, arr.length).join(" ");
}

function bigger_halfV3(arr){
    arr.sort((a, b) => a - b);
    const result = [];

    for(let i = Math.floor(arr.length / 2); i < arr.length; i++){
        result.push(arr[i]);
    }

    return result;
}

function bigger_halfV4(arr){
    return arr.sort((a, b) => a - b).slice(-Math.ceil(arr.length / 2));
}
