function leap_yearV1(year){
    return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0 ? "yes" : "no";
}

const leap_yearV2 = function(year){
    return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0 ? "yes" : "no";
}

const leap_yearV3 = (year) => {
    return (year % 4 === 0 && year % 100 !== 0) || year % 400 === 0 ? "yes" : "no";
}