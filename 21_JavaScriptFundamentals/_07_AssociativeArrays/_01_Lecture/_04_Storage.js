function storageV1(input){
    let inventory = {};

    input.forEach(e => {
        let [item, quantity] = e.split(" ");

        if(!inventory.hasOwnProperty(item)){
            inventory[item] = 0;
        }

        inventory[item] = inventory[item] + Number(quantity);
    });

    return Object.entries(inventory).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const storageV2 = function(input){
    let inventory = {};

    input.forEach(e => {
        let [item, quantity] = e.split(" ");

        if(!inventory.hasOwnProperty(item)){
            inventory[item] = 0;
        }

        inventory[item] = inventory[item] + Number(quantity);
    });

    return Object.entries(inventory).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const storageV3 = (input) => {
    let inventory = {};

    input.forEach(e => {
        let [item, quantity] = e.split(" ");

        if(!inventory.hasOwnProperty(item)){
            inventory[item] = 0;
        }

        inventory[item] = inventory[item] + Number(quantity);
    });

    return Object.entries(inventory).map(([k, v]) => `${k} -> ${v}`).join("\n");
}