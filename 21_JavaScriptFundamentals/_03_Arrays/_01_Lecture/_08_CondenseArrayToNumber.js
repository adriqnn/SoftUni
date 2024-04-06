function condense_array_to_numberV1(array){
    if(array.length === 1){
        return array.join("");
    }

    let condensed = [];
    for (let i = 0; i < array.length - 1; i++) {
        condensed.push(Number(array[i]) + Number(array[i+1]));
    }

    return  condense_array_to_numberV1(condensed);
}

const condense_array_to_numberV2 = function(array){
    if (array.length === 1) {
        return array.join("");
    }

    const result = array.reduce((accumulator, currentValue, index) => {
        if (index < array.length - 1) {
            accumulator.push(Number(currentValue) + Number(array[index + 1]));
        }

        return accumulator;
    }, []);

    return condense_array_to_numberV2(result);
}

const condense_array_to_numberV3 = (array) => {
    let result = array.slice(); // Copy the original array to avoid mutation

    while (result.length > 1) {
        result = result.reduce((accumulator, currentValue, index, array) => {
            if (index < array.length - 1) {
                accumulator.push(Number(currentValue) + Number(array[index + 1]));
            }

            return accumulator;
        }, []);
    }

    return result.join("");
}

// console.log(condense_array_to_numberV1([2, 10, 3]));
// console.log(condense_array_to_numberV3([2, 10, 3]));
// console.log(condense_array_to_numberV3([5, 0, 4, 1, 2]));