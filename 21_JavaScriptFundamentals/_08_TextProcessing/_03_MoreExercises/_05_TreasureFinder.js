function treasure_finderV1(input){
    let key = input.shift().trim().split(" ").map(Number);
    let treasureInformation = [];

    while (input[0] !== "find") {
        let consoleInput = input.shift();
        let decrypted = "";

        for (let j = 0; j < consoleInput.length; j++) {
            decrypted += String.fromCharCode(consoleInput.charCodeAt(j) - key[(j % key.length)]);
        }

        treasureInformation.push(finding(decrypted));
    }

    function finding(string) {
        let patternType = /(?:&)(?<type>.+)(?:&)/g;
        let patternCoordinates = /<(?<coordinates>.+)>/g;

        if(string.match(patternType) && string.match(patternCoordinates)){
            let type = string.match(patternType);
            type = type[0].substring(1, type[0].length -1);

            let coordinates = string.match(patternCoordinates);
            coordinates = coordinates[0].substring(1, coordinates[0].length -1);

            return `Found ${type} at ${coordinates}`
        }
    }

    let print = "";
    for(let el of treasureInformation){
        if(el !== undefined){
            print += `${el}\n`;
        }
    }

    return print.trim();
}

const treasure_finderV2 = function(input){
    let key = input.shift().trim().split(" ").map(Number);
    let consoleInput = input.slice(0, -1);
    let treasureInformation = [];

    for (let i = 0; i < consoleInput.length; i++) {
        let decrypted = "";

        for (let j = 0; j < consoleInput[i].length; j++) {
            decrypted += String.fromCharCode(consoleInput[i].charCodeAt(j) - key[(j % key.length)]);
        }

        treasureInformation.push(decrypted);
    }

    let result = [];
    for (let i = 0; i < treasureInformation.length; i++) {
        let regexTypeOfTreasure = /(?:&)(?<type>.+)(?:&)/g;
        let regexCoordinates = /<(?<coordinates>.+)>/g;


        if(treasureInformation[i].match(regexTypeOfTreasure) && treasureInformation[i].match(regexCoordinates)){
            let type = treasureInformation[i].match(regexTypeOfTreasure);
            type = type[0].substring(1, type[0].length -1);

            let coordinates = treasureInformation[i].match(regexCoordinates);
            coordinates = coordinates[0].substring(1, coordinates[0].length -1);

            result.push(`Found ${type} at ${coordinates}`);
        }
    }

    let print = "";
    for(let el of result){
        if(el !== undefined){
            print += `${el}\n`;
        }
    }

    return print.trim();
}

const treasure_finderV3 = (input) => {
    let key = input.shift().split(" ").map(Number);
    let consoleInput = input.slice(0, -1);
    let treasureInformation = [];

    for (let i = 0; i < consoleInput.length; i++) {
        let decrypted = "";

        for (let j = 0; j < consoleInput[i].length; j++) {
            decrypted += String.fromCharCode(consoleInput[i].charCodeAt(j) - key[(j % key.length)]);
        }

        treasureInformation.push(decrypted);
    }

    let regexTypeOfTreasure = /(?:&)(?<type>.+)(?:&)/;
    let regexCoordinates = /<(?<coordinates>.+)>/;

    let result = "";
    for (let i = 0; i < treasureInformation.length; i++) {
        const matcherTypeOfTreasure = treasureInformation[i].match(regexTypeOfTreasure);
        let treasure = "";

        const matcherCoordinates = treasureInformation[i].match(regexCoordinates);
        let coordinates = "";

        if ((matcherTypeOfTreasure && matcherTypeOfTreasure.groups) && (matcherCoordinates && matcherCoordinates.groups)){
            treasure += matcherTypeOfTreasure.groups.type;
            coordinates += matcherCoordinates.groups.coordinates;
            result += `Found ${treasure} at ${coordinates}\n`;
        }
    }

    return result.trim();
}

