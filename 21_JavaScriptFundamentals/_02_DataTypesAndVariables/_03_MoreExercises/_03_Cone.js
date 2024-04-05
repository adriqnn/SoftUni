function coneV1(r, h){
    let volume = (Math.PI * r * r * (h / 3)).toFixed(4);
    let area = (Math.PI * r * (r + Math.sqrt((h * h) + (r * r)))).toFixed(4);

    return `volume = ${volume}\narea = ${area}`;
}

const coneV2 = function(r, h){
    let volume = (Math.PI * r * r * (h / 3)).toFixed(4);
    let area = (Math.PI * r * (r + Math.sqrt((h * h) + (r * r)))).toFixed(4);

    return `volume = ${volume}\narea = ${area}`;
}

const coneV3 = (r, h) => {
    let volume = (Math.PI * r * r * (h / 3)).toFixed(4);
    let area = (Math.PI * r * (r + Math.sqrt((h * h) + (r * r)))).toFixed(4);

    return `volume = ${volume}\narea = ${area}`;
}