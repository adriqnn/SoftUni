function a_miner_taskV1(input){
    let inventory = {};

    for (let i = 0; i < input.length; i += 2) {
        if(inventory[input[i]] === undefined){
            inventory[input[i]] = 0;
        }

        inventory[input[i]] = inventory[input[i]] + Number(input[i + 1]);
    }

    return Object.entries(inventory).map(e => `${e[0]} -> ${e[1]}`).join("\n");
}

const a_miner_taskV2 = function(input){
    let inventory = {};

    for (let i = 0; i < input.length; i += 2) {
        if(inventory[input[i]] === undefined){
            inventory[input[i]] = 0;
        }

        inventory[input[i]] = inventory[input[i]] + Number(input[i + 1]);
    }

    return Object.entries(inventory).map(e => `${e[0]} -> ${e[1]}`).join("\n");
}

const a_miner_taskV3 = (input) => {
    let inventory = {};

    for (let i = 0; i < input.length; i += 2) {
        if(inventory[input[i]] === undefined){
            inventory[input[i]] = 0;
        }

        inventory[input[i]] = inventory[input[i]] + Number(input[i + 1]);
    }

    return Object.entries(inventory).map(e => `${e[0]} -> ${e[1]}`).join("\n");
}
