function max_sequence_of_equal_elementsV1(array){
    let bestSequence = "";
    let currentSequence = `${array[0]} `;
    let bestValue = -1;
    let currentValue = array[0];

    for (let i = 1; i < array.length; i++) {
        if(array[i] === currentValue){
            currentSequence += currentValue + " ";
        }else{
            currentValue = array[i];
            currentSequence = currentValue + " ";
        }

        if(currentSequence.length > bestSequence.length){
            bestSequence = currentSequence;
            bestValue = currentValue;
        }
    }

    return `${bestSequence}`;
}

const max_sequence_of_equal_elementsV2 = function(array){
    let bestSequence = "";
    let currentSequence = `${array[0]} `;
    let bestValue = -1;
    let currentValue = array[0];

    for (let i = 1; i < array.length; i++) {
        if(array[i] === currentValue){
            currentSequence += currentValue + " ";
        }else{
            currentValue = array[i];
            currentSequence = currentValue + " ";
        }

        if(currentSequence.length > bestSequence.length){
            bestSequence = currentSequence;
            bestValue = currentValue;
        }
    }

    return `${bestSequence}`;
}

const max_sequence_of_equal_elementsV3 = (array) => {
    let bestSequence = "";
    let currentSequence = `${array[0]} `;
    let bestValue = -1;
    let currentValue = array[0];

    for (let i = 1; i < array.length; i++) {
        if(array[i] === currentValue){
            currentSequence += currentValue + " ";
        }else{
            currentValue = array[i];
            currentSequence = currentValue + " ";
        }

        if(currentSequence.length > bestSequence.length){
            bestSequence = currentSequence;
            bestValue = currentValue;
        }
    }

    return `${bestSequence}`;
}

// console.log(max_sequence_of_equal_elementsV1([2, 1, 1, 2, 3, 3, 2, 2, 2, 1]));
// console.log(max_sequence_of_equal_elementsV1([1, 1, 1, 2, 3, 1, 3, 3]));
// console.log(max_sequence_of_equal_elementsV1([4, 4, 4, 4]));
// console.log(max_sequence_of_equal_elementsV1([0, 1, 1, 5, 2, 2, 6, 3, 3]));