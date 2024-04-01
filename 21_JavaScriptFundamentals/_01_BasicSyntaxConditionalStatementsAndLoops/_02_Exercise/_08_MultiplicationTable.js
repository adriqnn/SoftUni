function multiplication_tableV1(number){
    let table = "";

    for (let i = 1; i <= 10; i++) {
        table += `${number} X ${i} = ${number * i}\n`;
    }

    return table;
}

const multiplication_tableV2 = function(number){
    let table = "";

    for (let i = 1; i <= 10; i++) {
        table += `${number} X ${i} = ${number * i}\n`;
    }

    return table;
}

const multiplication_tableV3 = (number) => {
    let table = "";

    for (let i = 1; i <= 10; i++) {
        table += `${number} X ${i} = ${number * i}\n`;
    }

    return table;
}