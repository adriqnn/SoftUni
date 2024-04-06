function orbitV1(array){
    let rows = array[0];
    let cols = array[1];
    let rowStar = array[2];
    let colStar = array[3];

    let matrix = [];
    for (let i = 0; i < rows; i++) {
        matrix.push([]);
    }

    for (let row = 0; row < rows; row++) {
        for (let col = 0; col < cols; col++) {
            matrix[row][col] = Math.max(Math.abs(row - rowStar), Math.abs(col - colStar)) + 1;
        }
    }

    let result = "";
    matrix.forEach(e => result += `${e.join(" ")}\n`);

    return result;
}

const orbitV2 = function(array){
    let rows = array[0];
    let cols = array[1];
    let rowStar = array[2];
    let colStar = array[3];

    let matrix = [];
    for (let i = 0; i < rows; i++) {
        matrix.push([]);
    }

    for (let row = 0; row < rows; row++) {
        for (let col = 0; col < cols; col++) {
            matrix[row][col] = Math.max(Math.abs(row - rowStar), Math.abs(col - colStar)) + 1;
        }
    }

    let result = "";
    matrix.forEach(e => result += `${e.join(" ")}\n`);

    return result;
}

const orbitV3 = (array) => {
    let rows = array[0];
    let cols = array[1];
    let rowStar = array[2];
    let colStar = array[3];

    let matrix = [];
    for (let i = 0; i < rows; i++) {
        matrix.push([]);
    }

    for (let row = 0; row < rows; row++) {
        for (let col = 0; col < cols; col++) {
            matrix[row][col] = Math.max(Math.abs(row - rowStar), Math.abs(col - colStar)) + 1;
        }
    }

    let result = "";
    matrix.forEach(e => result += `${e.join(" ")}\n`);

    return result;
}