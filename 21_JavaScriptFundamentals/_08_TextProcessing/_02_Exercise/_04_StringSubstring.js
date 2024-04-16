function string_substringV1(word, sentence){
    let find = word.toLocaleLowerCase();
    let array = sentence.split(" ").map(e => e.toLowerCase());

    return array.indexOf(find) !== -1 ? word : `${word} not found!`;
}

const string_substringV2 = function(word, sentence){
    let find = word.toLocaleLowerCase();
    let array = sentence.split(" ").map(e => e.toLowerCase());

    return array.indexOf(find) !== -1 ? word : `${word} not found!`;
}

const string_substringV3 = (word, sentence) => {
    let find = word.toLocaleLowerCase();
    let array = sentence.split(" ").map(e => e.toLowerCase());

    return array.indexOf(find) !== -1 ? word : `${word} not found!`;
}

// console.log(string_substringV1("javascript", "JavaScript is the best programming language"));
// console.log(string_substringV1("python", "JavaScript is the best programming language"));
