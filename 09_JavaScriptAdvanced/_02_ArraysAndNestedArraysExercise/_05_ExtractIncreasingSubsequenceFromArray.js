function solve(arr){
    let result = [];
    let biggest = arr[0];

    for(let i = 0; i< arr.length; i++){
        let currentNum = arr[i];
        if(currentNum >= biggest){
            result.push(currentNum);
            biggest = currentNum;
        }
    }
    return result;
}