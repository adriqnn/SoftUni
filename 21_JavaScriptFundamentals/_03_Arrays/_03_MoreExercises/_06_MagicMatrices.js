function magic_matricesV1(array){
    const magicSum = array[0].reduce((acc, v) => acc += v, 0);
    let areEqual = true;

    for (let i = 0; i < array.length; i++) {
        let sumRow = 0;
        let sumColl = 0;

        for (let j = 0; j < array.length; j++) {
            sumRow += Number(array[i][j]);
            sumColl += Number(array[j][i]);
        }

        if(sumRow !== magicSum || sumColl !== magicSum) {
            areEqual = false;
            break;
        }
    }

    return areEqual;
}

const magic_matricesV2 = function(array){
    const magicSum = array[0].reduce((acc, v) => acc += v, 0);
    let areEqual = true;

    for (let i = 0; i < array.length; i++) {
        let sumRow = 0;
        let sumColl = 0;

        for (let j = 0; j < array.length; j++) {
            sumRow += Number(array[i][j]);
            sumColl += Number(array[j][i]);
        }

        if(sumRow !== magicSum || sumColl !== magicSum) {
            areEqual = false;
            break;
        }
    }

    return areEqual;
}

const magic_matricesV3 = (array) => {
    const magicSum = array[0].reduce((acc, v) => acc += v, 0);
    let areEqual = true;

    for (let i = 0; i < array.length; i++) {
        let sumRow = 0;
        let sumColl = 0;

        for (let j = 0; j < array.length; j++) {
            sumRow += Number(array[i][j]);
            sumColl += Number(array[j][i]);
        }

        if(sumRow !== magicSum || sumColl !== magicSum) {
            areEqual = false;
            break;
        }
    }

    return areEqual;
}

console.log(magic_matricesV1([[4, 5, 6], [6, 5, 4], [5, 5, 5]]));