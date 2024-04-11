function array_manipulatorV1(array1, array2){
    let result = ``;
    const operations = {
        add: (array) => array1.splice(Number(array[0]), 0, Number(array[1])),
        addMany: (array) => array1.splice(Number(array.shift()), 0, ...array.map(e => Number(e))),
        contains: (element) => result += `${array1.indexOf(Number(element))}\n`,
        remove: (index) => array1.splice(Number(index), 1),
        shift: (positions) => {
            for (let j = 0; j < positions; j++) {
                let element = array1.shift()
                array1.push(element)
            }
        },
        sumPairs: () => {
            let arr = [];
            for (let i = 0; i < array1.length; i += 2) {
                arr.push(array1[i] + (array1[i + 1] !== undefined ? array1[i + 1] : 0));
            }

            array1 = arr;
        },
        print: () => result += `[ ${array1.join(", ")} ]`
    }

    for (let i = 0; i < array2.length; i++) {
        let [operation, ...args] = array2[i].split(" ");
        operations[operation](args);

    }

    return result;
}

const array_manipulatorV2 = function(array1, array2){
    let result = ``;
    const operations = {
        add: (array) => array1.splice(Number(array[0]), 0, Number(array[1])),
        addMany: (array) => array1.splice(Number(array.shift()), 0, ...array.map(e => Number(e))),
        contains: (element) => result += `${array1.indexOf(Number(element))}\n`,
        remove: (index) => array1.splice(Number(index), 1),
        shift: (positions) => {
            for (let j = 0; j < positions; j++) {
                let element = array1.shift()
                array1.push(element)
            }
        },
        sumPairs: () => {
            let arr = [];
            for (let i = 0; i < array1.length; i += 2) {
                arr.push(array1[i] + (array1[i + 1] !== undefined ? array1[i + 1] : 0));
            }

            array1 = arr;
        },
        print: () => result += `[ ${array1.join(", ")} ]`
    }

    for (let i = 0; i < array2.length; i++) {
        let [operation, ...args] = array2[i].split(" ");
        operations[operation](args);

    }

    return result;
}

const array_manipulatorV3 = (array1, array2) => {
    let result = ``;
    const operations = {
        add: (array) => array1.splice(Number(array[0]), 0, Number(array[1])),
        addMany: (array) => array1.splice(Number(array.shift()), 0, ...array.map(e => Number(e))),
        contains: (element) => result += `${array1.indexOf(Number(element))}\n`,
        remove: (index) => array1.splice(Number(index), 1),
        shift: (positions) => {
            for (let j = 0; j < positions; j++) {
                let element = array1.shift()
                array1.push(element)
            }
        },
        sumPairs: () => {
            let arr = [];
            for (let i = 0; i < array1.length; i += 2) {
                arr.push(array1[i] + (array1[i + 1] !== undefined ? array1[i + 1] : 0));
            }

            array1 = arr;
        },
        print: () => result += `[ ${array1.join(", ")} ]`
    }

    for (let i = 0; i < array2.length; i++) {
        let [operation, ...args] = array2[i].split(" ");
        operations[operation](args);

    }

    return result;
}

// console.log(array_manipulatorV1([1, 2, 4, 5, 6, 7],['add 1 8', 'contains 1', 'contains 3', 'print']));
// console.log(array_manipulatorV1([1, 2, 3, 4, 5], ["addMany 5 9 8 7 6 5", "contains 15", "remove 3", "shift 1", "print"]));
// console.log(array_manipulatorV1([2, 2, 4, 2, 4], ["add 1 4", "sumPairs", "print"]));
// console.log(array_manipulatorV1([2, 2, 4, 2], ["add 1 4", "sumPairs", "print"]));

