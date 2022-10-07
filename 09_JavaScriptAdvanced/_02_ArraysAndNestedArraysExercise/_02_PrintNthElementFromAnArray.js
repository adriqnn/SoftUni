function solve(arr,number){
    return arr.filter((x,i) => i % number == 0)
}