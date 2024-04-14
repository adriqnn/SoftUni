function flight_scheduleV1(array){
    let currentFlights = array.shift();
    let newFlightStatuses = array.shift();
    let randomStatus = array.shift()[0];

    let flightsDB = {};

    currentFlights.forEach(e => {
        let [nr, ...d] = e.split(" ");
        let destination = d.join(" ");
        let status = "Ready to fly";

        flightsDB[nr] = { destination, status};
    });

    newFlightStatuses.forEach(e => {
        let [nr, status] = e.split(" ");

        if(flightsDB.hasOwnProperty(nr)){
            flightsDB[nr].status = status;
        }
    });

    let result = '';

    for (const flightsDBKey in flightsDB) {
        if(flightsDB[flightsDBKey].status === randomStatus){
            result += `{ Destination: '${flightsDB[flightsDBKey].destination}', Status: '${flightsDB[flightsDBKey].status}' }\n`;
        }

    }

    return result;
}

const flight_scheduleV2 = function(array){
    let currentFlights = array.shift();
    let newFlightStatuses = array.shift();
    let randomStatus = array.shift()[0];

    let flightsDB = {};

    currentFlights.forEach(e => {
        let [nr, ...d] = e.split(" ");
        let destination = d.join(" ");
        let status = "Ready to fly";

        flightsDB[nr] = { destination, status};
    });

    newFlightStatuses.forEach(e => {
        let [nr, status] = e.split(" ");

        if(flightsDB.hasOwnProperty(nr)){
            flightsDB[nr].status = status;
        }
    });

    let result = '';

    for (const flightsDBKey in flightsDB) {
        if(flightsDB[flightsDBKey].status === randomStatus){
            result += `{ Destination: '${flightsDB[flightsDBKey].destination}', Status: '${flightsDB[flightsDBKey].status}' }\n`;
        }

    }

    return result;
}

const flight_scheduleV3 = (array) => {
    let currentFlights = array.shift();
    let newFlightStatuses = array.shift();
    let randomStatus = array.shift()[0];

    let flightsDB = {};

    currentFlights.forEach(e => {
        let [nr, ...d] = e.split(" ");
        let destination = d.join(" ");
        let status = "Ready to fly";

        flightsDB[nr] = { destination, status};
    });

    newFlightStatuses.forEach(e => {
        let [nr, status] = e.split(" ");

        if(flightsDB.hasOwnProperty(nr)){
            flightsDB[nr].status = status;
        }
    });

    let result = '';

    for (const flightsDBKey in flightsDB) {
        if(flightsDB[flightsDBKey].status === randomStatus){
            result += `{ Destination: '${flightsDB[flightsDBKey].destination}', Status: '${flightsDB[flightsDBKey].status}' }\n`;
        }

    }

    return result;
}

// console.log(flight_scheduleV1([['WN269 Delaware', 'FL2269 Oregon', 'WN498 Las Vegas', 'WN3145 Ohio', 'WN612 Alabama', 'WN4010 New York', 'WN1173 California', 'DL2120 Texas', 'KL5744 Illinois', 'WN678 Pennsylvania'], ['DL2120 Cancelled', 'WN612 Cancelled', 'WN1173 Cancelled', 'SK330 Cancelled'], ['Ready to fly']]));
// console.log(flight_scheduleV1([["WN269 Delaware","FL2269 Oregon","WN498 Las Vegas","WN3145 Ohio","WN612 Alabama","WN4010 New York","WN1173 California","DL2120 Texas","KL5744 Illinois","WN678 Pennsylvania"],["DL2120 Cancelled","WN612 Cancelled","WN1173 Cancelled","SK430 Cancelled"],["Cancelled"]]));