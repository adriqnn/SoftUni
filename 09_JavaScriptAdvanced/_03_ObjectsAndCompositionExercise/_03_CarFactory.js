function car_factoryV1(obj){
    let engines = [{power: 90, volume: 1800}, {power: 120, volume: 2400}, {power: 200, volume: 3500}];
    let carriage = [{type: 'hatchback'}, {type: 'coupe'}];

    return {
        model: obj.model,
        engine: engines.filter(e => e.power >= obj.power)[0],
        carriage: Object.assign(carriage.filter(e => e.type === obj.carriage)[0], {color: obj.color}),
        wheels: new Array(4).fill(obj.wheelsize % 2 === 0 ? obj.wheelsize - 1 : obj.wheelsize)
    };
}

function car_factoryV2(obj){
    let engines = [{ power: 90, volume: 1800 }, { power: 120, volume: 2400 }, { power: 200, volume: 3500 }];
    let carriages = [{type: 'hatchback', color: obj.color}, {type: 'coupe', color: obj.color}];
    let wheelsize = obj.wheelsize % 2 == 1 ? obj.wheelsize : obj.wheelsize - 1;

    return{
        model: obj.model,
        engine: engines.filter(e => e.power >= obj.power)[0],
        carriage: carriages.filter(c => c.type === obj.carriage)[0],
        wheels: [wheelsize, wheelsize, wheelsize, wheelsize]
    }
}

function car_factoryV3({ model, power, color, carriage, wheelsize }) {
    const storageEngines = [{ power: 90, volume: 1800 }, { power: 120, volume: 2400 }, { power: 200, volume: 3500 }];
    const getWheels = s => {
        const arr = [];
        arr.length = 4;

        return s % 2 === 0 ? arr.fill(s - 1) : arr.fill(s);
    };

    return {
        model,
        engine: storageEngines.reduce((a, v) => Math.abs(a.power - power) < Math.abs(v.power - power) ? a : v),
        carriage: { type: carriage, color },
        wheels: getWheels(wheelsize),
    }
}

function car_factoryV4(obj){
    const engines = [{ power: 90, volume: 1800 }, { power: 120, volume: 2400 }, { power: 200, volume: 3500 }];

    return {
        model: obj.model,
        engine: engines.filter(e => e.power >= obj.power)[0],
        carriage: {type: obj.carriage, color: obj.color},
        wheels: new Array(4).fill(obj.wheelsize % 2 === 0 ? obj.wheelsize - 1 : obj.wheelsize)
    }
}
