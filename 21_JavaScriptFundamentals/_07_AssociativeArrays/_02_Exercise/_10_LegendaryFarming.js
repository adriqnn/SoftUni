function legendary_farmingV1(input){
    let key = { shards: 0, motes: 0, fragments: 0 };
    let legendaries = { shards: "Shadowmourne", fragments: "Valanyr", motes: "Dragonwrath" };
    let junk = {};
    input = input.split(" ").map(x => x.toLowerCase());
    let legendary = "";

    for (let i = 0; i < input.length; i += 2) {
        if(key.hasOwnProperty(input[i + 1])){
            key[input[i + 1]] += Number(input[i]);

            if(key[input[i + 1]] >= 250){
                legendary = legendaries[input[i + 1]];
                key[input[i + 1]] = key[input[i + 1]] - 250;
                break;
            }
        }else{
            if(!junk.hasOwnProperty(input[i + 1])){
                junk[input[i + 1]] = 0;
            }

            junk[input[i + 1]] = junk[input[i + 1]] + Number(input[i]);
        }
    }

    key = Object.entries(key).sort((a, b) => b[1] - a[1] !== 0 ? b[1] - a[1] : a[0].localeCompare(b[0]));
    junk = Object.entries(junk).sort((a, b) => a[0].localeCompare(b[0]));

    let result = `${legendary} obtained!\n`;
    key.forEach(e => result += `${e[0]}: ${e[1]}\n`);
    if(Object.keys(junk).length > 0){
        junk.forEach(e => result += `${e[0]}: ${e[1]}\n`);
    }

    return result;
}

const legendary_farmingV2 = function(input){
    let key = { shards: 0, motes: 0, fragments: 0 };
    let legendaries = { shards: "Shadowmourne", fragments: "Valanyr", motes: "Dragonwrath" };
    let junk = {};
    input = input.split(" ").map(x => x.toLowerCase());
    let legendary = "";

    for (let i = 0; i < input.length; i += 2) {
        if(key.hasOwnProperty(input[i + 1])){
            key[input[i + 1]] += Number(input[i]);

            if(key[input[i + 1]] >= 250){
                legendary = legendaries[input[i + 1]];
                key[input[i + 1]] = key[input[i + 1]] - 250;
                break;
            }
        }else{
            if(!junk.hasOwnProperty(input[i + 1])){
                junk[input[i + 1]] = 0;
            }

            junk[input[i + 1]] = junk[input[i + 1]] + Number(input[i]);
        }
    }

    key = Object.entries(key).sort((a, b) => b[1] - a[1] !== 0 ? b[1] - a[1] : a[0].localeCompare(b[0]));
    junk = Object.entries(junk).sort((a, b) => a[0].localeCompare(b[0]));

    let result = `${legendary} obtained!\n`;
    key.forEach(e => result += `${e[0]}: ${e[1]}\n`);
    if(Object.keys(junk).length > 0){
        junk.forEach(e => result += `${e[0]}: ${e[1]}\n`);
    }

    return result;
}

const legendary_farmingV3 = (input) => {
    let key = { shards: 0, motes: 0, fragments: 0 };
    let legendaries = { shards: "Shadowmourne", fragments: "Valanyr", motes: "Dragonwrath" };
    let junk = {};
    input = input.split(" ").map(x => x.toLowerCase());
    let legendary = "";

    for (let i = 0; i < input.length; i += 2) {
        if(key.hasOwnProperty(input[i + 1])){
            key[input[i + 1]] += Number(input[i]);

            if(key[input[i + 1]] >= 250){
                legendary = legendaries[input[i + 1]];
                key[input[i + 1]] = key[input[i + 1]] - 250;
                break;
            }
        }else{
            if(!junk.hasOwnProperty(input[i + 1])){
                junk[input[i + 1]] = 0;
            }

            junk[input[i + 1]] = junk[input[i + 1]] + Number(input[i]);
        }
    }

    key = Object.entries(key).sort((a, b) => b[1] - a[1] !== 0 ? b[1] - a[1] : a[0].localeCompare(b[0]));
    junk = Object.entries(junk).sort((a, b) => a[0].localeCompare(b[0]));

    let result = `${legendary} obtained!\n`;
    key.forEach(e => result += `${e[0]}: ${e[1]}\n`);
    if(Object.keys(junk).length > 0){
        junk.forEach(e => result += `${e[0]}: ${e[1]}\n`);
    }

    return result;
}

// console.log(legendary_farmingV1('3 Motes 5 stones 5 Shards 6 leathers 255 fragments 7 Shards'));
// console.log(legendary_farmingV1('123 silver 6 shards 8 shards 5 motes 9 fangs 75 motes 103 MOTES 8 Shards 86 Motes 7 stones 19 silver'));























