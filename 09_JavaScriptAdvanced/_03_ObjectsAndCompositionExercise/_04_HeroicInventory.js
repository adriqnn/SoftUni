function heroic_inventoryV1(arr){
    return JSON.stringify(arr.map(x => x.split(" / ").filter(e => e.length > 0)).reduce((a, v) => {
        a.push({name: v[0], level: Number(v[1]), items: v[2] ? v[2].split(", ") : []});
        return a;
    }, []));
}

function heroic_inventoryV2(arr){
    return JSON.stringify(arr.map(x => x.split(" / ").filter(e => e.length > 0)).slice(0, arr.length - 1).reduce((a, v) => {
        a.push({name: v[0], level: Number(v[1]), items: v[2] ? v[2].split(", ") : []});
        return a;
    }, []));
}

function heroic_inventoryV3(arr){
    let result = [];

    arr.forEach(e => {
        let [name, level, items] = e.split(" / ");
        let entry = {name, level: Number(level), items: [...items.split(", ")]};

        result.push(entry);
    });

    return JSON.stringify(result);
}

function heroic_inventoryV4(arr){
    let result = [];

    arr.slice(0, arr.length - 1).forEach(e => {
        let [name, level, items] = e.split(" / ");
        let entry = {name, level: Number(level), items: [...items.split(", ")]};

        result.push(entry);
    });

    return JSON.stringify(result);
}
