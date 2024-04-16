function count_string_occurrencesV1(sentence, word){
    let arr = sentence.split(" ");
    let count = 0;

    for (const arrElement of arr) {
        if(arrElement === word){
            count++;
        }
    }

    return count;
}

const count_string_occurrencesV2 = function(sentence, word){
    let arr = sentence.split(" ");
    let count = 0;

    for (const arrElement of arr) {
        if(arrElement === word){
            count++;
        }
    }

    return count;
}

const count_string_occurrencesV3 = (sentence, word) => {
    let arr = sentence.split(" ");
    let count = 0;

    for (const arrElement of arr) {
        if(arrElement === word){
            count++;
        }
    }

    return count;
}