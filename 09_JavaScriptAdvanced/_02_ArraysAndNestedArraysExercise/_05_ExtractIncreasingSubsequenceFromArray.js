function extract_increasing_subsequence_from_arrayV1(arr){
    return arr.reduce((a, v) => {
        if(a.length === 0){
            a.push(v);
        }else if(v >= a[a.length - 1]){
            a.push(v);
        }

        return a;
    }, []);
}

function extract_increasing_subsequence_from_arrayV2(arr){
    let newArray = [];
    let helper = -Infinity;

    arr.forEach(e => {
        if(e >= helper){
            newArray.push(e);
            helper = e;
        }
    });

    return newArray;
}

function extract_increasing_subsequence_from_arrayV3(arr){
    let result = [];
    let biggestNumber = arr[0];

    for (let i = 0; i < arr.length; i++) {
        let currenNumber = arr[i];

        if(currenNumber >= biggestNumber){
            result.push(currenNumber);
            biggestNumber = currenNumber;
        }
    }

    return result;
}

function extract_increasing_subsequence_from_arrayV4(arr){
    return arr.reduce((a, v) => {
        if(v >= (a[a.length - 1] || arr[0])){
            a.push(v);
        }

        return a;
    }, []);
}
