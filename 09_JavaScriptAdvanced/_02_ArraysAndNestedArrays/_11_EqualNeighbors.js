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

function equal_neighborsV2(matrix){
    let counter = 0;

    for(let rowIndex = 0; rowIndex < matrix.length; rowIndex++){
        for(let colIndex = 0; colIndex < matrix[rowIndex].length-1; colIndex++){
            if(matrix[rowIndex][colIndex] === matrix[rowIndex][colIndex+1]){
                counter++;
            }
        }
    }

    const rowSize = matrix[0].length;

    for(let colIndex = 0; colIndex < rowSize; colIndex++){
        for(let rowIndex = 0; rowIndex < matrix.length-1; rowIndex++){
            if(matrix[rowIndex][colIndex] === matrix[rowIndex+1][colIndex]){
                counter++;
            }
        }
    }

    return counter;
}
