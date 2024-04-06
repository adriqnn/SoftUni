function spiral_matrixV1(rows, columns){
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

const spiral_matrixV2 = function(rows, columns){
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

const spiral_matrixV3 = (rows, columns) => {
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
