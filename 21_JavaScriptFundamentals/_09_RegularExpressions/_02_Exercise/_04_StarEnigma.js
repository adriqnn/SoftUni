function star_enigmaV1(input){
    let count = Number(input.shift());
    let planets = { attackCount: [], destroyedCounter: [] };
    let regex = /[star]/gmi;

    input.filter((e, i) => i < count).forEach((e, i) => {
        let matches = 0;
        e.match(regex) ? matches = Number(e.match(regex).length) : matches = 0;
        let messages = e.split("").map((e) => String.fromCharCode(e.charCodeAt(0) - matches)).join("");
        let messagePattern = /@(?<name>[A-Za-z]+)[^@:!\->]*:(?<planet>\d+)[^@:!\->]*!(?<command>[AD])![^@:!\->]*->(?<atack>\d+)/gm;
        let matchesRegex = messagePattern.exec(messages);

        if (matchesRegex) {
            let { name, planet, command, attack } = matchesRegex.groups;

            if (command === "A") {
                planets.attackCount.push(name);
            } else if (command === "D") {
                planets.destroyedCounter.push(name);
            }
        }
    });

    let result = `Attacked planets: ${(planets.attackCount.length)}\n`;
    if (planets.attackCount.length > 0) {
        planets.attackCount.sort((a, b) => a.localeCompare(b)).forEach(element => result += `-> ${element}\n`);
    }

    result += `Destroyed planets: ${planets.destroyedCounter.length}\n`;
    if (planets.destroyedCounter.length > 0) {
        planets.destroyedCounter.sort((a, b) => a.localeCompare(b)).forEach(element => result += `-> ${element}\n`);
    }

    return result;
}

const star_enigmaV2 = function(input){
    let count = Number(input.shift());
    let planets = { attackCount: [], destroyedCounter: [] };
    let regex = /[star]/gmi;

    input.filter((e, i) => i < count).forEach((e, i) => {
        let matches = 0;
        e.match(regex) ? matches = Number(e.match(regex).length) : matches = 0;
        let messages = e.split("").map((e) => String.fromCharCode(e.charCodeAt(0) - matches)).join("");
        let messagePattern = /@(?<name>[A-Za-z]+)[^@:!\->]*:(?<planet>\d+)[^@:!\->]*!(?<command>[AD])![^@:!\->]*->(?<atack>\d+)/gm;
        let matchesRegex = messagePattern.exec(messages);

        if (matchesRegex) {
            let { name, planet, command, attack } = matchesRegex.groups;

            if (command === "A") {
                planets.attackCount.push(name);
            } else if (command === "D") {
                planets.destroyedCounter.push(name);
            }
        }
    });

    let result = `Attacked planets: ${(planets.attackCount.length)}\n`;
    if (planets.attackCount.length > 0) {
        planets.attackCount.sort((a, b) => a.localeCompare(b)).forEach(element => result += `-> ${element}\n`);
    }

    result += `Destroyed planets: ${planets.destroyedCounter.length}\n`;
    if (planets.destroyedCounter.length > 0) {
        planets.destroyedCounter.sort((a, b) => a.localeCompare(b)).forEach(element => result += `-> ${element}\n`);
    }

    return result;
}

const star_enigmaV3 = (input) => {
    let count = Number(input.shift());
    let planets = { attackCount: [], destroyedCounter: [] };
    let regex = /[star]/gmi;

    input.filter((e, i) => i < count).forEach((e, i) => {
        let matches = 0;
        e.match(regex) ? matches = Number(e.match(regex).length) : matches = 0;
        let messages = e.split("").map((e) => String.fromCharCode(e.charCodeAt(0) - matches)).join("");
        let messagePattern = /@(?<name>[A-Za-z]+)[^@:!\->]*:(?<planet>\d+)[^@:!\->]*!(?<command>[AD])![^@:!\->]*->(?<atack>\d+)/gm;
        let matchesRegex = messagePattern.exec(messages);

        if (matchesRegex) {
            let { name, planet, command, attack } = matchesRegex.groups;

            if (command === "A") {
                planets.attackCount.push(name);
            } else if (command === "D") {
                planets.destroyedCounter.push(name);
            }
        }
    });

    let result = `Attacked planets: ${(planets.attackCount.length)}\n`;
    if (planets.attackCount.length > 0) {
        planets.attackCount.sort((a, b) => a.localeCompare(b)).forEach(element => result += `-> ${element}\n`);
    }

    result += `Destroyed planets: ${planets.destroyedCounter.length}\n`;
    if (planets.destroyedCounter.length > 0) {
        planets.destroyedCounter.sort((a, b) => a.localeCompare(b)).forEach(element => result += `-> ${element}\n`);
    }

    return result;
}

// console.log(star_enigmaV1(['2', 'STCDoghudd4=63333$D$0A53333', 'EHfsytsnhf?8555&I&2C9555SR']));