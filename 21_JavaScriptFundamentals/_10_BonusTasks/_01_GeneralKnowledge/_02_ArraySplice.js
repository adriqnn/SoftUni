// 1. Splice with one parameter(start): Removes elements from the start index to the end of the array;
function array_spliceV1(array){
    let result = array.splice(1);
    return `${array} --- ${result}`;
}

// array[ 1 ] - result[ 2, 3, 4, 5 ];
console.log(array_spliceV1([1, 2, 3, 4, 5]));

// 2. Splice with one parameter(start)(negative): Removes elements;
function array_spliceV2(array){
    let result = array.splice(-1);
    return `${array} --- ${result}`;
}

// array[ 1, 2, 3, 4 ] - result[ 5 ];
console.log(array_spliceV2([1, 2, 3, 4, 5]));

// 3. Splice with two parameters(start, delete count): Removes delete count elements starting from start index;
function array_spliceV3(array){
    let result = array.splice(1, 2);
    return `${array} --- ${result}`;
}

// array[ 1, 4, 5] - result[ 2, 3 ];
console.log(array_spliceV3([1, 2, 3, 4, 5]));

// 4. Splice with two parameters(start, delete count): Removes delete count elements starting from start index;
function array_spliceV4(array){
    let result = array.splice(0, array.length - 1);
    return `${array} --- ${result}`;
}

// array[ 5 ] - result[ 1, 2, 3, 4 ];
console.log(array_spliceV4([1, 2, 3, 4, 5]));

// 5. Splice with three parameters(start, delete count, elements)(can be used with spread): Removes delete count elements starting from start and replaces them with other elements listed;
function array_spliceV5(array){
    let result = array.splice(1, 2, 'a', 'b');
    return `${array} --- ${result}`;
}

// array[ 1, a, b, 4, 5 ] - result[];
console.log(array_spliceV5([1, 2, 3, 4, 5]));

// 6. Splice with 0 delete count: Inserts elements without removing any;
function array_spliceV6(array){
    let result = array.splice(1, 0, 'a', 'b');
    return `${array} --- ${result}`;
}

// array[ 1, a, b, 2, 3, 4, 5 ] - result[ 2, 3 ];
console.log(array_spliceV6([1, 2, 3, 4, 5]));

// 7. Splice with negative indices: Allows counting from the end of the array;
function array_spliceV7(array){
    let result = array.splice(-2, 1);
    return `${array} --- ${result}`;
}

// array[ 1, 2, 3, 5 ] - result[ 4 ];
console.log(array_spliceV7([1, 2, 3, 4, 5]));

// 8. Splice with index out of range: Modifies the array directly but doesn't remove anything'
function array_spliceV8(array){
    let result = array.splice(10);
    return `${array} --- ${result}`;
}

// array[ 1, 2, 3, 4, 5 ] - result[]
console.log(array_spliceV8([1, 2, 3, 4, 5]));
































