function loading_barV1(number){
    let percent = `${number}% `;
    let bar = ``;
    let n = Math.ceil(number / 10);

    for (let i = 0; i < 10; i++) {
        i < n ? bar += "%" : bar += ".";
    }

    return number === 100 ? `${percent}Complete!\n[${bar}]` : `${percent}[${bar}]\nStill loading...` ;
}

const loading_barV2 = function(number){
    let percent = `${number}% `;
    let bar = ``;
    let n = Math.ceil(number / 10);

    for (let i = 0; i < 10; i++) {
        i < n ? bar += "%" : bar += ".";
    }

    return number === 100 ? `${percent}Complete!\n[${bar}]` : `${percent}[${bar}]\nStill loading...` ;
}

const loading_barV3 = (number) => {
    let percent = `${number}% `;
    let bar = ``;
    let n = Math.ceil(number / 10);

    for (let i = 0; i < 10; i++) {
        i < n ? bar += "%" : bar += ".";
    }

    return number === 100 ? `${percent}Complete!\n[${bar}]` : `${percent}[${bar}]\nStill loading...` ;
}