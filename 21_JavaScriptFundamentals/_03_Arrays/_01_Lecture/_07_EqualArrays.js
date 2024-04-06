function equal_arraysV1(arr1, arr2){
    let result;
    let sum = 0;
    let equal = true;

    for (let i = 0; i < arr1.length; i++) {
        let first = Number(arr1[i]);
        let second = Number(arr2[i]);

        if(first !== second){
            result = `Arrays are not identical. Found difference at ${i} index`;
            equal = false;

            break;
        }

        sum += first;
    }

    return equal ? `Arrays are identical. Sum: ${sum}` : result;
}

const equal_arraysV2 = function(arr1, arr2){
    let result;
    let sum = 0;
    let equal = true;

    for (let i = 0; i < arr1.length; i++) {
        let first = Number(arr1[i]);
        let second = Number(arr2[i]);

        if(first !== second){
            result = `Arrays are not identical. Found difference at ${i} index`;
            equal = false;

            break;
        }

        sum += first;
    }

    return equal ? `Arrays are identical. Sum: ${sum}` : result;
}

const equal_arraysV3 = (arr1, arr2) => {
    let result;
    let sum = 0;
    let equal = true;

    for (let i = 0; i < arr1.length; i++) {
        let first = Number(arr1[i]);
        let second = Number(arr2[i]);

        if(first !== second){
            result = `Arrays are not identical. Found difference at ${i} index`;
            equal = false;

            break;
        }

        sum += first;
    }

    return equal ? `Arrays are identical. Sum: ${sum}` : result;
}