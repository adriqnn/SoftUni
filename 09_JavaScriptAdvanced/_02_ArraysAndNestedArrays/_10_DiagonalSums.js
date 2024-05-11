function diagonal_sumV1(matrix){
    return `${matrix.reduce((a, v, i) => a + v[i], 0)} ${matrix.reverse().reduce((a, v, i) => a + v[i], 0)}`;
}

function diagonal_sumV2(matrix){
    const calculateDiagonalSum = (arr) => arr.reduce((a, v, i) => a + v[i], 0);

    return `${calculateDiagonalSum(matrix)} ${calculateDiagonalSum(matrix.reverse())}`;
}

