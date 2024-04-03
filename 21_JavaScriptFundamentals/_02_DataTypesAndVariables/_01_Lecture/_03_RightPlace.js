function right_placeV1(missing, character, full){
    return missing.replace('_', character) === full ? "Matched" : "Not Matched";
}

const right_placeV2 = function(){
    return missing.replace('_', character) === full ? "Matched" : "Not Matched";
}

const right_placeV3 = () => {
    return missing.replace('_', character) === full ? "Matched" : "Not Matched";
}