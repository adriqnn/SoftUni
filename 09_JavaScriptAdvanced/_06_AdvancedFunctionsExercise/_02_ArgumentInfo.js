function argument_infoV1(){
    // using arguments is a special word to use the parameters of the function
    const params = Array.from(arguments);
    const types = {};
    let result = ``;

    for (const arg of params) {
        const type = typeof arg;
        result += `${type}: ${arg}\n`;

        if(types[type] === undefined){
            types[type] = 0;
        }

        types[type]++;
    }

    const returnTypes = Object.entries(types).sort((a, b) => b[1] - b[1]);
    for (const [type, count] of returnTypes) {
        result += `${type}: ${count}\n`;
    }

    return result;
}

function argument_infoV2(...params){
    const types = {};
    let out = ``;

    for (const arg of params) {
        const type = typeof arg;
        out += `${type}: ${arg}\n`;

        if(types[type] === undefined){
            types[type] = 0;
        }

        types[type]++;
    }

    const result = Object.entries(types).sort((a,b) => b[1] - a[1]);
    for (const [type,count] of result) {
        out += `${type} = ${count}\n`;
    }
}

function argument_infoV3(...args) {
    const count = {};
    const result = args.map(x => {
        count[typeof x] = (count[typeof x] || 0) + 1;

        return `${typeof x}: ${x}`;
    });

    let out = ``;
    result.forEach(e => out += `${e}\n`);
    Object.entries(count).sort((x,y) => y[1] - x[1]).map(([type, counts]) => out += `${type} = ${counts}\n`);

    return out;
}
