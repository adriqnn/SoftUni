function solve(nums){
    const resust = [];
    
    for(let num of nums){
        if (num < 0){
            resust.unshift(num);
        }else{
            resust.push(num);
        }
    }
    console.log(resust.join('\n'));
}