function card_gameV1(input){
    let hands = {};
    const faces = { 2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9, 10: 10, J: 11, Q: 12, K: 13, A: 14 };
    const types = { S: 4, H: 3, D: 2, C: 1 };

    input.forEach((e) => {
        let [name, cards] = e.split(": ");

        if(!hands.hasOwnProperty(name)){
            hands[name] = [];
        }

        let setOfCards = cards.split(", ");
        setOfCards.forEach(e => {
            if(hands[name].indexOf(e) === -1){
                hands[name].push(e);
            }
        });
    });

    return Object.entries(hands).map(e => {
        return `${e[0]}: ${e[1].reduce((a, v) => {
            let first = types[v.charAt(v.length - 1)];
            let second = faces[v.slice(0, v.length - 1)];
            
            a += (first * second);
            return a;
        }, 0)}`;
    }).join("\n");
}

const card_gameV2 = function(input){
    let hands = {};
    const faces = { 2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9, 10: 10, J: 11, Q: 12, K: 13, A: 14 };
    const types = { S: 4, H: 3, D: 2, C: 1 };

    input.forEach((e) => {
        let [name, cards] = e.split(": ");

        if(!hands.hasOwnProperty(name)){
            hands[name] = [];
        }

        let setOfCards = cards.split(", ");
        setOfCards.forEach(e => {
            if(hands[name].indexOf(e) === -1){
                hands[name].push(e);
            }
        });
    });

    return Object.entries(hands).map(e => {
        return `${e[0]}: ${e[1].reduce((a, v) => {
            let first = types[v.charAt(v.length - 1)];
            let second = faces[v.slice(0, v.length - 1)];

            a += (first * second);
            return a;
        }, 0)}`;
    }).join("\n");
}

const card_gameV3 = (input) => {
    let hands = {};
    const faces = { 2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9, 10: 10, J: 11, Q: 12, K: 13, A: 14 };
    const types = { S: 4, H: 3, D: 2, C: 1 };

    input.forEach((e) => {
        let [name, cards] = e.split(": ");

        if(!hands.hasOwnProperty(name)){
            hands[name] = [];
        }

        let setOfCards = cards.split(", ");
        setOfCards.forEach(e => {
            if(hands[name].indexOf(e) === -1){
                hands[name].push(e);
            }
        });
    });

    return Object.entries(hands).map(e => {
        return `${e[0]}: ${e[1].reduce((a, v) => {
            let first = types[v.charAt(v.length - 1)];
            let second = faces[v.slice(0, v.length - 1)];

            a += (first * second);
            return a;
        }, 0)}`;
    }).join("\n");
}

// console.log(card_gameV1(['Peter: 2C, 4H, 9H, AS, QS', 'Tomas: 3H, 10S, JC, KD, 5S, 10S', 'Andrea: QH, QC, QS, QD', 'Tomas: 6H, 7S, KC, KD, 5S, 10C', 'Andrea: QH, QC, JS, JD, JC', 'Peter: JD, JD, JD, JD, JD, JD']));
