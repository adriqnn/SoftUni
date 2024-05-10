function validity_checkerV1(...args){
    let x1 = args.shift();
    let y1 = args.shift();
    let x2 = args.shift();
    let y2 = args.shift();

    let result = "";

    let distanceX1Y1Z = Math.sqrt((0 - x1) * (0 - x1) + (0 - y1) * (0 - y1));
    let distanceX2Y2z = Math.sqrt((0 - x2) * (0 - x2) + (0 - y2) * (0 - y2));
    let distanceX1Y1X2Y2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    Number.isInteger(distanceX1Y1Z) ? result += `{${x1}, ${y1}} to {${0}, ${0}} is valid\n` : result += `{${x1}, ${y1}} to {${0}, ${0}} is invalid\n`;
    Number.isInteger(distanceX2Y2z) ? result += `{${x2}, ${y2}} to {${0}, ${0}} is valid\n` : result += `{${x2}, ${y2}} to {${0}, ${0}} is invalid\n`;
    Number.isInteger(distanceX1Y1X2Y2) ? result += `{${x1}, ${y1}} to {${x2}, ${y2}} is valid\n` : result += `{${x1}, ${y1}} to {${x2}, ${y2}} is invalid\n`;

    return result;
}

function validity_checkerV2(...points){
    let [x1, y1, x2, y2] = points;
    let result = "";

    let distanceX1Y1Z = Math.sqrt((0 - x1) * (0 - x1) + (0 - y1) * (0 - y1));
    let distanceX2Y2z = Math.sqrt((0 - x2) * (0 - x2) + (0 - y2) * (0 - y2));
    let distanceX1Y1X2Y2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    Number.isInteger(distanceX1Y1Z) ? result += `{${x1}, ${y1}} to {${0}, ${0}} is valid\n` : result += `{${x1}, ${y1}} to {${0}, ${0}} is invalid\n`;
    Number.isInteger(distanceX2Y2z) ? result += `{${x2}, ${y2}} to {${0}, ${0}} is valid\n` : result += `{${x2}, ${y2}} to {${0}, ${0}} is invalid\n`;
    Number.isInteger(distanceX1Y1X2Y2) ? result += `{${x1}, ${y1}} to {${x2}, ${y2}} is valid\n` : result += `{${x1}, ${y1}} to {${x2}, ${y2}} is invalid\n`;

    return result;
}

function validity_checkerV3(x1, y1, x2, y2){
    const isValidDistance = (x1, y1, x2, y2) => Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) % 1 === 0;

    const pairs = [ [x1, y1, 0, 0], [x2, y2, 0, 0], [x1, y1, x2, y2] ];
    const printMsg = (a, b, c, d, validity) => `{${a}, ${b}} to {${c}, ${d}} is ${validity}`;
    let result = "";

    pairs.forEach((e, i) => result += `${isValidDistance(...pairs[i]) ? printMsg(...e, "valid") : printMsg(...e, "invalid")}\n`);

    return result;
}
