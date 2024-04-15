function words_trackerV1(input){
    let words = {};
    input.shift().split(" ").forEach(e => words[e] = 0);

    input.forEach(e => {
        if(words.hasOwnProperty(e)){
            words[e] = words[e] + 1;
        }
    });

    return Object.entries(words).sort((a, b) => b[1] - a[1]). map(e => `${e[0]} - ${e[1]}`).join("\n");
}

const words_trackerV2 = function(input){
    let words = {};
    input.shift().split(" ").forEach(e => words[e] = 0);

    input.forEach(e => {
        if(words.hasOwnProperty(e)){
            words[e] = words[e] + 1;
        }
    });

    return Object.entries(words).sort((a, b) => b[1] - a[1]). map(e => `${e[0]} - ${e[1]}`).join("\n");
}

const words_trackerV3 = (input) => {
    let words = {};
    input.shift().split(" ").forEach(e => words[e] = 0);

    input.forEach(e => {
        if(words.hasOwnProperty(e)){
            words[e] = words[e] + 1;
        }
    });

    return Object.entries(words).sort((a, b) => b[1] - a[1]). map(e => `${e[0]} - ${e[1]}`).join("\n");
}

// console.log(words_trackerV2(['this sentence', 'In', 'this', 'sentence', 'you', 'have', 'to', 'count', 'the', 'occurrences', 'of', 'the', 'words', 'this', 'and', 'sentence', 'because', 'this', 'is', 'your', 'task']));