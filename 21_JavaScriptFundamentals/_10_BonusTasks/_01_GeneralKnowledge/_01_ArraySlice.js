// 1. Slice with no parameters: Returns a copy of the original array;
function array_sliceV1(array){
    return array.slice();
}

// [ 1, 2, 3, 4, 5 ];
console.log(array_sliceV1([1, 2, 3, 4, 5]));

// 2. Slice with two parameters(start, end): Returns elements from the start index to the end index(exclusive);
function array_sliceV2(array){
    return array.slice(0, 3);
}

// [ 1, 2, 3 ];
console.log(array_sliceV2([1, 2, 3, 4, 5]));

// 3. Slice with two parameters(start, end): Returns elements from the start index to the end index(exclusive);
function array_sliceV3(array){
    return array.slice(3, array.length);
}

// [ 4, 5 ];
console.log(array_sliceV3([1, 2, 3, 4, 5]));

// 4. Slice with one parameter(start): Returns elements from the start index to the end of the array;
function array_sliceV4(array){
    return array.slice(3);
}

// [ 4, 5 ];
console.log(array_sliceV4([1, 2, 3, 4, 5]));

// 5. Slice with one parameter(start) with negative index: Returns elements from the index from the end of the array to the start of the array;
function array_sliceV5(array){
    return array.slice(-1);
}

// [ 5 ];
console.log(array_sliceV5([1, 2, 3, 4, 5]));

// 6. Slice with negative indices: Allows counting from the end of the array;
function array_sliceV6(array){
    return array.slice(-1);
}

// [ 5 ];
console.log(array_sliceV6([1, 2, 3, 4, 5]));

// 7. Slice with positive and negative indices: Returns array from start(index) to end(index);
function array_sliceV7(array){
    return array.slice(1, -1);
}

// [ 2, 3, 4 ];
console.log(array_sliceV7([1, 2, 3, 4, 5]));



















