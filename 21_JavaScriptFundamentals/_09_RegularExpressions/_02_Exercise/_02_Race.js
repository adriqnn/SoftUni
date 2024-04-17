function raceV1(input){
    let places = {};
    let winner = { 1: '1st', 2: '2nd', 3: '3rd' };
    let name = input.shift().split(", ");

    input.splice(0, input.length - 1).forEach(e => {
        let racer = e.match(/[A-Za-z]+/g).join("");
        let distance = e.match(/\d/g).map(x => Number(x)).reduce((a, b) => a + b, 0);

        if(name.includes(racer)){
            if (!places.hasOwnProperty(racer)) {
                places[racer] = [];
                places[racer] = 0;
            }

            places[racer] += distance;
        }
    });

    return Object.entries(places).sort((a, b) => b[1] - a[1]).filter((x,i)=> i < 3).map((e, i) =>{
        return `${winner[i + 1]} place: ${e[0]}`;
    }).join("\n");
}

const raceV2 = function(input){
    let places = {};
    let winner = { 1: '1st', 2: '2nd', 3: '3rd' };
    let name = input.shift().split(", ");

    input.splice(0, input.length - 1).forEach(e => {
        let racer = e.match(/[A-Za-z]+/g).join("");
        let distance = e.match(/\d/g).map(x => Number(x)).reduce((a, b) => a + b, 0);

        if(name.includes(racer)){
            if (!places.hasOwnProperty(racer)) {
                places[racer] = [];
                places[racer] = 0;
            }

            places[racer] += distance;
        }
    });

    return Object.entries(places).sort((a, b) => b[1] - a[1]).filter((x,i)=> i < 3).map((e, i) =>{
        return `${winner[i + 1]} place: ${e[0]}`;
    }).join("\n");
}

const raceV3 = (input) => {
    let places = {};
    let winner = { 1: '1st', 2: '2nd', 3: '3rd' };
    let name = input.shift().split(", ");

    input.splice(0, input.length - 1).forEach(e => {
        let racer = e.match(/[A-Za-z]+/g).join("");
        let distance = e.match(/\d/g).map(x => Number(x)).reduce((a, b) => a + b, 0);

        if(name.includes(racer)){
            if (!places.hasOwnProperty(racer)) {
                places[racer] = [];
                places[racer] = 0;
            }

            places[racer] += distance;
        }
    });

    return Object.entries(places).sort((a, b) => b[1] - a[1]).filter((x,i)=> i < 3).map((e, i) =>{
        return `${winner[i + 1]} place: ${e[0]}`;
    }).join("\n");
}

// console.log(raceV1(['George, Peter, Bill, Tom', 'G4e@55or%6g6!68e!!@ ', 'R1@!3a$y4456@', 'B5@i@#123ll', 'G@e54o$r6ge#', '7P%et^#e5346r', 'T$o553m&6', 'end of race']));
