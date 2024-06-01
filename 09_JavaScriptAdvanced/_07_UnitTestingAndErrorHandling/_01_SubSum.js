function sub_sumV1(arr, start, end){
    if(!Array.isArray(arr)){
        return NaN;
    }

    if(start < 0){
        start = 0;
    }

    if(end > arr.length - 1){
        end = arr.length - 1;
    }

    let sum = 0;

    for (let i = start; i <= end; i++) {
        sum += Number(arr[i]);
    }

    return sum;
}

function sub_sumV2(arr, s, e){
    s = arr[s] === undefined ? 0 : s;
    e = arr[e] === undefined ? arr.length - 1 : e;
    
    try{
        return(arr.slice(s, e + 1).reduce((a, v) => a + v, 0) * 10) / 10;
    }catch(e){
        return NaN;
    }
}
