function garageV1(input){
    let garages = {};

    input.forEach(e => {
        let [storage, ...details] = e.split(", ");
        let [garage, property] = storage.split(" - ");
        let [k, v] = property.split(": ");

        if(!garages.hasOwnProperty(garage)){
            garages[garage] = [];
        }

        garages[garage].push(`--- ${k} - ${v}${details.length > 0 ? `, ` : ""}${details.map(e => {
            let [k, v] = e.split(": ");

            return `${k} - ${v}`;
        }).join(", ")}`);
    });

    return Object.entries(garages).map(e => `Garage № ${e[0]}\n${e[1].join("\n")}`).join("\n");
}

const garageV2 = function(input){
    let garages = {};

    input.forEach(e => {
        let [storage, ...details] = e.split(", ");
        let [garage, property] = storage.split(" - ");
        let [k, v] = property.split(": ");

        if(!garages.hasOwnProperty(garage)){
            garages[garage] = [];
        }

        garages[garage].push(`--- ${k} - ${v}${details.length > 0 ? `, ` : ""}${details.map(e => {
            let [k, v] = e.split(": ");

            return `${k} - ${v}`;
        }).join(", ")}`);
    });

    return Object.entries(garages).map(e => `Garage № ${e[0]}\n${e[1].join("\n")}`).join("\n");
}

const garageV3 = (input) => {
    let garages = {};

    input.forEach(e => {
        let [storage, ...details] = e.split(", ");
        let [garage, property] = storage.split(" - ");
        let [k, v] = property.split(": ");

        if(!garages.hasOwnProperty(garage)){
            garages[garage] = [];
        }

        garages[garage].push(`--- ${k} - ${v}${details.length > 0 ? `, ` : ""}${details.map(e => {
            let [k, v] = e.split(": ");

            return `${k} - ${v}`;
        }).join(", ")}`);
    });

    return Object.entries(garages).map(e => `Garage № ${e[0]}\n${e[1].join("\n")}`).join("\n");
}

// console.log(garageV1(['1 - color: blue, fuel type: diesel', '1 - color: red, manufacture: Audi', '2 - fuel type: petrol', '4 - color: dark blue, fuel type: diesel, manufacture: Fiat']));
