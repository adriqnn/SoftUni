function cityV1(cityInfo){
    return Object.entries(cityInfo).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const cityV2 = function(cityInfo){
    return Object.entries(cityInfo).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const cityV3 = (cityInfo) => {
    for (let elements of Object.keys(cityInfo)) {
        console.log(`${elements} -> ${cityInfo[elements]}`);
    }
}