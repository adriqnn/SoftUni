function the_pyramid_of_king_djoserV1(base, increment){
    let resources = {
        "Stone": 0,
        "Marble": 0,
        "Lapis Lazuli": 0,
        "Gold": 0
    }

    let steps = Math.ceil(base / 2);
    let currentBase = base;

    for (let i = 1; i <= steps; i++) {
        if(i % 5 === 0 && i !== steps){
            resources["Stone"] += ((currentBase - 2) ** 2) * increment;
            resources["Lapis Lazuli"] += ((currentBase ** 2) - ((currentBase - 2) ** 2)) * increment;
        }else if(i === steps){
            resources["Gold"] += (currentBase ** 2) * increment;
        }else{
            resources["Stone"] += ((currentBase - 2) ** 2) * increment;
            resources["Marble"] += ((currentBase ** 2) - ((currentBase - 2) ** 2)) * increment;
        }

        currentBase -= 2;
    }

    return `Stone required: ${Math.ceil(resources["Stone"])}\nMarble required: ${Math.ceil(resources["Marble"])}\nLapis Lazuli required: ${Math.ceil(resources["Lapis Lazuli"])}\nGold required: ${Math.ceil(resources["Gold"])}\nFinal pyramid height: ${Math.floor(steps * increment)}`;
}

const the_pyramid_of_king_djoserV2 = function(base, increment){
    let resources = {
        "Stone": 0,
        "Marble": 0,
        "Lapis Lazuli": 0,
        "Gold": 0
    }

    let steps = Math.ceil(base / 2);
    let currentBase = base;

    for (let i = 1; i <= steps; i++) {
        if(i % 5 === 0 && i !== steps){
            resources["Stone"] += ((currentBase - 2) ** 2) * increment;
            resources["Lapis Lazuli"] += ((currentBase ** 2) - ((currentBase - 2) ** 2)) * increment;
        }else if(i === steps){
            resources["Gold"] += (currentBase ** 2) * increment;
        }else{
            resources["Stone"] += ((currentBase - 2) ** 2) * increment;
            resources["Marble"] += ((currentBase ** 2) - ((currentBase - 2) ** 2)) * increment;
        }

        currentBase -= 2;
    }

    return `Stone required: ${Math.ceil(resources["Stone"])}\nMarble required: ${Math.ceil(resources["Marble"])}\nLapis Lazuli required: ${Math.ceil(resources["Lapis Lazuli"])}\nGold required: ${Math.ceil(resources["Gold"])}\nFinal pyramid height: ${Math.floor(steps * increment)}`;
}

const the_pyramid_of_king_djoserV3 = (base, increment) => {
    let resources = {
        "Stone": 0,
        "Marble": 0,
        "Lapis Lazuli": 0,
        "Gold": 0
    }

    let steps = Math.ceil(base / 2);
    let currentBase = base;

    for (let i = 1; i <= steps; i++) {
        if(i % 5 === 0 && i !== steps){
            resources["Stone"] += ((currentBase - 2) ** 2) * increment;
            resources["Lapis Lazuli"] += ((currentBase ** 2) - ((currentBase - 2) ** 2)) * increment;
        }else if(i === steps){
            resources["Gold"] += (currentBase ** 2) * increment;
        }else{
            resources["Stone"] += ((currentBase - 2) ** 2) * increment;
            resources["Marble"] += ((currentBase ** 2) - ((currentBase - 2) ** 2)) * increment;
        }

        currentBase -= 2;
    }

    return `Stone required: ${Math.ceil(resources["Stone"])}\nMarble required: ${Math.ceil(resources["Marble"])}\nLapis Lazuli required: ${Math.ceil(resources["Lapis Lazuli"])}\nGold required: ${Math.ceil(resources["Gold"])}\nFinal pyramid height: ${Math.floor(steps * increment)}`;
}

// console.log(the_pyramid_of_king_djoserV1(11, 1));
// console.log(the_pyramid_of_king_djoserV1(11, 0.75));
// console.log(the_pyramid_of_king_djoserV1(12, 1));