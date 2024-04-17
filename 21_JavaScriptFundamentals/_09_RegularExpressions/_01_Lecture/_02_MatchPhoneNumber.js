function match_phone_numberV1(input){
    let regexPhone = /\+359([ -])2\1\d{3}\1\d{4}\b/g;
    return input.shift().match(regexPhone).join(", ");
}

const match_phone_numberV2 = function(input){
    let regexPhone = /\+359([ -])2\1\d{3}\1\d{4}\b/g;
    return input.shift().match(regexPhone).join(", ");
}

const match_phone_numberV3 = (input) => {
    let regexPhone = /\+359([ -])2\1\d{3}\1\d{4}\b/g;
    return input.shift().match(regexPhone).join(", ");
}

// console.log(match_phone_numberV1(['+359 2 222 2222, 359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222, +359-2-222-222, +359-2-222-22222 +359-2-222-2222']));