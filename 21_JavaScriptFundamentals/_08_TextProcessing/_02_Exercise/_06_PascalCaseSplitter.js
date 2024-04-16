function pascal_case_splitterV1(input){
    let result = input[0];
    let letters = input.toLowerCase();

    for (let i = 1; i < letters.length; i++) {
        if (input[i] !== letters[i]) {
            result += ", ";
        }

        result += input[i];
    }

    return result;
}

const pascal_case_splitterV2 = function(input){
    let arr = [];
    let word = ``;

    for (let i = 0; i < input.length; i++) {
        if(input.charAt(i).charCodeAt(0) < 97 && word.length > 0){
            arr.push(word);
            word = "";
        }

        word += input[i];
    }

    arr.push(word);

    return arr.join(", ");
}

const pascal_case_splitterV3 = (input) => {
    let arr = [];
    let word = ``;

    for (let i = 0; i < input.length; i++) {
        if(input.charAt(i).charCodeAt(0) < 97 && word.length > 0){
            arr.push(word);
            word = "";
        }

        word += input[i];
    }

    arr.push(word);

    return arr.join(", ");
}

// console.log(pascal_case_splitterV1("SplitMeIfYouCanHaHaYouCantOrYouCan"));