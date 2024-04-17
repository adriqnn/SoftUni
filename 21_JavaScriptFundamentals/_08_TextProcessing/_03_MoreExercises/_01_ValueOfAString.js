function value_of_a_stringV1(input){
    function isLetter(char) {
        return (char >= 'a' && char <= 'z') || (char >= 'A' && char <= 'Z');
    }

    let small = 0, big = 0;
    input[0].trim().split("").filter(e => isLetter(e)).forEach(e => {
        let current = e.charCodeAt(0);
        current < 97 ? big += current : small += current;
    });

    return input[1] === "UPPERCASE" ? `The total sum is: ${big}` : `The total sum is: ${small}`;
}

const value_of_a_stringV2 = function(input){
    function isLetter(char) {
        return (char >= 'a' && char <= 'z') || (char >= 'A' && char <= 'Z');
    }

    let small = 0, big = 0;
    input[0].trim().split("").filter(e => isLetter(e)).forEach(e => {
        let current = e.charCodeAt(0);
        current < 97 ? big += current : small += current;
    });

    return input[1] === "UPPERCASE" ? `The total sum is: ${big}` : `The total sum is: ${small}`;
}

const value_of_a_stringV3 = (input) => {
    function isLetter(char) {
        return (char >= 'a' && char <= 'z') || (char >= 'A' && char <= 'Z');
    }

    let small = 0, big = 0;
    input[0].trim().split("").filter(e => isLetter(e)).forEach(e => {
        let current = e.charCodeAt(0);
        current < 97 ? big += current : small += current;
    });

    return input[1] === "UPPERCASE" ? `The total sum is: ${big}` : `The total sum is: ${small}`;
}

// console.log(value_of_a_stringV1([' HelloFromMyAwesomePROGRAM', 'LOWERCASE']));