function censored_wordsV1(sentence, word){
    let toCensor = sentence;

    while(toCensor.includes(word)){
        toCensor = toCensor.replace(word, "*".repeat(word.length));

    }

    return toCensor;
}

const censored_wordsV2 = function(sentence, word){
    return sentence.replaceAll(word, "*".repeat(word.length));
}

const censored_wordsV3 = (sentence, word) => {
    return sentence.replaceAll(word, "*".repeat(word.length));
}

console.log(censored_wordsV1('A small sentence with some words', 'small'));