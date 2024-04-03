function triples_of_latin_lettersV1(number){
    let result = "";

    for (let i = 0; i < number; i++) {
        for (let j = 0; j < number; j++) {
            for (let k = 0; k < number; k++) {
                result += `${String.fromCharCode(97 + i)}${String.fromCharCode(97 + j)}${String.fromCharCode(97 + k)}\n`;
            }
        }
    }

    return result;
}

const triples_of_latin_lettersV2 = function(number){
    let result = "";

    for (let i = 0; i < number; i++) {
        for (let j = 0; j < number; j++) {
            for (let k = 0; k < number; k++) {
                result += `${String.fromCharCode(97 + i)}${String.fromCharCode(97 + j)}${String.fromCharCode(97 + k)}\n`;
            }
        }
    }

    return result;
}

const triples_of_latin_lettersV3 = (number) => {
    let result = "";

    for (let i = 0; i < number; i++) {
        for (let j = 0; j < number; j++) {
            for (let k = 0; k < number; k++) {
                result += `${String.fromCharCode(97 + i)}${String.fromCharCode(97 + j)}${String.fromCharCode(97 + k)}\n`;
            }
        }
    }

    return result;
}

// triples_of_latin_lettersV1(4);