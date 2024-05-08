function circle_areaV1(input){
    return typeof input === 'number' ? Math.round((input ** 2 * Math.PI) * 100 ) / 100 : `We can not calculate the circle area, because we receive a ${typeof input}.`;
}

function circle_areaV2(radius){
    if(typeof radius == 'number'){
        let area = radius ** 2 * Math.PI;
        return Math.round(area * 100) / 100;
    }else{
        return `We can not calculate the circle area, because we receive a ${typeof radius}.`;
    }
}
