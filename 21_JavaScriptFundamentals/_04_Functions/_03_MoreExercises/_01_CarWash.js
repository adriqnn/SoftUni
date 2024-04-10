function car_washV1(array){
    let percent = 0;
    let operations = {
        soap: (x) => percent + 10,
        water: (x) => percent * 1.2,
        "vacuum cleaner": (x) => percent * 1.25,
        mud: (x) => percent * 0.9
    }

    for (let i = 0; i < array.length; i++) {
        let command = array[i];
        percent = operations[command](percent);
    }

    return `The car is ${percent.toFixed(2)}% clean.`;
}

const car_washV2 = function(array){
    let percent = 0;
    let operations = {
        soap: (x) => percent + 10,
        water: (x) => percent * 1.2,
        "vacuum cleaner": (x) => percent * 1.25,
        mud: (x) => percent * 0.9
    }

    for (let i = 0; i < array.length; i++) {
        let command = array[i];
        percent = operations[command](percent);
    }

    return `The car is ${percent.toFixed(2)}% clean.`;
}

const car_washV3 = (array) => {
    let percent = 0;
    let operations = {
        soap: (x) => percent + 10,
        water: (x) => percent * 1.2,
        "vacuum cleaner": (x) => percent * 1.25,
        mud: (x) => percent * 0.9
    }

    for (let i = 0; i < array.length; i++) {
        let command = array[i];
        percent = operations[command](percent);
    }

    return `The car is ${percent.toFixed(2)}% clean.`;
}

// console.log(car_washV1(['soap', 'soap', 'vacuum cleaner', 'mud', 'soap', 'water']));