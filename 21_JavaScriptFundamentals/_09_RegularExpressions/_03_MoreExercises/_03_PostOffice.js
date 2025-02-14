function post_officeV1(input){
    input = input.join("");
    let [firstPart, secondPart, thirdPart] = input.split("|");
    let regexForFirstPart = /(\$([A-Z])+\$|\#[A-Z]+\#|\%[A-Z]+\%|\*[A-Z]+\*|\&[A-Z]+\&)/g;
    let regexForSecondPart = /([7-8][0-9]|90|65|66|67|68|69):([0-1][1-9]|20|10)/g;

    let capitalLetters = regexForFirstPart.exec(firstPart);
    capitalLetters = capitalLetters[1].split("");
    capitalLetters.shift();
    capitalLetters.pop();

    let lettersAndLengths = secondPart.match(regexForSecondPart);
    let map = new Map();

    for (let letter of capitalLetters) {
        map.set(letter, 0);
    }

    let unique = [];
    for (let combination of lettersAndLengths) {
        let [letterAsciiCode, length] = combination.split(":");
        letterAsciiCode = String.fromCharCode(letterAsciiCode);

        if (!unique.includes(letterAsciiCode)) {
            unique.push(letterAsciiCode);
        }

        length = Number(length) + 1;
        if (map.has(letterAsciiCode)) {
            map.set(letterAsciiCode, length);
        }
    }


    thirdPart = thirdPart.split(" ");
    let result = "";
    for (let letter of capitalLetters) {
        for (let word of thirdPart) {
            if (letter === word[0] && word.length === map.get(letter)) {
                result += `${word}\n`;
            }
        }
    }

    return result;
}

const post_officeV2 = function(input){
    input = input.join("");
    let [firstPart, secondPart, thirdPart] = input.split("|");
    let regexForFirstPart = /(\$([A-Z])+\$|\#[A-Z]+\#|\%[A-Z]+\%|\*[A-Z]+\*|\&[A-Z]+\&)/g;
    let regexForSecondPart = /([7-8][0-9]|90|65|66|67|68|69):([0-1][1-9]|20|10)/g;

    let capitalLetters = regexForFirstPart.exec(firstPart);
    capitalLetters = capitalLetters[1].split("");
    capitalLetters.shift();
    capitalLetters.pop();

    let lettersAndLengths = secondPart.match(regexForSecondPart);
    let map = new Map();

    for (let letter of capitalLetters) {
        map.set(letter, 0);
    }

    let unique = [];
    for (let combination of lettersAndLengths) {
        let [letterAsciiCode, length] = combination.split(":");
        letterAsciiCode = String.fromCharCode(letterAsciiCode);

        if (!unique.includes(letterAsciiCode)) {
            unique.push(letterAsciiCode);
        }

        length = Number(length) + 1;
        if (map.has(letterAsciiCode)) {
            map.set(letterAsciiCode, length);
        }
    }


    thirdPart = thirdPart.split(" ");
    let result = "";
    for (let letter of capitalLetters) {
        for (let word of thirdPart) {
            if (letter === word[0] && word.length === map.get(letter)) {
                result += `${word}\n`;
            }
        }
    }

    return result;
}

const post_officeV3 = (input) => {
    input = input.join("");
    let [firstPart, secondPart, thirdPart] = input.split("|");
    let regexForFirstPart = /(\$([A-Z])+\$|\#[A-Z]+\#|\%[A-Z]+\%|\*[A-Z]+\*|\&[A-Z]+\&)/g;
    let regexForSecondPart = /([7-8][0-9]|90|65|66|67|68|69):([0-1][1-9]|20|10)/g;

    let capitalLetters = regexForFirstPart.exec(firstPart);
    capitalLetters = capitalLetters[1].split("");
    capitalLetters.shift();
    capitalLetters.pop();

    let lettersAndLengths = secondPart.match(regexForSecondPart);
    let map = new Map();

    for (let letter of capitalLetters) {
        map.set(letter, 0);
    }

    let unique = [];
    for (let combination of lettersAndLengths) {
        let [letterAsciiCode, length] = combination.split(":");
        letterAsciiCode = String.fromCharCode(letterAsciiCode);

        if (!unique.includes(letterAsciiCode)) {
            unique.push(letterAsciiCode);
        }

        length = Number(length) + 1;
        if (map.has(letterAsciiCode)) {
            map.set(letterAsciiCode, length);
        }
    }


    thirdPart = thirdPart.split(" ");
    let result = "";
    for (let letter of capitalLetters) {
        for (let word of thirdPart) {
            if (letter === word[0] && word.length === map.get(letter)) {
                result += `${word}\n`;
            }
        }
    }

    return result;
}

