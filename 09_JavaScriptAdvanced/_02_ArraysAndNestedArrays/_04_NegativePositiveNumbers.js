function negative_positive_numbersV1(arr){
    let newArr = [];

    arr.forEach(e => {
        if(e >= 0){
            newArr.push(e);
        }else{
            newArr.unshift(e);
        }
    });

    return newArr.join("\n");
}

function negative_positive_numbersV2(arr){
    const result = [];

    for(let n of arr){
        if(n < 0){
            result.unshift(n);
        }else{
            result.push(n);
        }
    }

    return result;
}

function negative_positive_numbersV3(arr){
    return arr.reduce((a, v) => {
        v < 0 ? a.unshift(v) : a.push(v);
        return a;
    }, []);
}
