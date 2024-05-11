function print_every_nth_element_from_an_arrayV1(arr, number){
    return arr.filter((e, i) => i % number === 0);
}

function print_every_nth_element_from_an_arrayV2(arr, number){
    const result = [];
    for (let i = 0; i < arr.length; i += number) {
        result.push(arr[i]);
    }

    return result;
}
