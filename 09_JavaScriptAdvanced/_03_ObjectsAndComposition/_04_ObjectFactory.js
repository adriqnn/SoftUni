function object_factoryV1(library, orders){
    const result = [];

    for (const order of orders) {
        const object = {};
        const template = order.template;
        object['name'] = order.template.name;

        for (let part of order.parts) {
            object[part] = library[part];
        }

        result.push(object);
    }

    return result;
}

function object_factoryV2(lib, list){
    return list.map(order => {
        const object = Object.assign({}, order.template);

        for (let part of order.parts){
            object[part] = lib[part];
        }

        return object;
    });
}

function object_factoryV3(lib, list){
    const result = [];

    for(let order of list){
        const object = Object.assign({}, order.template);

        for (let part of order.parts){
            object[part] = lib[part];
        }

        result.push(object);
    }

    return result;
}

function object_factoryV4(lib, list){
    const result = [];

    for(let order of list){
        const object = {};
        const template = order.template;

        for(let prop in template){
            object[prop] = template[prop];
        }

        const parts = order.parts;
        for (let part of parts){
            object[part] = lib[part];
        }

        result.push(object);
    }

    return result;
}

function object_factoryV5(lib, list){

    return list.map(order => {
        const object = Object.assign({}, order.template);

        for (let part of order.parts){
            object[part] = lib[part];
        }

        return object;
    });
}

function object_factoryV6(lib,list){
    return list.map(order => Object.assign({}, order.template, Object.fromEntries(order.parts.map(p => [p, lib[p]]))));
}

function object_factoryV7(library, orders) {
    return orders.reduce((a, v) => {
        const temp = {};
        temp.name = v.template.name;

        v.parts.forEach(x => {
            temp[x] = library[x];
        });

        a.push(temp);

        return a;
    }, []);
}

function object_factoryV8(library, orders) {
    return orders.reduce((a, v) => {
        a.push({
            name: v.template.name,
            ...v.parts.reduce((a1, v1) => {
                a1[v1] = library[v1]
                return a1
            }, {}),
        });

        return a;
    }, []);
}


const library = {
    print: function () {
        console.log(`${this.name} is printing a page`);
    },
    scan: function () {
        console.log(`${this.name} is scanning a document`);
    },
    play: function (artist, track) {
        console.log(`${this.name} is playing '${track}' by ${artist}`);
    },
}

const orders = [
    {
        template: { name: 'ACME Printer'},
        parts: ['print']
    },
    {
        template: { name: 'Initech Scanner'},
        parts: ['scan']
    },
    {
        template: { name: 'ComTron Copier'},
        parts: ['scan', 'print']
    },
    {
        template: { name: 'BoomBox Stereo'},
        parts: ['play']
    }
];
