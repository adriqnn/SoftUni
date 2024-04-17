function furnitureV1(input){
    let regex = />>(?<product>[A-Za-z]+)<<(?<price>\d+(.\d+)?)!(?<quantity>\d+)/g;
    let result = `Bought furniture:\n`;
    let totalPrice = 0;

    while(input[0] !== "Purchase"){
        let current = input.shift().matchAll(regex);

        for (const e of current) {
            totalPrice += e.groups.price * e.groups.quantity;
            result += `${e.groups.product}\n`;
        }
    }

    return result + `Total money spend: ${totalPrice.toFixed(2)}`;
}

const furnitureV2 = function(input){
    let regex = />>(?<product>[A-Za-z]+)<<(?<price>\d+(.\d+)?)!(?<quantity>\d+)/g;
    let result = `Bought furniture:\n`;
    let totalPrice = 0;

    while(input[0] !== "Purchase"){
        let current = input.shift().matchAll(regex);

        for (const e of current) {
            totalPrice += e.groups.price * e.groups.quantity;
            result += `${e.groups.product}\n`;
        }
    }

    return result + `Total money spend: ${totalPrice.toFixed(2)}`;
}

const furnitureV3 = (input) => {
    let regex = />>(?<product>[A-Za-z]+)<<(?<price>\d+(.\d+)?)!(?<quantity>\d+)/g;
    let result = `Bought furniture:\n`;
    let totalPrice = 0;

    while(input[0] !== "Purchase"){
        let current = input.shift().matchAll(regex);

        for (const e of current) {
            totalPrice += e.groups.price * e.groups.quantity;
            result += `${e.groups.product}\n`;
        }
    }

    return result + `Total money spend: ${totalPrice.toFixed(2)}`;
}

// console.log(furnitureV1(['>>Sofa<<312.23!3', '>>TV<<300!5', '>Invalid<<!5', 'Purchase']));