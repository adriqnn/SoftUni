function reveal_wordsV1(word, sentence){
    let unCensor = sentence;

    word.split(", ").forEach(e => {
        unCensor = unCensor.replace("*".repeat(e.length), e)
    });

    return unCensor;
}

const reveal_wordsV2 = function(word, sentence){
    let unCensor = sentence;

    word.split(", ").forEach(e => {
        unCensor = unCensor.replace("*".repeat(e.length), e)
    });

    return unCensor;
}

const reveal_wordsV3 = (word, sentence) => {
    let unCensor = sentence;

    word.split(", ").forEach(e => {
        unCensor = unCensor.replace("*".repeat(e.length), e)
    });

    return unCensor;
}