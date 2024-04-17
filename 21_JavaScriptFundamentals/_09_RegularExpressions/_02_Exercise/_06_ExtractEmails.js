function extract_emailsV1(input){
    let regex = /(?<!\S)[A-Za-z]+([\.\-\_]*[a-zA-Z]+)*@[A-Za-z]+([\.\-]*[a-zA-z0-9]+)*(\.([a-zA-z])+)/g;
    return input.match(regex).map(e => e).join("\n");
}

const extract_emailsV2 = function(input){
    let regex = /(?<!\S)[A-Za-z]+([\.\-\_]*[a-zA-Z]+)*@[A-Za-z]+([\.\-]*[a-zA-z0-9]+)*(\.([a-zA-z])+)/g;
    return input.match(regex).map(e => e).join("\n");
}

const extract_emailsV3 = (input) => {
    let regex = /(?<!\S)[A-Za-z]+([\.\-\_]*[a-zA-Z]+)*@[A-Za-z]+([\.\-]*[a-zA-z0-9]+)*(\.([a-zA-z])+)/g;
    return input.match(regex).map(e => e).join("\n");
}