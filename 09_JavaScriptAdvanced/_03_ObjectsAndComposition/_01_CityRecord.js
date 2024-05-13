function city_recordV1(...args){
    let [town, pop, treasury] = args;

    return { "name": town, "population": pop, treasury };
}

function city_recordV2(name, population, treasury){
    return { name, population, treasury };
}

function city_recordV3(name, population, treasury){
    const result = {
        name, population, treasury
    }

    return result;
}
