function serialize_stringV1(input){
    let serialize = {};
    let string = input[0];

    for (let i = 0; i < string.length; i++) {
        if(!serialize.hasOwnProperty(string.charAt(i))){
            serialize[string.charAt(i)] = [];
        }

        serialize[string.charAt(i)].push(i);
    }

    return Object.entries(serialize).map(e => `${e[0]}:${e[1].join("/")}`).join("\n");
}

const serialize_stringV2 = function(input){
    let serialize = {};
    let string = input[0];

    for (let i = 0; i < string.length; i++) {
        if(!serialize.hasOwnProperty(string.charAt(i))){
            serialize[string.charAt(i)] = [];
        }

        serialize[string.charAt(i)].push(i);
    }

    return Object.entries(serialize).map(e => `${e[0]}:${e[1].join("/")}`).join("\n");
}

const serialize_stringV3 = (input) => {
    let serialize = {};
    let string = input[0];

    for (let i = 0; i < string.length; i++) {
        if(!serialize.hasOwnProperty(string.charAt(i))){
            serialize[string.charAt(i)] = [];
        }

        serialize[string.charAt(i)].push(i);
    }

    return Object.entries(serialize).map(e => `${e[0]}:${e[1].join("/")}`).join("\n");
}