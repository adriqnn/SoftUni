function radio_crystalsV1(array){
    let target = array.shift();
    let result = "";

    let operations = {
        cut: x => x / 4,
        lap: x => x * 0.8,
        grind: x => x - 20,
        etch: x => x - 2,
        xRay: x => x + 1
    }

    for (let i = 0; i < array.length; i++) {
        let crystal = {
            currentCrystal: array[i],
            cutCounter: 0,
            lapCounter: 0,
            grindCounter: 0,
            etchCounter: 0,
        }

        result += `Processing chunk ${crystal.currentCrystal} microns\n`;
        let transport = "Transporting and washing";

        while(crystal.currentCrystal / 4 >= target){
            crystal.currentCrystal = operations.cut(crystal.currentCrystal);
            crystal.cutCounter++;
        }

        if(crystal.cutCounter > 0){
            result += `Cut x${crystal.cutCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal * 0.8 >= target){
            crystal.currentCrystal = operations.lap(crystal.currentCrystal);
            crystal.lapCounter++;
        }

        if(crystal.lapCounter > 0){
            result += `Lap x${crystal.lapCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal - 20 >= target){
            crystal.currentCrystal = operations.grind(crystal.currentCrystal);
            crystal.grindCounter++;
        }

        if(crystal.grindCounter > 0){
            result += `Grind x${crystal.grindCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal - 2 >= target - 1){
            crystal.currentCrystal = operations.etch(crystal.currentCrystal);
            crystal.etchCounter++;
        }

        if(crystal.etchCounter > 0){
            result += `Etch x${crystal.etchCounter}\n${transport}\n`;
        }

        if(crystal.currentCrystal < target){
            crystal.currentCrystal = operations.xRay(crystal.currentCrystal);
            result += `X-ray x1\n`;
        }

        result += `Finished crystal ${crystal.currentCrystal} microns\n`;
    }

    return result;
}

const radio_crystalsV2 = function(array){
    let target = array.shift();
    let result = "";

    let operations = {
        cut: x => x / 4,
        lap: x => x * 0.8,
        grind: x => x - 20,
        etch: x => x - 2,
        xRay: x => x + 1
    }

    for (let i = 0; i < array.length; i++) {
        let crystal = {
            currentCrystal: array[i],
            cutCounter: 0,
            lapCounter: 0,
            grindCounter: 0,
            etchCounter: 0,
        }

        result += `Processing chunk ${crystal.currentCrystal} microns\n`;
        let transport = "Transporting and washing";

        while(crystal.currentCrystal / 4 >= target){
            crystal.currentCrystal = operations.cut(crystal.currentCrystal);
            crystal.cutCounter++;
        }

        if(crystal.cutCounter > 0){
            result += `Cut x${crystal.cutCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal * 0.8 >= target){
            crystal.currentCrystal = operations.lap(crystal.currentCrystal);
            crystal.lapCounter++;
        }

        if(crystal.lapCounter > 0){
            result += `Lap x${crystal.lapCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal - 20 >= target){
            crystal.currentCrystal = operations.grind(crystal.currentCrystal);
            crystal.grindCounter++;
        }

        if(crystal.grindCounter > 0){
            result += `Grind x${crystal.grindCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal - 2 >= target - 1){
            crystal.currentCrystal = operations.etch(crystal.currentCrystal);
            crystal.etchCounter++;
        }

        if(crystal.etchCounter > 0){
            result += `Etch x${crystal.etchCounter}\n${transport}\n`;
        }

        if(crystal.currentCrystal < target){
            crystal.currentCrystal = operations.xRay(crystal.currentCrystal);
            result += `X-ray x1\n`;
        }

        result += `Finished crystal ${crystal.currentCrystal} microns\n`;
    }

    return result;
}

const radio_crystalsV3 = (array) => {
    let target = array.shift();
    let result = "";

    let operations = {
        cut: x => x / 4,
        lap: x => x * 0.8,
        grind: x => x - 20,
        etch: x => x - 2,
        xRay: x => x + 1
    }

    for (let i = 0; i < array.length; i++) {
        let crystal = {
            currentCrystal: array[i],
            cutCounter: 0,
            lapCounter: 0,
            grindCounter: 0,
            etchCounter: 0,
        }

        result += `Processing chunk ${crystal.currentCrystal} microns\n`;
        let transport = "Transporting and washing";

        while(crystal.currentCrystal / 4 >= target){
            crystal.currentCrystal = operations.cut(crystal.currentCrystal);
            crystal.cutCounter++;
        }

        if(crystal.cutCounter > 0){
            result += `Cut x${crystal.cutCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal * 0.8 >= target){
            crystal.currentCrystal = operations.lap(crystal.currentCrystal);
            crystal.lapCounter++;
        }

        if(crystal.lapCounter > 0){
            result += `Lap x${crystal.lapCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal - 20 >= target){
            crystal.currentCrystal = operations.grind(crystal.currentCrystal);
            crystal.grindCounter++;
        }

        if(crystal.grindCounter > 0){
            result += `Grind x${crystal.grindCounter}\n${transport}\n`;
            crystal.currentCrystal = Math.floor(crystal.currentCrystal);
        }

        while(crystal.currentCrystal - 2 >= target - 1){
            crystal.currentCrystal = operations.etch(crystal.currentCrystal);
            crystal.etchCounter++;
        }

        if(crystal.etchCounter > 0){
            result += `Etch x${crystal.etchCounter}\n${transport}\n`;
        }

        if(crystal.currentCrystal < target){
            crystal.currentCrystal = operations.xRay(crystal.currentCrystal);
            result += `X-ray x1\n`;
        }

        result += `Finished crystal ${crystal.currentCrystal} microns\n`;
    }

    return result;
}

// console.log(radio_crystalsV1([1375, 50000]));