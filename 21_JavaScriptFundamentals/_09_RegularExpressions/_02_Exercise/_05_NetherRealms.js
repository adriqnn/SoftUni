function nether_realmsV1(input){
    let object = {};
    let asciiSum = /([^\d\+\-*\/\.])/g;
    let numSum = /([+|-]?[0-9]+[.]?[0-9]+|[+|-]?[0-9]+)/g;
    let MultiplyRegex = /([\*\/])/g;

    let newArr = input.split(/[, ]+/g);
    newArr.forEach((e, i) => {
        let health = 0;
        let heroMatches = e.match(asciiSum);

        if(heroMatches !== null){
            for (let j = 0; j < heroMatches.length; j++) {
                let code = heroMatches[j].charCodeAt(0);
                health += code;
            }
        }

        object[e] = { health: health };
        let damage = 0;
        let damageMatches = e.match(numSum);

        if (damageMatches !== null) {
            damageMatches.forEach((e, i) => {
                if (i < damageMatches.length) {
                    damage += Number(e);
                }
            });
        }

        let multiplySymbol = e.match(MultiplyRegex);
        if (multiplySymbol !== null) {
            multiplySymbol.forEach((e, i) => {
                if (i < multiplySymbol.length) {
                    if (e === "*") {
                        damage *= 2;
                    } else {
                        damage /= 2;
                    }
                }
            });
        }

        object[e]["damage"] = damage.toFixed(2);
    });

    return Object.entries(object).sort((a,b)=> a[0].localeCompare(b[0])).map(e=>
        `${e[0]} - ${e[1]["health"]} health, ${e[1]["damage"]} damage`).join("\n");
}

const nether_realmsV2 = function(input){
    let object = {};
    let asciiSum = /([^\d\+\-*\/\.])/g;
    let numSum = /([+|-]?[0-9]+[.]?[0-9]+|[+|-]?[0-9]+)/g;
    let MultiplyRegex = /([\*\/])/g;

    let newArr = input.split(/[, ]+/g);
    newArr.forEach((e, i) => {
        let health = 0;
        let heroMatches = e.match(asciiSum);

        if(heroMatches !== null){
            for (let j = 0; j < heroMatches.length; j++) {
                let code = heroMatches[j].charCodeAt(0);
                health += code;
            }
        }

        object[e] = { health: health };
        let damage = 0;
        let damageMatches = e.match(numSum);

        if (damageMatches !== null) {
            damageMatches.forEach((e, i) => {
                if (i < damageMatches.length) {
                    damage += Number(e);
                }
            });
        }

        let multiplySymbol = e.match(MultiplyRegex);
        if (multiplySymbol !== null) {
            multiplySymbol.forEach((e, i) => {
                if (i < multiplySymbol.length) {
                    if (e === "*") {
                        damage *= 2;
                    } else {
                        damage /= 2;
                    }
                }
            });
        }

        object[e]["damage"] = damage.toFixed(2);
    });

    return Object.entries(object).sort((a,b)=> a[0].localeCompare(b[0])).map(e=>
        `${e[0]} - ${e[1]["health"]} health, ${e[1]["damage"]} damage`).join("\n");
}

const nether_realmsV3 = (input) => {
    let object = {};
    let asciiSum = /([^\d\+\-*\/\.])/g;
    let numSum = /([+|-]?[0-9]+[.]?[0-9]+|[+|-]?[0-9]+)/g;
    let MultiplyRegex = /([\*\/])/g;

    let newArr = input.split(/[, ]+/g);
    newArr.forEach((e, i) => {
        let health = 0;
        let heroMatches = e.match(asciiSum);

        if(heroMatches !== null){
            for (let j = 0; j < heroMatches.length; j++) {
                let code = heroMatches[j].charCodeAt(0);
                health += code;
            }
        }

        object[e] = { health: health };
        let damage = 0;
        let damageMatches = e.match(numSum);

        if (damageMatches !== null) {
            damageMatches.forEach((e, i) => {
                if (i < damageMatches.length) {
                    damage += Number(e);
                }
            });
        }

        let multiplySymbol = e.match(MultiplyRegex);
        if (multiplySymbol !== null) {
            multiplySymbol.forEach((e, i) => {
                if (i < multiplySymbol.length) {
                    if (e === "*") {
                        damage *= 2;
                    } else {
                        damage /= 2;
                    }
                }
            });
        }

        object[e]["damage"] = damage.toFixed(2);
    });

    return Object.entries(object).sort((a,b)=> a[0].localeCompare(b[0])).map(e=>
        `${e[0]} - ${e[1]["health"]} health, ${e[1]["damage"]} damage`).join("\n");
}