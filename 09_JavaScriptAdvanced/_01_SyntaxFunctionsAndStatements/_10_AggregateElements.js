function aggregate_elementsV1(...args){
    let result = '';

    result += `${args.reduce((a, v) => a + v, 0)}\n`;
    result += `${args.reduce((a, v) => a + (1 / v), 0)}\n`;
    result += args.join("");

    return result;
}

function aggregate_elementsV2(args){
    let result = '';

    result += `${args.reduce((a, v) => a + v, 0)}\n`;
    result += `${args.reduce((a, v) => a + (1 / v), 0)}\n`;
    result += args.join("");

    return result;
}

function aggregate_elementsV3(params){
        let array = params;

        let sum = 0;
        let inverseSum = 0;
        let concat = '';

        array.forEach(e => {
            sum += e;
            inverseSum += 1 / e;
            concat += String(e);
        });

        return `${sum}\n${inverseSum}\n${concat}`;
}

function aggregate_elementsV4(arr){
    return `${arr.reduce((a, v) => a + v, 0)}\n${arr.reduce((a,v) => a + 1 / v, 0)}\n${arr.join("")}`;
}
