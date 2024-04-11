function rosetta_stoneV1(input){
    const templateLength = Number(input.shift());
    const template = [];

    for (let i = 0; i < templateLength; i++) {
        const line = input.shift();
        template.push(line.split(" ").map(Number));
    }

    const matrix = [];

    for (let line of input) {
        matrix.push(line.split(" ").map(Number));
    }

    let result = ``;

    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[0].length; j++) {
            const index = matrix[i][j];

            const decode = template[i % templateLength][j % template[0].length];
            const out = ((index + decode) % 27) + 64;
            result += String.fromCharCode(out);
        }
    }

    const pattern = /@/g;
    result = result.replace(pattern, " ");
    return result;
}

const rosetta_stoneV2 = function(input){
    const templateLength = Number(input.shift());
    const template = [];

    for (let i = 0; i < templateLength; i++) {
        const line = input.shift();
        template.push(line.split(" ").map(Number));
    }

    const matrix = [];

    for (let line of input) {
        matrix.push(line.split(" ").map(Number));
    }

    let result = ``;

    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[0].length; j++) {
            const index = matrix[i][j];

            const decode = template[i % templateLength][j % template[0].length];
            const out = ((index + decode) % 27) + 64;
            result += String.fromCharCode(out);
        }
    }

    const pattern = /@/g;
    result = result.replace(pattern, " ");
    return result;
}

const rosetta_stoneV3 = (input) => {
    const templateLength = Number(input.shift());
    const template = [];

    for (let i = 0; i < templateLength; i++) {
        const line = input.shift();
        template.push(line.split(" ").map(Number));
    }

    const matrix = [];

    for (let line of input) {
        matrix.push(line.split(" ").map(Number));
    }

    let result = ``;

    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[0].length; j++) {
            const index = matrix[i][j];

            const decode = template[i % templateLength][j % template[0].length];
            const out = ((index + decode) % 27) + 64;
            result += String.fromCharCode(out);
        }
    }

    const pattern = /@/g;
    result = result.replace(pattern, " ");
    return result;
}

console.log(rosetta_stoneV1([ '2', '59 36', '82 52', '4 18 25 19 8', '4 2 8 2 18', '23 14 22 0 22', '2 17 13 19 20', '0 9 0 22 22' ]));