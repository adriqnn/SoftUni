// Function that uses the element, index and array properties passed within operation;
function exponentiation(elements, index, array){
    return (elements ** index);
}

let arr = [1, 2, 3, 4, 5];
console.log(arr.map(exponentiation).join(" "));
