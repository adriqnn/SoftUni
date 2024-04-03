function centuries_to_minutesV1(century){
    let years = century * 100;
    let days = Math.trunc(years * 365.2422);
    let hours = days * 24;
    let minutes = hours * 60;

    return `${century} centuries = ${years} years = ${days} days = ${hours} hours = ${minutes} minutes`;
}

const centuries_to_minutesV2 = function(century) {
    let years = century * 100;
    let days = Math.trunc(years * 365.2422);
    let hours = days * 24;
    let minutes = hours * 60;

    return `${century} centuries = ${years} years = ${days} days = ${hours} hours = ${minutes} minutes`;
}

const centuries_to_minutesV3 = (century) => {
    let years = century * 100;
    let days = Math.trunc(years * 365.2422);
    let hours = days * 24;
    let minutes = hours * 60;

    return `${century} centuries = ${years} years = ${days} days = ${hours} hours = ${minutes} minutes`;
}