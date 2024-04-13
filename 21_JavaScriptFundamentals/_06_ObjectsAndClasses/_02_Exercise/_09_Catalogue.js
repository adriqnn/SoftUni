function catalogueV1(input){
    let alphabet = {};

    input.map(e => {
        let arr = e.split(" : ");
        let item = arr[0];
        let value = arr[1];

        if(!alphabet.hasOwnProperty(item.charAt(0))){
            alphabet[item.charAt(0)] = [];
        }

        alphabet[item.charAt(0)].push(`${item}: ${value}`);
    });

    return Object.entries(alphabet).sort((a, b) => a[0].localeCompare(b[0])).map(([k, v]) => `${k}\n${v.sort((a, b) => a.localeCompare(b)).map(e => `  ${e}`).join("\n")}`).join("\n");
}

const catalogueV2 = function(input){
    let alphabet = {};

    input.map(e => {
        let arr = e.split(" : ");
        let item = arr[0];
        let value = arr[1];

        if(!alphabet.hasOwnProperty(item.charAt(0))){
            alphabet[item.charAt(0)] = [];
        }

        alphabet[item.charAt(0)].push(`${item}: ${value}`);
    });

    return Object.entries(alphabet).sort((a, b) => a[0].localeCompare(b[0])).map(([k, v]) => `${k}\n${v.sort((a, b) => a.localeCompare(b)).map(e => `  ${e}`).join("\n")}`).join("\n");
}

const catalogueV3 = (input) => {
    let alphabet = {};

    input.map(e => {
        let arr = e.split(" : ");
        let item = arr[0];
        let value = arr[1];

        if(!alphabet.hasOwnProperty(item.charAt(0))){
            alphabet[item.charAt(0)] = [];
        }

        alphabet[item.charAt(0)].push(`${item}: ${value}`);
    });

    return Object.entries(alphabet).sort((a, b) => a[0].localeCompare(b[0])).map(([k, v]) => `${k}\n${v.sort((a, b) => a.localeCompare(b)).map(e => `  ${e}`).join("\n")}`).join("\n");
}

// console.log(catalogueV1(['Appricot : 20.4', 'Fridge : 1500', 'TV : 1499', 'Deodorant : 10', 'Boiler : 300', 'Apple : 1.25', 'Anti-Bug Spray : 15', 'T-Shirt : 10']));