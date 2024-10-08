function air_pollutionV1(mapInfo, forces){
    let mapOfSofia = mapInfo.map(e => e.split(" ").map(Number));

    while (forces.length > 0){
        let currentArr = forces.shift();
        let currentForce = currentArr.split(" ")[0];
        let currentValue = Number(currentArr.split(" ")[1]);

        switch (currentForce) {
            case "breeze":
                mapOfSofia = breeze(mapOfSofia, currentValue);
                break;
            case "gale":
                mapOfSofia = gale(mapOfSofia, currentValue);
                break;
            case "smog":
                mapOfSofia = smog(mapOfSofia, currentValue);
                break;
            default:
                break;
        }
    }

    function breeze(arr, index){
        for (let col = 0; col < arr.length; col++) {
            let currentParticle = arr[index][col];
            if (currentParticle - 15 >= 0) {
                arr[index][col] -= 15;
            } else {
                arr[index][col] = 0;
            }
        }

        return arr;
    }

    function gale(arr, index){
        for (let row = 0; row < arr.length; row++) {
            let currentParticle = arr[row][index];
            if (currentParticle - 20 >= 0) {
                arr[row][index] -= 20;
            } else {
                arr[row][index] = 0;
            }
        }

        return arr;
    }

    function smog(arr, value){
        for (let row = 0; row < arr.length; row++) {
            for (let col = 0; col < arr.length; col++) {
                arr[row][col] += value;
            }
        }

        return arr;
    }

    let result = ``;

    mapOfSofia.forEach((line, rowIndex) => {
        line.forEach((number, colIndex) => {
            if(number >= 50){
                return result += `[${rowIndex}-${colIndex}], `;
            }
        });
    });

    return result.length > 0 ? result = `Polluted areas: ` + result.slice(0, -2) : `No polluted areas`;
}

const air_pollutionV2 = function(mapInfo, forces){
    let mapOfSofia = mapInfo.map(e => e.split(" ").map(Number));

    while (forces.length > 0){
        let currentArr = forces.shift();
        let currentForce = currentArr.split(" ")[0];
        let currentValue = Number(currentArr.split(" ")[1]);

        switch (currentForce) {
            case "breeze":
                mapOfSofia = breeze(mapOfSofia, currentValue);
                break;
            case "gale":
                mapOfSofia = gale(mapOfSofia, currentValue);
                break;
            case "smog":
                mapOfSofia = smog(mapOfSofia, currentValue);
                break;
            default:
                break;
        }
    }

    function breeze(arr, index){
        for (let col = 0; col < arr.length; col++) {
            let currentParticle = arr[index][col];
            if (currentParticle - 15 >= 0) {
                arr[index][col] -= 15;
            } else {
                arr[index][col] = 0;
            }
        }

        return arr;
    }

    function gale(arr, index){
        for (let row = 0; row < arr.length; row++) {
            let currentParticle = arr[row][index];
            if (currentParticle - 20 >= 0) {
                arr[row][index] -= 20;
            } else {
                arr[row][index] = 0;
            }
        }

        return arr;
    }

    function smog(arr, value){
        for (let row = 0; row < arr.length; row++) {
            for (let col = 0; col < arr.length; col++) {
                arr[row][col] += value;
            }
        }

        return arr;
    }

    let result = ``;

    mapOfSofia.forEach((line, rowIndex) => {
        line.forEach((number, colIndex) => {
            if(number >= 50){
                return result += `[${rowIndex}-${colIndex}], `;
            }
        });
    });

    return result.length > 0 ? result = `Polluted areas: ` + result.slice(0, -2) : `No polluted areas`;
}

const air_pollutionV3 = (mapInfo, forces) => {
        let mapOfSofia = mapInfo.map(e => e.split(" ").map(Number));

        while (forces.length > 0){
            let currentArr = forces.shift();
            let currentForce = currentArr.split(" ")[0];
            let currentValue = Number(currentArr.split(" ")[1]);

            switch (currentForce) {
                case "breeze":
                    mapOfSofia = breeze(mapOfSofia, currentValue);
                    break;
                case "gale":
                    mapOfSofia = gale(mapOfSofia, currentValue);
                    break;
                case "smog":
                    mapOfSofia = smog(mapOfSofia, currentValue);
                    break;
                default:
                    break;
            }
        }

        function breeze(arr, index){
            for (let col = 0; col < arr.length; col++) {
                let currentParticle = arr[index][col];
                if (currentParticle - 15 >= 0) {
                    arr[index][col] -= 15;
                } else {
                    arr[index][col] = 0;
                }
            }

            return arr;
        }

        function gale(arr, index){
            for (let row = 0; row < arr.length; row++) {
                let currentParticle = arr[row][index];
                if (currentParticle - 20 >= 0) {
                    arr[row][index] -= 20;
                } else {
                    arr[row][index] = 0;
                }
            }

            return arr;
        }

        function smog(arr, value){
            for (let row = 0; row < arr.length; row++) {
                for (let col = 0; col < arr.length; col++) {
                    arr[row][col] += value;
                }
            }

            return arr;
        }

        let result = ``;

        mapOfSofia.forEach((line, rowIndex) => {
            line.forEach((number, colIndex) => {
                if(number >= 50){
                    return result += `[${rowIndex}-${colIndex}], `;
                }
            });
        });

        return result.length > 0 ? result = `Polluted areas: ` + result.slice(0, -2) : `No polluted areas`;
}
;
// console.log(air_pollutionV1(['5 7 72 14 4', '41 35 37 27 33', '23 16 27 42 12', '2 20 28 39 14', '16 34 31 10 24'], ['breeze 1', 'gale 2', 'smog 25']));