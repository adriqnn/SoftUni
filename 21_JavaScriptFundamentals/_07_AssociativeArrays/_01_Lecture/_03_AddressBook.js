function address_bookV1(input){
    let book = {};

    input.map(e => {
        let [name, address] = e.split(":");
        book[name] = address;
    });

    return Object.entries(book).sort((a, b) => a[0].localeCompare(b[0])).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const address_bookV2 = function(input){
    let book = {};

    input.map(e => {
        let [name, address] = e.split(":");
        book[name] = address;
    });

    return Object.entries(book).sort((a, b) => a[0].localeCompare(b[0])).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const address_bookV3 = (input) => {
    let book = {};

    input.map(e => {
        let [name, address] = e.split(":");
        book[name] = address;
    });

    return Object.entries(book).sort((a, b) => a[0].localeCompare(b[0])).map(([k, v]) => `${k} -> ${v}`).join("\n");
}