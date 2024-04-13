function store_provisionsV1(current, incoming){
    let both = current.concat(incoming);
    let store = {};

    for (let i = 0; i < both.length; i += 2) {
        if(!store.hasOwnProperty(both[i])){
            store[both[i]] = 0;
        }

        store[both[i]] += Number(both[i + 1]);
    }

    return Object.entries(store).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

const store_provisionsV2 = function(current, incoming){
    let isNumber = n => !isNaN(Number(n));
    const result = current
        .concat(incoming)
        .map(x => (isNumber(x) ? Number(x) : x))
        .reduce((a, v, i, target) => {
            if (typeof v !== "number" && v !== undefined) a[v] = (a[v] || 0) + target[i + 1] || ''
            return a
        }, {});

    Object.entries(result).map(x => `${x[0]} -> ${x[1]}`).join("\n");
}

const store_provisionsV3 = (current, incoming) => {
    let both = current.concat(incoming);
    let store = {};

    for (let i = 0; i < both.length; i += 2) {
        if(!store.hasOwnProperty(both[i])){
            store[both[i]] = 0;
        }

        store[both[i]] += Number(both[i + 1]);
    }

    return Object.entries(store).map(([k, v]) => `${k} -> ${v}`).join("\n");
}

// console.log(store_provisionsV1(["Chips", "5", "CocaCola", "9", "Bananas", "14", "Pasta", "4", "Beer", "2"], ["Flour", "44", "Oil", "12", "Pasta", "7", "Tomatoes", "70", "Bananas", "30"]));