function lower_or_upperV1(char){
    return char.charCodeAt(0) < 97 ? "upper-case" : "lower-case";
}

const lower_or_upperV2 = function(char){
    return char.charCodeAt(0) < 97 ? "upper-case" : "lower-case";
}

const lower_or_upperV3 = (char) => {
    return char.charCodeAt(0) < 97 ? "upper-case" : "lower-case";
}