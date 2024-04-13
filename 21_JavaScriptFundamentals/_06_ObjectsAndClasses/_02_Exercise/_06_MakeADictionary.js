function make_a_dictionaryV1(input){
    let dictionary = {};

    input.map(e => JSON.parse(e)).forEach(e => {
        Object.entries(e).forEach(([k,v]) => dictionary[k] = v);
    });

    return Object.entries(dictionary).sort((a, b) => a[0].localeCompare(b[0])).map(([k, v]) => `Term: ${k} => Definition: ${v}`).join("\n");
}

const make_a_dictionaryV2 = function(input){
    return input.map(e => {
        const parsed = JSON.parse(e);

        const key = Object.keys(parsed)[0];
        const value = Object.values(parsed)[0];

        const o = {};
        o[key] = value;

        return o;
    }).sort((a, b) => Object.keys(a)[0].localeCompare(Object.keys(b)[0])).map(e => `Term: ${Object.keys(e)[0]} => Definition: ${Object.values(e)[0]}`).join("\n");
}

const make_a_dictionaryV3 = (input) => {
    return input.map(e => JSON.parse(e)).sort((a, b) => Object.keys(a)[0].localeCompare(Object.keys(b)[0])).map(e => `Term: ${Object.keys(e)[0]} => Definition: ${Object.values(e)[0]}`).join("\n");
}

// console.log(make_a_dictionaryV2(['{"Coffee":"A hot drink made from the roasted and ground seeds (coffee beans) of a tropical shrub."}', '{"Bus":"A large motor vehicle carrying passengers by road, typically one serving the public on a fixed route and for a fare."}', '{"Boiler":"A fuel-burning apparatus or container for heating water."}', '{"Tape":"A narrow strip of material, typically used to hold or fasten something."}', '{"Microphone":"An instrument for converting sound waves into electrical energy variations which may then be amplified, transmitted, or recorded."}']));