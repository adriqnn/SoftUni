function bunny_killV1(array){
    let location = array.pop().split(" ").map((str) => str.split(",").map((x) => Number(x)));
    let matrix = array.map((row) => row.split(" ").map((x) => Number(x)));

    let damage = 0;
    let killCounter = 0;

    for (let i = 0; i < location.length; i++) {
        let locationRow = location[i][0];
        let locationCol = location[i][1];
        let value = matrix[locationRow][locationCol];

        if (value <= 0) {
            continue;
        }

        let startRow = Math.max(0, locationRow - 1);
        let endRow = Math.min(locationRow + 1, array.length - 1);

        for (let row = startRow; row <= endRow; row++) {
            let startCol = Math.max(0, locationCol - 1);
            let endCol = Math.min(locationCol + 1, array[row].length - 1);

            for (let col = startCol; col <= endCol; col++) {
                matrix[row][col] -= value;
            }
        }

        killCounter++;
        damage += value;
    }

    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix[row].length; col++) {
            if (matrix[row][col] > 0) {
                damage += matrix[row][col];
                killCounter++;
            }
        }
    }

    return `${damage}\n${killCounter}`;
}

const bunny_killV2 = function(array){
    let location = array.pop().split(" ").map((str) => str.split(",").map((x) => Number(x)));
    let matrix = array.map((row) => row.split(" ").map((x) => Number(x)));

    let damage = 0;
    let killCounter = 0;

    for (let i = 0; i < location.length; i++) {
        let locationRow = location[i][0];
        let locationCol = location[i][1];
        let value = matrix[locationRow][locationCol];

        if (value <= 0) {
            continue;
        }

        let startRow = Math.max(0, locationRow - 1);
        let endRow = Math.min(locationRow + 1, array.length - 1);

        for (let row = startRow; row <= endRow; row++) {
            let startCol = Math.max(0, locationCol - 1);
            let endCol = Math.min(locationCol + 1, array[row].length - 1);

            for (let col = startCol; col <= endCol; col++) {
                matrix[row][col] -= value;
            }
        }

        killCounter++;
        damage += value;
    }

    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix[row].length; col++) {
            if (matrix[row][col] > 0) {
                damage += matrix[row][col];
                killCounter++;
            }
        }
    }

    return `${damage}\n${killCounter}`;
}

const bunny_killV3 = (array) => {
    let location = array.pop().split(" ").map((str) => str.split(",").map((x) => Number(x)));
    let matrix = array.map((row) => row.split(" ").map((x) => Number(x)));

    let damage = 0;
    let killCounter = 0;

    for (let i = 0; i < location.length; i++) {
        let locationRow = location[i][0];
        let locationCol = location[i][1];
        let value = matrix[locationRow][locationCol];

        if (value <= 0) {
            continue;
        }

        let startRow = Math.max(0, locationRow - 1);
        let endRow = Math.min(locationRow + 1, array.length - 1);

        for (let row = startRow; row <= endRow; row++) {
            let startCol = Math.max(0, locationCol - 1);
            let endCol = Math.min(locationCol + 1, array[row].length - 1);

            for (let col = startCol; col <= endCol; col++) {
                matrix[row][col] -= value;
            }
        }

        killCounter++;
        damage += value;
    }

    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix[row].length; col++) {
            if (matrix[row][col] > 0) {
                damage += matrix[row][col];
                killCounter++;
            }
        }
    }

    return `${damage}\n${killCounter}`;
}