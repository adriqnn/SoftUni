function equal_neighborsV1(array){
    let counter = 0;

    for (let i = 0; i < array.length; i++) {
        let currentArray = array[i];

        for (let j = 0; j < array[i].length; j++) {
            if(currentArray[j] === currentArray[j + 1]){
                counter++;
            }

            if(array[i + 1] !== undefined){
                let nextArray = array[i + 1];
                if(currentArray[j] === nextArray[j]){
                    counter++;
                }
            }

        }
    }

    return counter;
}

const equal_neighborsV2 = function(array){
    let counter = 0;

    for (let i = 0; i < array.length; i++) {
        let currentArray = array[i];

        for (let j = 0; j < array[i].length; j++) {
            if(currentArray[j] === currentArray[j + 1]){
                counter++;
            }

            if(array[i + 1] !== undefined){
                let nextArray = array[i + 1];
                if(currentArray[j] === nextArray[j]){
                    counter++;
                }
            }

        }
    }

    return counter;
}

const equal_neighborsV3 = (array) => {
    let counter = 0;

    for (let i = 0; i < array.length; i++) {
        let currentArray = array[i];

        for (let j = 0; j < array[i].length; j++) {
            if(currentArray[j] === currentArray[j + 1]){
                counter++;
            }

            if(array[i + 1] !== undefined){
                let nextArray = array[i + 1];
                if(currentArray[j] === nextArray[j]){
                    counter++;
                }
            }

        }
    }

    return counter;
}

// console.log(equal_neighborsV1([['2', '3', '4', '7', '0'], ['4', '0', '5', '3', '4'], ['2', '3', '5', '4', '2'], ['9', '8', '7', '5', '4']]))