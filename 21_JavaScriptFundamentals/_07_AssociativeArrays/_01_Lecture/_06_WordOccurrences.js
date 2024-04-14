function word_occurrencesV1(input){
    let dictionary = {};

    input.forEach(e => {
        if(!dictionary.hasOwnProperty(e)){
            dictionary[e] = 0;
        }

        dictionary[e] = dictionary[e] + 1;
    });

    return Object.entries(dictionary).sort((a, b) => b[1] - a[1]).map(e => `${e[0]} -> ${e[1]} times`).join("\n");
}

const word_occurrencesV2 = function(input){
    let dictionary = {};

    input.forEach(e => {
        if(!dictionary.hasOwnProperty(e)){
            dictionary[e] = 0;
        }

        dictionary[e] = dictionary[e] + 1;
    });

    return Object.entries(dictionary).sort((a, b) => b[1] - a[1]).map(e => `${e[0]} -> ${e[1]} times`).join("\n");
}

const word_occurrencesV3 = (input) => {
    let dictionary = {};

    input.forEach(e => {
        if(!dictionary.hasOwnProperty(e)){
            dictionary[e] = 0;
        }

        dictionary[e] = dictionary[e] + 1;
    });

    return Object.entries(dictionary).sort((a, b) => b[1] - a[1]).map(e => `${e[0]} -> ${e[1]} times`).join("\n");
}

// console.log(word_occurrencesV1(["Here", "is", "the", "first", "sentence", "Here", "is", "another", "sentence", "And", "finally", "the", "third", "sentence"]));