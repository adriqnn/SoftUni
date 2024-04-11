function list_of_productsV1(array){
    return array.sort().map((e, i )=> `${i + 1}.${e}\n`).join("");
}

const list_of_productsV2 = function(array){
    return array.sort((a, b) => a.localeCompare(b)).map((e, i )=> `${i + 1}.${e}\n`).join("");
}

const list_of_productsV3 = (array) => {
    return array.sort((a, b) => a.localeCompare(b)).map((e, i )=> `${i + 1}.${e}\n`).join("");
}