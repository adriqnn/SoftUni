function replace_repeating_charsV1(input){
    let char = ``;

    for (let i = 0; i < input.length; i++) {
        if(input[i] !== char[char.length - 1]){
            char += input[i];
        }
    }

    return char;
}

const replace_repeating_charsV2 = function(input){
    let char = ``;

    for (let i = 0; i < input.length; i++) {
        if(char.charAt(0) === input.charAt(i)){
            char += input.charAt(i);
        }

        if(char.length > 1){
            input = input.replace(char, char.charAt(0));
            i -= char.length - 1;
        }

        char = input.charAt(i);
    }

    return input;
}

const replace_repeating_charsV3 = (input) => {
    let char = ``;

    for (let i = 0; i < input.length; i++) {
        if(char.charAt(0) === input.charAt(i)){
            char += input.charAt(i);
        }

        if(char.length > 1){
            input = input.replace(char, char.charAt(0));
            i -= char.length - 1;
        }

        char = input.charAt(i);
    }

    return input;
}

// console.log(replace_repeating_charsV1('aaaaabbbbbcdddeeeedssaa'));