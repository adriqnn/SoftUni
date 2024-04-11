function array_manipulationsV1(array){
    let arr = array.shift().split(" ");
    let operations = {
        "Add": (x) => arr.push(x),
        "Remove": (x) => arr = arr.filter(e => e !== x),
        "RemoveAt": (x) => arr.splice(x, 1),
        "Insert": (x, i) => arr.splice(i, 0, x)
    }

    array.forEach(e => {
        let [command, value, three] = e.split(" ");

        if(command === "Insert"){
            operations[command](value, three);
        }else{
            operations[command](value);
        }
    });

    return arr.join(" ");
}

const array_manipulationsV2 = function(array){
    let arr = array.shift().split(" ");
    let operations = {
        "Add": (x) => arr.push(x),
        "Remove": (x) => arr = arr.filter(e => e !== x),
        "RemoveAt": (x) => arr.splice(x, 1),
        "Insert": (x, i) => arr.splice(i, 0, x)
    }

    array.forEach(e => {
        let [command, value, three] = e.split(" ");

        if(command === "Insert"){
            operations[command](value, three);
        }else{
            operations[command](value);
        }
    });

    return arr.join(" ");
}

const array_manipulationsV3 = (array) => {
    let arr = array.shift().split(" ");
    let operations = {
        "Add": (x) => arr.push(x),
        "Remove": (x) => arr = arr.filter(e => e !== x),
        "RemoveAt": (x) => arr.splice(x, 1),
        "Insert": (x, i) => arr.splice(i, 0, x)
    }

    array.forEach(e => {
        let [command, value, three] = e.split(" ");

        if(command === "Insert"){
            operations[command](value, three);
        }else{
            operations[command](value);
        }
    });

    return arr.join(" ");
}

// console.log(array_manipulationsV1(['4 19 2 53 6 43', 'Add 3', 'Remove 2', 'RemoveAt 1', 'Insert 8 3']));