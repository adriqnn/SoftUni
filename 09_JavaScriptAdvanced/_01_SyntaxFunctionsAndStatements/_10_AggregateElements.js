function aggregate(params){
    let sum1 = 0;
    let sum2 = 0;
    let sum3 = '';
    for(let i=0; i < params.length;i++){
        sum1 += Number(params[i]);
        sum2 += 1/Number(params[i]);
        sum3 += params[i];
    }
    console.log(sum1);
    console.log(sum2);
    console.log(sum3);
}