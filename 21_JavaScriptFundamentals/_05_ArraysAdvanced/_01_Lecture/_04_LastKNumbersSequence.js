function last_k_numbers_sequenceV1(length, elements){
    let array = [1];
    let helper = [1];

    for (let i = 0; i < length - 1; i++) {
        let number = helper.reduce((a, v) => a + v, 0);
        array.push(number);

        if(helper.length >= elements){
            helper.shift()
        }

        helper.push(number);
    }

    return array.join(" ");
}

const last_k_numbers_sequenceV2 = function(length, elements){
    let array = Array(length - 1).fill(0);
    let currentValue = 1;

    array.forEach((x, i) => {
        array[i] = array.slice(i - elements, i).reduce((a, v) => a + v, 0);
        if(i - elements >= 0){
            array[i] = array.slice(i - elements, i).reduce((a, v) => a + v, 0);
        }else{
            array[i] = currentValue;
            currentValue += currentValue;
        }
    });

    array.unshift(1);

    return array.join(" ");
}

const last_k_numbers_sequenceV3 = (length, elements) => {
    let array = [1];
    let helper = [1];

    for (let i = 0; i < length - 1; i++) {
        let number = helper.reduce((a, v) => a + v, 0);
        array.push(number);

        if(helper.length >= elements){
            helper.shift()
        }

        helper.push(number);
    }

    return array.join(" ");
}

// console.log(last_k_numbers_sequenceV2(6, 3));
// console.log(last_k_numbers_sequenceV2(8, 2));