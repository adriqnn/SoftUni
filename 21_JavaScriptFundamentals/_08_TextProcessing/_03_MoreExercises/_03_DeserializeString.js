function deserialize_stringV1(input){
    let values = {};

    input.slice(0, -1).forEach(e => {
        let [char, numbers] = e.split(":");
        let indexArray = numbers.split("/");

        indexArray.forEach(e => values[e] = char);
    });

    return  Object.values(values).join("");
}

const deserialize_stringV2 = function(input){
    let values = {};

    input.slice(0, -1).forEach(e => {
        let [char, numbers] = e.split(":");
        let indexArray = numbers.split("/");

        indexArray.forEach(e => values[e] = char);
    });

    return  Object.values(values).join("");
}

const deserialize_stringV3 = (input) => {
    let values = {};

    input.slice(0, -1).forEach(e => {
        let [char, numbers] = e.split(":");
        let indexArray = numbers.split("/");

        indexArray.forEach(e => values[e] = char);
    });

    return  Object.values(values).join("");
}

// console.log(deserialize_stringV1(['a:0/2/4/6', 'b:1/3/5', 'end']));