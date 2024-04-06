function merge_arraysV1(arr1, arr2){
    let length = arr1.length;
    let newArray = [];

    for (let i = 0; i < length; i++) {
        let first = arr1[i];
        let second = arr2[i];

        i % 2 === 0 ? newArray[i] = ((Number(first) + Number(second))) : newArray[i] = (first + "" + second);
    }

    return newArray.join(" - ");
}

const merge_arraysV2 = function(arr1, arr2){
    let length = arr1.length;
    let newArray = [];

    for (let i = 0; i < length; i++) {
        let first = arr1[i];
        let second = arr2[i];

        i % 2 === 0 ? newArray[i] = ((Number(first) + Number(second))) : newArray[i] = (first + "" + second);
    }

    return newArray.join(" - ");
}

const merge_arraysV3 = (arr1, arr2) => {
    let length = arr1.length;
    let newArray = [];

    for (let i = 0; i < length; i++) {
        let first = arr1[i];
        let second = arr2[i];

        i % 2 === 0 ? newArray[i] = ((Number(first) + Number(second))) : newArray[i] = (first + "" + second);
    }

    return newArray.join(" - ");
}

// console.log(merge_arraysV1(['5', '15', '23', '56', '35'], ['17', '22', '87', '36', '11']));
// console.log(merge_arraysV1(['13', '12312', '5', '77', '4'], ['22', '333', '5', '122', '44']));