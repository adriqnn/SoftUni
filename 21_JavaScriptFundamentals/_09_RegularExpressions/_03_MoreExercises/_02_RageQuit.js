function rage_quitV1(input){
    let regex = /[\D]+([\d]+)/g;
    input = input.shift().match(regex);
    let pattern = /([\D]+)([0-9]+)/;

    let str = input.reduce((a, v) => {
        let result = v.match(pattern);
        let sub = result[1].toUpperCase();
        let count = Number(result[2]);
        a += sub.repeat(count);
        return a;
    }, "");

    let reduced = new Set(str).size;
    return `Unique symbols used: ${reduced}\n${str}`;
}

const rage_quitV2 = function(input){
    let regex = /[\D]+([\d]+)/g;
    input = input.shift().match(regex);
    let pattern = /([\D]+)([0-9]+)/;

    let str = input.reduce((a, v) => {
        let result = v.match(pattern);
        let sub = result[1].toUpperCase();
        let count = Number(result[2]);
        a += sub.repeat(count);
        return a;
    }, "");

    let reduced = new Set(str).size;
    return `Unique symbols used: ${reduced}\n${str}`;
}

const rage_quitV3 = (input) => {
    let regex = /[\D]+([\d]+)/g;
    input = input.shift().match(regex);
    let pattern = /([\D]+)([0-9]+)/;

    let str = input.reduce((a, v) => {
        let result = v.match(pattern);
        let sub = result[1].toUpperCase();
        let count = Number(result[2]);
        a += sub.repeat(count);
        return a;
    }, "");

    let reduced = new Set(str).size;
    return `Unique symbols used: ${reduced}\n${str}`;
}