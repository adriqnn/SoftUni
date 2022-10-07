function walk(steps,footprint,speed){
    let distanceMeters = steps*footprint;
    let distanceKilometers = distanceMeters/1000;
    let rest = Math.floor(distanceMeters/500);
    let timeInMin = (distanceKilometers/speed)*60 + rest;

    let hr = Math.floor(timeInMin/60);
    let min = Math.floor(timeInMin%60);
    let sec = Math.round((timeInMin*60)%60);
    console.log((hr < 10 ? "0" : "") + hr + ":" + (min < 10 ? "0" : "") + (min) + ":" + (sec < 10 ? "0" : "") + sec);
}