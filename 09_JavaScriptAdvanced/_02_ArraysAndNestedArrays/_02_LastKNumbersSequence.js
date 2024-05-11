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

    return array;
}

function last_k_numbers_sequenceV2(length, elements){
    const arr = [1];
    for (let i = 0; i < length - 1; i++) {
        arr.push(arr.slice(-elements).reduce((a, v) => a + v, 0));
    }

    return arr;
}
