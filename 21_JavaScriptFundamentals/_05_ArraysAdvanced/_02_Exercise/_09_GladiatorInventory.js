function gladiator_inventoryV1(input){
    let inventory = input.shift().split(" ");
    let commands = {
        "Buy": (x) => {
            if(inventory.indexOf(x[0]) === -1){
                inventory.push(x[0]);
            }
        },
        "Trash": (x) => {
            let n = inventory.indexOf(x[0]);
            if(n > -1){
                inventory.splice(n, 1);
            }
        },
        "Repair": (x) => {
            let n = inventory.indexOf(x[0]);
            if (n > -1) {
                inventory.splice(n, 1);
                inventory.push(x[0]);
            }
        },
        "Upgrade": (x) => {
            let [item, upgrade] = x[0].split("-");
            let n = inventory.indexOf(item);
            if (n > -1) {
                inventory.splice(n + 1, 0, `${item}:${upgrade}`);
            }
        }
    }

    for (let i = 0; i < input.length; i++) {
        let [operation, ...args] = input[i].split(" ");
        commands[operation](args);
    }

    return inventory.join(" ");
}

const gladiator_inventoryV2 = function(input){
    let inventory = input.shift().split(" ");
    let commands = {
        "Buy": (x) => {
            if(inventory.indexOf(x[0]) === -1){
                inventory.push(x[0]);
            }
        },
        "Trash": (x) => {
            let n = inventory.indexOf(x[0]);
            if(n > -1){
                inventory.splice(n, 1);
            }
        },
        "Repair": (x) => {
            let n = inventory.indexOf(x[0]);
            if (n > -1) {
                inventory.splice(n, 1);
                inventory.push(x[0]);
            }
        },
        "Upgrade": (x) => {
            let [item, upgrade] = x[0].split("-");
            let n = inventory.indexOf(item);
            if (n > -1) {
                inventory.splice(n + 1, 0, `${item}:${upgrade}`);
            }
        }
    }

    for (let i = 0; i < input.length; i++) {
        let [operation, ...args] = input[i].split(" ");
        commands[operation](args);
    }

    return inventory.join(" ");
}

const gladiator_inventoryV3 = (input) => {
    let inventory = input.shift().split(" ");
    let commands = {
        "Buy": (x) => {
            if(inventory.indexOf(x[0]) === -1){
                inventory.push(x[0]);
            }
        },
        "Trash": (x) => {
            let n = inventory.indexOf(x[0]);
            if(n > -1){
                inventory.splice(n, 1);
            }
        },
        "Repair": (x) => {
            let n = inventory.indexOf(x[0]);
            if (n > -1) {
                inventory.splice(n, 1);
                inventory.push(x[0]);
            }
        },
        "Upgrade": (x) => {
            let [item, upgrade] = x[0].split("-");
            let n = inventory.indexOf(item);
            if (n > -1) {
                inventory.splice(n + 1, 0, `${item}:${upgrade}`);
            }
        }
    }

    for (let i = 0; i < input.length; i++) {
        let [operation, ...args] = input[i].split(" ");
        commands[operation](args);
    }

    return inventory.join(" ");
}

// console.log(gladiator_inventoryV1(['SWORD Shield Spear', 'Buy Bag', 'Trash Shield', 'Repair Spear', 'Upgrade SWORD-Steel']));