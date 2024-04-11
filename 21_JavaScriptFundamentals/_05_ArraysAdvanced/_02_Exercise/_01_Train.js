function trainV1(array){
    let wagons = array.shift().split(" ").map(e => Number(e));
    let maxCapacity = Number(array.shift());

    function addPassengers(n) {
        for (let i = 0; i < wagons.length; i++) {
            if (wagons[i] + n <= maxCapacity) {
                wagons[i] += n;
                break;
            }
        }
    }

    function add(value) {
        wagons.push(value);
    }

    array.forEach(x => {
        const [command, value] = x.split(" ");
        value ? add(Number(value)) : addPassengers(Number(command));
    })

    return wagons.join(" ");
}

const trainV2 = function(array){
    let wagons = array.shift().split(" ").map(e => Number(e));
    let maxCapacity = Number(array.shift());

    function addPassengers(n) {
        for (let i = 0; i < wagons.length; i++) {
            if (wagons[i] + n <= maxCapacity) {
                wagons[i] += n;
                break;
            }
        }
    }

    function add(value) {
        wagons.push(value);
    }

    array.forEach(x => {
        const [command, value] = x.split(" ");
        value ? add(Number(value)) : addPassengers(Number(command));
    })

    return wagons.join(" ");
}

const trainV3 = (array) => {
    let wagons = array.shift().split(" ").map(e => Number(e));
    let maxCapacity = Number(array.shift());

    function addPassengers(n) {
        for (let i = 0; i < wagons.length; i++) {
            if (wagons[i] + n <= maxCapacity) {
                wagons[i] += n;
                break;
            }
        }
    }

    function add(value) {
        wagons.push(value);
    }

    array.forEach(x => {
        const [command, value] = x.split(" ");
        value ? add(Number(value)) : addPassengers(Number(command));
    })

    return wagons.join(" ");
}


// console.log(trainV1(['32 54 21 12 4 0 23', '75', 'Add 10', 'Add 0', '30', '10', '75']));
