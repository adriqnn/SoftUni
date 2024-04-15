function odd_occurrencesV1(input){
    let occurrences = {};

    input.split(" ").forEach(e => {
        let el = e.toLowerCase();
        if(!occurrences.hasOwnProperty(el)){
            occurrences[el] = 0;
        }

        occurrences[el] = occurrences[el] + 1;
    });

    return Object.entries(occurrences).filter(e => e[1] % 2 !== 0).map(e => `${e[0]}`).join(" ");
}

const odd_occurrencesV2 = function(input){
    let occurrences = {};

    input.split(" ").forEach(e => {
        let el = e.toLowerCase();
        if(!occurrences.hasOwnProperty(el)){
            occurrences[el] = 0;
        }

        occurrences[el] = occurrences[el] + 1;
    });

    return Object.entries(occurrences).filter(e => e[1] % 2 !== 0).map(e => `${e[0]}`).join(" ");
}

const odd_occurrencesV3 = (input) => {
    let occurrences = {};

    input.split(" ").forEach(e => {
        let el = e.toLowerCase();
        if(!occurrences.hasOwnProperty(el)){
            occurrences[el] = 0;
        }

        occurrences[el] = occurrences[el] + 1;
    });

    return Object.entries(occurrences).filter(e => e[1] % 2 !== 0).map(e => `${e[0]}`).join(" ");
}

// console.log(odd_occurrencesV1('Java C# Php PHP Java PhP 3 C# 3 1 5 C#'));