function add_and_removeV1(array){
    let arr = [];
    let number = 1;

    array.forEach(e => e === 'add' ? arr.push(number++) : (arr.pop(), number++));
    return arr.length > 0 ? arr.join(" ") : "Empty";
}

const add_and_removeV2 = function(array){
    let arr = [];
    let number = 1;

    array.forEach(e => e === 'add' ? arr.push(number++) : (arr.pop(), number++));
    return arr.length > 0 ? arr.join(" ") : "Empty";
}

const add_and_removeV3 = (array) => {
    let arr = [];
    let number = 1;

    array.forEach(e => e === 'add' ? arr.push(number++) : (arr.pop(), number++));
    return arr.length > 0 ? arr.join(" ") : "Empty";
}

// console.log(add_and_removeV1(['add', 'add', 'add', 'add']));
// console.log(add_and_removeV1(['add', 'add', 'remove', 'add', 'add']));
// console.log(add_and_removeV1(['remove', 'remove', 'remove']));