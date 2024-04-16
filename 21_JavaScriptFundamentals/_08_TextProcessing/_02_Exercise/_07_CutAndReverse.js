function cut_and_reverseV1(string){
    let firstHalf = string.slice(0, string.length / 2).split("").reverse().join("");
    let secondHalf = string.slice(string.length / 2).split("").reverse().join("");

    return `${firstHalf}\n${secondHalf}`;
}

const cut_and_reverseV2 = function(string){
    let firstHalf = string.slice(0, string.length / 2).split("").reverse().join("");
    let secondHalf = string.slice(string.length / 2).split("").reverse().join("");

    return `${firstHalf}\n${secondHalf}`;
}

const cut_and_reverseV3 = (string) => {
    let firstHalf = string.slice(0, string.length / 2).split("").reverse().join("");
    let secondHalf = string.slice(string.length / 2).split("").reverse().join("");

    return `${firstHalf}\n${secondHalf}`;
}

// console.log(cut_and_reverseV1('tluciffiDsIsihTgnizamAoSsIsihT'));