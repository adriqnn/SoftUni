function time_to_walkV1(steps, footprint, speed){
    let distanceMeters = steps * footprint;
    let distanceKilometers = distanceMeters / 1000;
    let rest = Math.floor(distanceMeters / 500);
    let timeInMin = (distanceKilometers / speed) * 60 + rest;

    let hr = Math.floor(timeInMin / 60);
    let min = Math.floor(timeInMin % 60);
    let sec = Math.round((timeInMin * 60) % 60);

    return (hr < 10 ? "0" : "") + hr + ":" + (min < 10 ? "0" : "") + (min) + ":" + (sec < 10 ? "0" : "") + sec;
}

function time_to_walkV2(steps, footprint, speed){
    let distanceMeters = steps * footprint;
    let speedMetersSec = speed / 3.6;
    let time = distanceMeters / speedMetersSec
    let rest = Math.floor(distanceMeters / 500);

    let timeMin = Math.floor(time / 60);
    let timeSec = Math.round(time - (timeMin * 60));
    let timeHr = Math.floor(time / 3600);

    return (timeHr < 10 ? "0" : "") + timeHr + ":" + (timeMin + rest < 10 ? "0" : "") + (timeMin + rest) + ":" + (timeSec < 10 ? "0" : "") + timeSec;
}
