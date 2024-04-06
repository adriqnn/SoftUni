function add_and_subtractV1(array){
    let currentArraySum = 0;
    let newArraySum = 0;
    let arr = [];

    array.forEach((e, index) => {
        let current = Number(e);
        currentArraySum += current;

        if(current % 2 === 0){
            arr.push(current + index);
            newArraySum += current + index;
        }else{
            arr.push(current - index);
            newArraySum += current - index;
        }
    });

    return `[ ${arr.join(", ")} ]\n${currentArraySum}\n${newArraySum}`;
}

const add_and_subtractV2 = function(array){
    let currentArraySum = 0;
    let newArraySum = 0;
    let arr = [];

    array.forEach((e, index) => {
        let current = Number(e);
        currentArraySum += current;

        if(current % 2 === 0){
            arr.push(current + index);
            newArraySum += current + index;
        }else{
            arr.push(current - index);
            newArraySum += current - index;
        }
    });

    return `[ ${arr.join(", ")} ]\n${currentArraySum}\n${newArraySum}`;
}

const add_and_subtractV3 = (array) => {
    let currentArraySum = 0;
    let newArraySum = 0;
    let arr = [];

    array.forEach((e, index) => {
        let current = Number(e);
        currentArraySum += current;

        if(current % 2 === 0){
            arr.push(current + index);
            newArraySum += current + index;
        }else{
            arr.push(current - index);
            newArraySum += current - index;
        }
    });

    return `[ ${arr.join(", ")} ]\n${currentArraySum}\n${newArraySum}`;
}

// console.log(add_and_subtractV1([5, 15, 23, 56, 35]));