function circleArea(radius){
    if(typeof radius == 'number'){
        let area = radius ** 2 * Math.PI;
        console.log(Math.round(area*100)/100);
    }else{
        console.log(`We can not calculate the circle area, because we receive a ${typeof radius}`);
    }
}

circleArea(5);
circleArea('a');