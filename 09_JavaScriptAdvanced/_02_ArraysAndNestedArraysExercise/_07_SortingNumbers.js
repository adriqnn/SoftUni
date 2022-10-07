function solve(arr){
    let result1 = [];
    let result2 = [];
    let newArr = [];

    result1 = arr.sort((a,b) => a-b).slice();
    result2 = arr.reverse().slice();

    for(let i = 0; i < arr.length; i++){
        if(i%2 == 0){
            newArr.push(result1.shift());
        }else{
            newArr.push(result2.shift());
        }
    }

    return newArr;
}