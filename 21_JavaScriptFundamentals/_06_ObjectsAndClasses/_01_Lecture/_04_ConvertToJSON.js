function convert_to_JSONV1(name, lastName, hairColor){
    let o = {name, lastName, hairColor};
    return JSON.stringify(o);
}

const convert_to_JSONV2 = function(name, lastName, hairColor){
    let o = {name, lastName, hairColor};
    return JSON.stringify(o);
}

const convert_to_JSONV3 = (name, lastName, hairColor) => {
    let o = {name, lastName, hairColor};
    return JSON.stringify(o);
}