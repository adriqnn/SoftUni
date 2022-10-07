function roadRadar(speed, area){
    let result = ''
    let speedLimit = 0;
    let difference = 0;
    let status = '';

    if(area == 'motorway'){
        speedLimit = 130;
        difference = speed - 130;
    }else if(area == 'interstate'){
        speedLimit = 90;
        difference = speed - 90;
    }else if(area == 'city'){
        speedLimit = 50;
        difference = speed - 50;
    }else if(area == 'residential'){
        speedLimit = 20;
        difference = speed - 20;
    }

    if(difference <= 0 && speed >= 0 ){
        result = `Driving ${speed} km/h in a ${speedLimit} zone`;
    }else if(speed > 0){
        if(difference >= 41){
            status = 'reckless driving';
        }else if(difference >20){
            status = 'excessive speeding';
        }else if(difference > 0){
            status = 'speeding';
        }
        result = `The speed is ${difference} km/h faster than the allowed speed of ${speedLimit} - ${status}`
    }
    console.log(result);
}