function modern_times_of_hashtagV1(input){
    let result = ``;
    input = input.split(" ");

    function consistsOnlyOfLetters(word) {
        let regex = /^[a-zA-Z]+$/;
        return regex.test(word);
    }

    for (let i = 0; i < input.length; i++) {
        if(input[i].startsWith("#", 0) && input[i].length > 1 && consistsOnlyOfLetters(input[i].slice(1))){
            result += `${input[i].slice(1)}\n`;
        }
    }

    return result;
}

const modern_times_of_hashtagV2 = function(input){
    let result = ``;
    input = input.split(" ");

    function consistsOnlyOfLetters(word) {
        let regex = /^[a-zA-Z]+$/;
        return regex.test(word);
    }

    for (let i = 0; i < input.length; i++) {
        if(input[i].startsWith("#", 0) && input[i].length > 1 && consistsOnlyOfLetters(input[i].slice(1))){
            result += `${input[i].slice(1)}\n`;
        }
    }

    return result;
}

const modern_times_of_hashtagV3 = (input) => {
    let result = ``;
    input = input.split(" ");

    function consistsOnlyOfLetters(word) {
        let regex = /^[a-zA-Z]+$/;
        return regex.test(word);
    }

    for (let i = 0; i < input.length; i++) {
        if(input[i].startsWith("#", 0) && input[i].length > 1 && consistsOnlyOfLetters(input[i].slice(1))){
            result += `${input[i].slice(1)}\n`;
        }
    }

    return result;
}

// console.log(modern_times_of_hashtagV1("Nowadays everyone uses # to tag a #special word in #socialMedia"));