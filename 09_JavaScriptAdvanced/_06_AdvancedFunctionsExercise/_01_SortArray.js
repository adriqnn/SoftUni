function sort_arrayV1(arr, type){
    if(type === 'asc'){
        arr.sort((a, b) => a - b);
    }else{
        arr.sort((a, b) => b - a);
    }

    return arr;
}

function sort_arrayV2(arr,type){
    const methods = {
        asc: (a, b) => a - b,
        desc: (a, b) => b - a
    }

    arr.sort(methods[type]);

    return arr;
}

function sort_arrayV3(arr, a) {
    return a === "asc" ? arr.sort((x, y) => x - y) : arr.sort((x, y) => y - x);
}
