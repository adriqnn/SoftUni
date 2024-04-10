function character_in_rangeV1(char1, char2){
    let result = [];
    let value1 = char1.charCodeAt(0);
    let value2 = char2.charCodeAt(0);

    function display(start, end) {
        for (let i = start + 1; i < end; i++) {
            result.push(String.fromCharCode(i));
        }
    }

    value1 < value2 ? display(value1, value2) : display(value2, value1);
    return result.join(" ");
}

const character_in_rangeV2 = function(char1, char2){
    let result = [];
    let value1 = char1.charCodeAt(0);
    let value2 = char2.charCodeAt(0);

    function display(start, end) {
        for (let i = start + 1; i < end; i++) {
            result.push(String.fromCharCode(i));
        }
    }

    value1 < value2 ? display(value1, value2) : display(value2, value1);
    return result.join(" ");
}

const character_in_rangeV3 = (char1, char2) => {
    let result = [];
    let value1 = char1.charCodeAt(0);
    let value2 = char2.charCodeAt(0);

    function display(start, end) {
        for (let i = start + 1; i < end; i++) {
            result.push(String.fromCharCode(i));
        }
    }

    value1 < value2 ? display(value1, value2) : display(value2, value1);
    return result.join(" ");
}

// console.log(character_in_rangeV1("a", "b"));