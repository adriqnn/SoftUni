function hard_wordsV1(array){
    array[1].forEach(e => {
        let emptySpot = "";

        for (let i = 0; i < e.length; i++) {
            emptySpot += '_';
        }

        let expression = `\\b${emptySpot}\\b`;
        let regexp = new RegExp(expression);
        array[0] = array[0].replace(regexp, e);
    });

    return array[0];
}

const hard_wordsV2 = function(array){
    array[1].forEach(e => {
        let emptySpot = "";

        for (let i = 0; i < e.length; i++) {
            emptySpot += '_';
        }

        let expression = `\\b${emptySpot}\\b`;
        let regexp = new RegExp(expression);
        array[0] = array[0].replace(regexp, e);
    });

    return array[0];
}

const hard_wordsV3 = (array) => {
    let letter = array[0];
    let underscores = findUnderscores(array[0]);
    let words = array[1];

    function findUnderscores(text) {
        let positions = [];
        let currentIndex = 0;

        while (currentIndex < text.length) {
            if (text[currentIndex] === '_') {
                let start = currentIndex;
                let underscoreCount = 0;

                while (currentIndex < text.length && text[currentIndex] === '_') {
                    underscoreCount++;
                    currentIndex++;
                }

                positions.push({
                    index: start,
                    length: underscoreCount
                });
            } else {
                currentIndex++;
            }
        }

        return positions;
    }

    underscores.forEach(e => {
        let index = e.index;
        let length = e.length;
        let word = "";

        for (let i = 0; i < words.length; i++) {
            if(words[i].length === length){
                word = words[i];
                words.splice(i, 1);
                break;
            }
        }

        let pt1 = letter.slice(0, index); // "Hello "
        let pt2 = letter.slice(index + length);

        letter = `${pt1}${word}${pt2}`;
    });

    return letter;
}

// console.log(hard_wordsV1(['Hi, grandma! I\'m so ____ to write to you. ______ the winter vacation, so _______ things happened. My dad bought me a sled. Mom started a new job as a __________. My brother\'s ankle is ________, and now it bothers me even more. Every night Mom cooks ___ on your recipe because it is the most delicious. I hope this year Santa will _____ me a robot.', ['pie', 'bring', 'glad', 'During', 'amazing', 'pharmacist', 'sprained']]));