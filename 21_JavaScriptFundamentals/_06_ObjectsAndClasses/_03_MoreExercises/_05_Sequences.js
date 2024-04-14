function sequenceV1(input){
    let arr = input.map(e => JSON.parse(e)).map(e => e.sort((a, b) => b - a)).map(e => e.join(", "));
    let unique = [];

    arr.forEach(e => {
        if(unique.indexOf(e) === -1){
            unique.push(e);
        }
    });

    return unique.map(e => {e = e.split(", ").map(Number); return e}).sort((a, b) => a.length - b.length).map(e => {
        return `[${(e.join(", "))}]`;
    }).join("\n");
}

const sequenceV2 = function(input){
    let set = new Set();

    input.map(e => {
        return e.slice(1, -1).trim().split(", ").map(Number);
    }).map(e => e.sort((a, b) => b - a)).map(e => e.join(", ")).forEach(e => set.add(e));

    return Array.from(set).map(e => {e = e.split(", ").map(Number); return e}).sort((a, b) => a.length - b.length).map(e => `[${e.join(", ")}]`).join("\n");
}

const sequenceV3 = (input) => {
    input = input.map(el => JSON.parse(el));
    input.forEach(element => element.sort((a, b) => b - a));

    let uniqueArr = [];
    for (let i = 0; i < input.length; i++) {
        let isUnique = true;

        for (let k = 0; k < uniqueArr.length; k++) {
            if (uniqueArr[k].toString() === input[i].toString()) {
                isUnique = false;
            }
        }

        if (isUnique) {
            uniqueArr.push(input[i]);
        }
    }

    uniqueArr.sort((a, b) => a.length - b.length).forEach(el =>
        console.log(`[${(el).join(", ")}]`));
}

function sequenceV4(input) {
    input = input.map(JSON.parse).map(e => e.sort((a, b) => b - a)).map(JSON.stringify);
    return [...new Set(input)].map(JSON.parse).sort((a, b) => a.length - b.length).map(e => `[${e.join(", ")}]`).join("\n");
}

function sequenceV5(input){
    input = input.map(e => { return e.slice(1, -1).split(", ").map(Number); }).map(e => e.sort((a, b) => b - a)).map(e => `${e.join(", ")}`);
    return [...new Set(input)].map(e => {e = e.split(", ").map(Number); return e}).sort((a, b) => a.length - b.length).map(e => `[${e.join(", ")}]`).join("\n");
}

function sequenceV6(input){
    let set = {};

    input.map(e => { return e.slice(1, -1).split(", ").map(Number); }).map(e => e.sort((a, b) => b - a)).map(e => {
        let arr = `[${e.join(", ")}]`;
        set[arr] = e.length;
    });

    return Object.entries(set).sort((a, b) => a[1] - b[1]).map(el => `${el[0]}`).join("\n");
}

// console.log(sequenceV5(["[-3, -2, -1, 0, 1, 2, 3, 4]", "[10, 1, -17, 0, 2, 13]", "[4, -3, 3, -2, 2, -1, 1, 0]"]));
// console.log(sequenceV1(["[7.14, 7.180, 7.339, 80.099]", "[7.339, 80.0990, 7.140000, 7.18]", "[7.339, 7.180, 7.14, 80.099]"]));
// sequenceV6(["[-3, -2, -1, 0, 1, 2, 3, 4]", "[10, 1, -17, 0, 2, 13]", "[4, -3, 3, -2, 2, -1, 1, 0]"]);
