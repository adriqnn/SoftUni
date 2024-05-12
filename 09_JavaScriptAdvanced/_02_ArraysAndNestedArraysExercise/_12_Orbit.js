function orbitV1(arr){
    let matrix = new Array(arr[0]).fill(new Array(arr[1]).fill(""));

    return matrix.map((x, i) => x.map((y,j) => Math.max(Math.abs(j - arr[3]), Math.abs(i - arr[2])) + 1)).map(x => x.join(" ")).join("\n");
}

function orbitV2(array){
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