function treasure_finderV4(input){
    let key = input.shift().trim().split(" ").map(Number);
    let treasureInformation = [];

    while (input[0] !== "find") {
        let consoleInput = input.shift();
        let decrypted = "";

        for (let j = 0; j < consoleInput.length; j++) {
            decrypted += String.fromCharCode(consoleInput.charCodeAt(j) - key[(j % key.length)]);
        }

        treasureInformation.push(decrypted);
    }


    let result = [];
    for (let i = 0; i < treasureInformation.length; i++) {
        let regexTypeOfTreasure = /(?:&)(?<type>.+)(?:&)/g;
        let regexCoordinates = /<(?<coordinates>.+)>/g;

        if(treasureInformation[i].match(regexTypeOfTreasure) && treasureInformation[i].match(regexCoordinates)){
            let type = treasureInformation[i].match(regexTypeOfTreasure);
            type = type[0].substring(1, type[0].length -1);

            let coordinates = treasureInformation[i].match(regexCoordinates);
            coordinates = coordinates[0].substring(1, coordinates[0].length -1);

            result.push(`Found ${type} at ${coordinates}`);
        }
    }

    let print = "";
    for(let el of result){
        if(el !== undefined){
            print += `${el}\n`;
        }
    }

    return print.trim();
}

function treasure_finderV5(input){
    let key = input.shift().split(" ").map(Number);
    let consoleInput = input.slice(0, -1);
    let treasureInformation = [];

    for (let i = 0; i < consoleInput.length; i++) {
        let decrypted = "";

        for (let j = 0; j < consoleInput[i].length; j++) {
            decrypted += String.fromCharCode(consoleInput[i].charCodeAt(j) - key[(j % key.length)]);
        }

        treasureInformation.push(decrypted);
    }

    const regexTypeOfTreasure = /&(?<type>[A-Za-z]+)&/;
    const regexCoordinates = /<(?<coordinates>[A-Za-z0-9]+)>/;

    let result = "";
    for (let i = 0; i < treasureInformation.length; i++) {
        const matcherTypeOfTreasure = treasureInformation[i].match(regexTypeOfTreasure);
        const matcherCoordinates = treasureInformation[i].match(regexCoordinates);

        let treasure = "";
        let coordinates = "";

        if ((matcherTypeOfTreasure && matcherTypeOfTreasure.groups) && (matcherCoordinates && matcherCoordinates.groups)){
            treasure += matcherTypeOfTreasure.groups.type;
            coordinates += matcherCoordinates.groups.coordinates;
            result += `Found ${treasure} at ${coordinates}\n`;
        }
    }

    return result.trim();
}

function treasure_finderV6(input){
    let key = input.shift().split(" ").map(Number);
    let consoleInput = input.slice(0, -1);
    let treasureInformation = [];

    for (let i = 0; i < consoleInput.length; i++) {
        let decrypted = "";

        for (let j = 0; j < consoleInput[i].length; j++) {
            decrypted += String.fromCharCode(consoleInput[i].charCodeAt(j) - key[(j % key.length)]);
        }

        treasureInformation.push(decrypted);
    }

    const regexTypeOfTreasure = /&(?<type>[A-Za-z]+)&/;
    const regexCoordinates = /<(?<coordinates>[A-Za-z0-9]+)>/;

    let result = "";
    for (let i = 0; i < treasureInformation.length; i++) {
        const matcherTypeOfTreasure = treasureInformation[i].match(regexTypeOfTreasure);
        const matcherCoordinates = treasureInformation[i].match(regexCoordinates);

        let treasure = "";
        let coordinates = "";

        if ((matcherTypeOfTreasure && matcherTypeOfTreasure.groups) && (matcherCoordinates && matcherCoordinates.groups)){
            treasure += matcherTypeOfTreasure.groups.type;
            coordinates += matcherCoordinates.groups.coordinates;
            result += `Found ${treasure} at ${coordinates}\n`;
        }
    }

    return result.trim();
}

// console.log(treasure_finderV3(["1 2 1 3", "ikegfp'jpne)bv=41P83X@", "ujfufKt)Tkmyft'duEprsfjqbvfv=53V55XA", "find"]));
// console.log(treasure_finderV3(["1 4 2 5 3 2 1", `Ulgwh"jt$ozfj!'kqqg(!bx"A3U237GC`, "tsojPqsf$(lrne'$CYfqpshksdvfT$>634O57YC", "'stj)>34W68Z@", "find"]));