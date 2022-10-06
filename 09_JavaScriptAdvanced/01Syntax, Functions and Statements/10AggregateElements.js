function aggregate(...array2){
    let array = array2;
    let sum = 0;
    let reverseSum = 0;
    let concat = '';

    array.forEach(e =>{
        sum += e;
        reverseSum += 1/e;
        concat += String(e);
    })

    /*
    for(let i = 0; i < array.length; i++){
        sum += +array[i];
        reverseSum += 1/+array[i];
        concat += array[i];
    }
    */

    console.log(sum);
    console.log(reverseSum);
    console.log(concat);
}

aggregate(1,2,3);
aggregate(2,4,8,16);