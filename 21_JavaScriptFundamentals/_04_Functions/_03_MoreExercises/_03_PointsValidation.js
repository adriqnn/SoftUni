function points_validationV1(points){
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

const points_validationV2 = function(points){
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

const points_validationV3 = (points) => {
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

// console.log(points_validationV1([3, 0, 0, 4]));
// console.log(points_validationV1([2, 1, 1, 1]));