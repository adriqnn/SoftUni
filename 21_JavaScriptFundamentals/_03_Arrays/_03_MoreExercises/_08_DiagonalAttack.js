function diagonal_attackV1(array){
    const matrix = [];
    for (let el of array) {
        matrix.push(el.split(' ').map(Number));
    }

    const size = matrix.length;
    let primaryDiagonalSum = 0;
    let secondaryDiagonalSum = 0;

    for (let i = 0; i < size; i++) {
        primaryDiagonalSum += matrix[i][i]; // Add element from main diagonal (row = col)
        secondaryDiagonalSum += matrix[i][size - 1 - i]; // Add element from secondary diagonal (row + col = size - 1)
    }
    
    if(primaryDiagonalSum === secondaryDiagonalSum){
        for (let i = 0; i < matrix.length; i++) {
            for (let j = 0; j < matrix.length; j++) {
                if (i !== j && i !== matrix.length - 1 - j) {
                    matrix[i][j] = primaryDiagonalSum;
                }
            }
        }
    }

    let result = "";
    matrix.forEach(e => result += `${e.join(" ")}\n`);

    return result;
}

const diagonal_attackV2 = function(array){
    const matrix = [];
    for (let el of array) {
        matrix.push(el.split(' ').map(Number));
    }

    const size = matrix.length;
    let primaryDiagonalSum = 0;
    let secondaryDiagonalSum = 0;

    for (let i = 0; i < size; i++) {
        primaryDiagonalSum += matrix[i][i]; // Add element from main diagonal (row = col)
        secondaryDiagonalSum += matrix[i][size - 1 - i]; // Add element from secondary diagonal (row + col = size - 1)
    }

    if(primaryDiagonalSum === secondaryDiagonalSum){
        for (let i = 0; i < matrix.length; i++) {
            for (let j = 0; j < matrix.length; j++) {
                if (i !== j && i !== matrix.length - 1 - j) {
                    matrix[i][j] = primaryDiagonalSum;
                }
            }
        }
    }

    let result = "";
    matrix.forEach(e => result += `${e.join(" ")}\n`);

    return result;
}

const diagonal_attackV3 = (array) => {
    const matrix = [];
    for (let el of array) {
        matrix.push(el.split(' ').map(Number));
    }

    const size = matrix.length;
    let primaryDiagonalSum = 0;
    let secondaryDiagonalSum = 0;

    for (let i = 0; i < size; i++) {
        primaryDiagonalSum += matrix[i][i]; // Add element from main diagonal (row = col)
        secondaryDiagonalSum += matrix[i][size - 1 - i]; // Add element from secondary diagonal (row + col = size - 1)
    }

    if(primaryDiagonalSum === secondaryDiagonalSum){
        for (let i = 0; i < matrix.length; i++) {
            for (let j = 0; j < matrix.length; j++) {
                if (i !== j && i !== matrix.length - 1 - j) {
                    matrix[i][j] = primaryDiagonalSum;
                }
            }
        }
    }

    let result = "";
    matrix.forEach(e => result += `${e.join(" ")}\n`);

    return result;
}

// console.log(diagonal_attackV1(['5 3 12 3 1', '11 4 23 2 5', '101 12 3 21 10', '1 4 5 2 2', '5 22 33 11 1']));