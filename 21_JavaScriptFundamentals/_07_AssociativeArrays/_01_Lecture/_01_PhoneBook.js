function phone_bookV1(input){
    let phonebook = {};
    input.forEach(e => { let [name, phone] = e.split(" "); phonebook[name] = phone; });

    return Object.entries(phonebook).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const phone_bookV2 = function(input){
    let phonebook = {};
    input.forEach(e => { let [name, phone] = e.split(" "); phonebook[name] = phone; });

    return Object.entries(phonebook).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const phone_bookV3 = (input) => {
    let phonebook = {};
    input.forEach(e => { let [name, phone] = e.split(" "); phonebook[name] = phone; });

    return Object.entries(phonebook).map(([k, v]) => `${k} -> ${v}`).join("\n");
}