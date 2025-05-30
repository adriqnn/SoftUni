function diagonal_attackV1(matrixRows){
    let matrix = matrixRows.map(row => row.split(' ').map(Number));
    let result = "";

    let sumFirstDiagonal = 0;
    for (let i = 0; i < matrix.length; i++) {
        sumFirstDiagonal = sumFirstDiagonal + matrix[i][i];
    }

    let sumSecondDiagonal = 0;
    for (let j = 0; j < matrix.length; j++) {
        sumSecondDiagonal = sumSecondDiagonal + matrix[j][matrix.length - 1 - j];
    }

    if (sumFirstDiagonal === sumSecondDiagonal){
        for (let q = 0; q < matrix.length; q++) {
            for (let z = 0; z < matrix.length; z++) {
                if( q !== z && q !== matrix.length - 1 - z)  {
                    matrix[q][z] = sumFirstDiagonal;
                }
            }
        }

        printMatrix(matrix);
    } else {
        printMatrix(matrix);
    }

    function printMatrix(matrix) {
        for (let i = 0; i < matrix.length; i++) {
            result += `${matrix[i].join(' ')}\n`;
        }
    }

    return result;
}
