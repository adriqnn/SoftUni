function password_generatorV1(input){
    function isVowel(letter) {
        const lowerCaseLetter = letter.toLowerCase();
        const vowels = new Set(['a', 'e', 'i', 'o', 'u']);
        return vowels.has(lowerCaseLetter);
    }

    let word = input[0] + input[1];
    let replaceWith = input[2].split("");
    let index = 0;

    word = word.split("").map(e => {
        if(isVowel(e)){
            e = replaceWith[(index++ % replaceWith.length)].toUpperCase();
        }

        return e;
    });

    return `Your generated password is ${word.reverse().join("")}`;
}

const password_generatorV2 = function(input){
    function isVowel(letter) {
        const lowerCaseLetter = letter.toLowerCase();
        const vowels = new Set(['a', 'e', 'i', 'o', 'u']);
        return vowels.has(lowerCaseLetter);
    }

    let word = input[0] + input[1];
    let replaceWith = input[2].split("");
    let index = 0;

    word = word.split("").map(e => {
        if(isVowel(e)){
            e = replaceWith[(index++ % replaceWith.length)].toUpperCase();
        }

        return e;
    });

    return `Your generated password is ${word.reverse().join("")}`;
}

const password_generatorV3 = (input) => {
    function isVowel(letter) {
        const lowerCaseLetter = letter.toLowerCase();
        const vowels = new Set(['a', 'e', 'i', 'o', 'u']);
        return vowels.has(lowerCaseLetter);
    }

    let word = input[0] + input[1];
    let replaceWith = input[2].split("");
    let index = 0;

    word = word.split("").map(e => {
        if(isVowel(e)){
            e = replaceWith[(index++ % replaceWith.length)].toUpperCase();
        }

        return e;
    });

    return `Your generated password is ${word.reverse().join("")}`;
}

// console.log(password_generatorV1(['ilovepizza','ihatevegetables', 'orange']));