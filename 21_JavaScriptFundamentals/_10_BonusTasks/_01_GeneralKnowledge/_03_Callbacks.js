// Simple example of callback(higher order function);
let arrNew = [1, 2, 3, 4, 5];

function print(callback, array){
    callback(array);
    console.log(array);
}

function add(array){
   array.forEach((e,i) => array[i] = e * 10);
}

print(add, arrNew);