function playing_cardsV1(face, suit){
    const faces = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'D', 'K', 'A'];

    if(faces.indexOf(face) === -1){
        throw new Error('Invalid face: ' + face);
    }

    const suits = {
        'S': '\u2660',
        'H': '\u2665',
        'D': '\u2666',
        'C': '\u2663'
    };
    
    const result = {
        face,
        suit: suits[suit],
        toString(){return this.face + this.suit}
    };
    
    return result;
}

function playing_cardsV2(face, suit){
    const faces = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'D', 'K', 'A'];

    if(faces.indexOf(face) === -1){
        throw new Error('Invalid face: ' + face);
    }

    const suits = {
        'S': '\u2660',
        'H': '\u2665',
        'D': '\u2666',
        'C': '\u2663'
    };

    return {
        face,
        suit: suits[suit],
        toString() {
            return this.face + this.suit
        }
    };
}

function playing_cardsV3(face, suit){
    const faces = {2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9, 10: 10, J: 'J', Q: 'Q', K: 'K', A: 'A'};
    const suits = {S: '\u2660', H: '\u2665', D: '\u2666', C: '\u2663'};
    const setter = (c, e) => {
        if (!c[e]){
            throw new Error();
        }

        return c[e];
    }

    let [f, s] = [setter(faces, face), setter(suits, suit)];
    const card = {f, s, toString: () => `${f}${s}`};

    Object.defineProperties(card, {
        face: {
            get(){return f},
            set: (f) => setter(faces, f)
        },
        suit: {
            get(){return suit},
            set: (s) => setter(suits, s)
        }
    });

    return card;
}
