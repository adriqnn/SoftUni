function road_radarV1(speed, area){
    let result;
    let speedLimit = 0;
    let difference = 0;
    let status = '';

    if(area === 'motorway'){
        speedLimit = 130;
        difference = speed - 130;
    }else if(area === 'interstate'){
        speedLimit = 90;
        difference = speed - 90;
    }else if(area === 'city'){
        speedLimit = 50;
        difference = speed - 50;
    }else if(area === 'residential'){
        speedLimit = 20;
        difference = speed - 20;
    }

    if(difference <= 0){
        result = `Driving ${speed} km/h in a ${speedLimit} zone`;
    }else {
        if(difference > 40){
            status = 'reckless driving';
        }else if(difference > 20){
            status = 'excessive speeding';
        }else if(difference > 0){
            status = 'speeding';
        }

        result = `The speed is ${difference} km/h faster than the allowed speed of ${speedLimit} - ${status}`;
    }

    return result;
}

function road_radarV2(speed, area){
    const limits = {
        motorway: 130,
        interstate: 90,
        city: 50,
        residential: 20
    }

    const getStatus = n => {
        const status = {
            [n > 40]: "reckless driving",
            [n > 20 && n <= 40]: "excessive speeding",
            [n <= 20]: "speeding"
        }

        return status["true"];
    }

    const speedDiff = speed - limits[area];

    return speedDiff > 0
        ? `The speed is ${speedDiff} km/h faster than the allowed speed of ${limits[area]} - ${getStatus(speedDiff)}`
        : `Driving ${speed} km/h in a ${limits[area]} zone`;
}
