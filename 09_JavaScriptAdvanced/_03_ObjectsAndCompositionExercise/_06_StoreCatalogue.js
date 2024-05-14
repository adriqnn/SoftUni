function store_catalogueV1(arr){
    let catalogue = {};

    arr.forEach(e => {
       let [item, price] = e.split(" : ");
       let letter = item[0].toUpperCase();

       if(!catalogue.hasOwnProperty(item[0])){
           catalogue[letter] = [];
       }

       catalogue[letter].push(`${item}: ${price}`);
    });

    return Object.entries(catalogue).sort((a, b) => a[0].localeCompare(b[0])).map(e => {
        return `${e[0]}\n${e[1].sort((a, b) => a.localeCompare(b)).map(e => ` ${e}`).join("\n")}`;
    }).join("\n");
}

function store_catalogueV2(arr){
    let obj = {};

    for (const line of arr) {
        let [product, price] = line.split(' : ');
        let letter = product[0];

        if(!obj.hasOwnProperty(letter)){
            obj[letter] = {};
        }

        obj[letter][product] = price;
    }

    let sortedLetters = Object.keys(obj).sort((a,b) => a.localeCompare(b));


    let result = "";
    for (const letter of sortedLetters) {
        result += `${letter}\n`;
        let sortedProducts = Object.keys(obj[letter]).sort((a,b) => a.localeCompare(b));

        for (const product of sortedProducts) {
            result += ` ${product}: ${obj[letter][product]}\n`;
        }
    }

    return result;
}

function store_catalogueV3(arr){
    const result = arr.sort().reduce((a, v) => {
        a[v[0]] = a[v[0]] || [];
        a[v[0]].push(v);

        return a;
    }, {});

    let out = "";
    Object.entries(result).forEach(([letter, items]) => out += `${letter}\n ${items.map(y => y.split(" : ").join(": ")).join("\n  ")}\n`);

    return out;
}
