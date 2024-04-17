function match_full_nameV1(list){
    return list.match(/\b([A-Z][a-z]+ [A-Z][a-z]+)\b/g).join(" ");
}

const match_full_nameV2 = function(list){
    let regexName = /\b([A-Z][a-z]+ [A-Z][a-z]+)\b/g;
    return list.match(regexName).join(" ");
}

const match_full_nameV3 = (list) => {
    let regexName = /\b([A-Z][a-z]+ [A-Z][a-z]+)\b/g;
    return list.match(regexName).join(" ");
}

// console.log(match_full_nameV1("Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Test Testov, Ivan	Ivanov"));