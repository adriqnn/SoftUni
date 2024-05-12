function spiral_matrixV1(w, h){
    let matrix = new Array(h).fill(new Array(w).fill([]));
    matrix = matrix.map(x => x.map(y => ""));

    let [startRow, endRow, startCol, endCol, counter] = [0, h - 1, 0, w - 1, 0];

    while(startCol <= endCol && startRow <= endRow){
        for (let i = startCol; i <= endCol; i++) {
            matrix[startRow][i] = ++counter;
        }
        startRow++;

        for (let i = startRow; i <= endCol; i++) {
            matrix[i][endCol] = ++counter;
        }
        endCol--;

        for (let i = endCol; i >= startCol; i--) {
            matrix[endRow][i] = ++counter;
        }
        endRow--;

        for (let i = endRow; i >= startRow; i--) {
            matrix[i][startCol] = ++counter;
        }
        startCol++;
    }

    return matrix.map(x => x.join(" ")).join("\n");
}

function spiral_matrixV2(rows, columns){
    const matrix = new Array(rows).fill(0).map(() => new Array(columns).fill(0));

    let num = 1;
    let top = 0;
    let bottom = rows - 1;
    let left = 0;
    let right = columns - 1;

    while (num <= rows * columns) {
        // Traverse from left to right along the top row
        for (let i = left; i <= right && num <= rows * columns; i++) {
            matrix[top][i] = num++;
        }
        top++;

        // Traverse from top to bottom along the right column
        for (let i = top; i <= bottom && num <= rows * columns; i++) {
            matrix[i][right] = num++;
        }
        right--;

        // Traverse from right to left along the bottom row
        for (let i = right; i >= left && num <= rows * columns; i--) {
            matrix[bottom][i] = num++;
        }
        bottom--;

        // Traverse from bottom to top along the left column
        for (let i = bottom; i >= top && num <= rows * columns; i--) {
            matrix[i][left] = num++;
        }
        left++;
    }

    let result = "";

    for (let row of matrix) {
        result += `${row.join(" ")}\n`;
    }

    return result;
}
