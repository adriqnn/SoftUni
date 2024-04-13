function townsV1(input){
    let towns = [];
    input.forEach(e => {
        let [town, latitude, longitude] = e.split(" | ");
        towns.push({town, latitude: Number(latitude).toFixed(2), longitude: Number(longitude).toFixed(2)});
    });

    return towns.map(e => `{ town: '${e.town}', latitude: '${e.latitude}', longitude: '${e.longitude}' }`).join("\n");
    // towns.forEach(e => console.log(e));
}

const townsV2 = function(input){
    let towns = [];
    input.forEach(e => {
        let [town, latitude, longitude] = e.split(" | ");
        towns.push({town, latitude: Number(latitude).toFixed(2), longitude: Number(longitude).toFixed(2)});
    });

    return towns.map(e => `{ town: '${e.town}', latitude: '${e.latitude}', longitude: '${e.longitude}' }`).join("\n");
}

const townsV3 = (input) => {
    let towns = [];
    input.forEach(e => {
        let [town, latitude, longitude] = e.split(" | ");
        towns.push({town, latitude: Number(latitude).toFixed(2), longitude: Number(longitude).toFixed(2)});
    });

    return towns.map(e => `{ town: '${e.town}', latitude: '${e.latitude}', longitude: '${e.longitude}' }`).join("\n");
}

// console.log(townsV1(['Sofia | 42.696552 | 23.32601', 'Beijing | 39.913818 | 116.363625']));