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

function time_to_walkV3(steps, footprint, speed) {
    const distanceKilometers = steps * footprint / 1000;
    const rest = Math.floor(steps * footprint / 500);
    const totalTimeMinutes = distanceKilometers / speed * 60 + rest;

    const hr = Math.floor(totalTimeMinutes / 60);
    const min = Math.floor(totalTimeMinutes % 60);
    const sec = Math.round((totalTimeMinutes - Math.floor(totalTimeMinutes)) * 60);

    return `${hr.toString().padStart(2, '0')}:${min.toString().padStart(2, '0')}:${sec.toString().padStart(2, '0')}`;
}
