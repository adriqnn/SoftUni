function words_to_uppercaseV1(words){
    let uppercase = String(words).toUpperCase();
    let result = "";

    return  uppercase.match(/\w+/g).join(", ");
}

function words_to_uppercaseV2(words){
    return words.match(/\w+/g).join(", ").toLocaleUpperCase();
}
