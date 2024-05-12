function sorting_numbersV1(arr){
    let small = [];
    let big = [];
    let newArr = [];

    small = arr.sort((a, b) => a - b).slice();
    big = arr.reverse().slice();

    for (let i = 0; i < arr.length; i++) {
        if(i % 2 === 0){
            newArr.push(small.shift());
        }else{
            newArr.push(big.shift());
        }
    }

    return newArr;
}

function sorting_numbersV2(arr){
    let result = [];
    arr.sort((a, b) => b - a);

    while(arr.length !== 0){
        result.push(arr.pop());
        result.push(arr.shift());
    }

    return result;
}

function sorting_numbersV3(arr){
    let result = [];
    arr.sort((a, b) => a - b);

    while(arr.length !== 0){
        result.push(arr.shift());
        result.push(arr.pop());
    }

    return result;
}

function sorting_numbersV4(arr){
    let i = arr.length - 1;

    return arr.sort((a, b) => a -b).reduce((a, v, _, cArr) => {
        a.push(v);
        a.push(cArr[i--]);

        return a;
    }, []).slice(0, arr.length);
}
