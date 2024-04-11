function sortingV1(array){
    let arr = [];
    array.sort((a, b) => a - b);

    while(array.length >= 1){
        arr.push(array.pop());
        arr.push(array.shift());
    }

    console.log(arr.join(" "));
}

const sortingV2 = function(array){
    let arr = [];
    array.sort((a, b) => a - b);

    while(array.length >= 1){
        arr.push(array.pop());
        arr.push(array.shift());
    }

    console.log(arr.join(" "));
}

const sortingV3 = (array) => {
    let arr = [];
    array.sort((a, b) => a - b);

    while(array.length >= 1){
        arr.push(array.pop());
        arr.push(array.shift());
    }

    console.log(arr.join(" "));
}

// sortingV1([1, 21, 3, 52, 69, 63, 31, 2, 18, 94]);