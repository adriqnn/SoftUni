function magic_matricesV1(matrix){
    let isMagical = true;

    for (let i = 0; i < matrix.length - 1; i++) {
        let sumRowOne = matrix[i].reduce((a, b) => a + b, 0);
        let sumRowTwo = matrix[i + 1].reduce((a, b) => a + b, 0);

        let sumColOne = 0;
        let sumColTwo = 0;

        for (let j = 0; j < matrix.length; j++) {
            sumColOne += matrix[i][j];
            sumColTwo += matrix[i + 1][j];
        }

        if(sumRowOne !== sumRowTwo || sumColOne !== sumColTwo){
            isMagical = false;
        }
    }

    return isMagical;
}

function magic_matricesV2(matrix){
    return [
        ...matrix.map(x => x.reduce((a, v) => a + v, 0)),
        ...matrix.reduce((a, v, i) => {
            a.push(matrix.reduce((c, d) => c + d[i], 0));

            return a;
        }, []),
    ].every((x, _, arr) => x === arr[0]);
}
