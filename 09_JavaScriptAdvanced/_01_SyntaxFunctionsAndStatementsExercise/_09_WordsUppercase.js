function words_to_uppercaseV1(words){
    let uppercase = String(words).toUpperCase();
    let result = "";

    //let wordsInArray = upper.replace(/([ .,;:!?]+)/g,'*$#').split('*$#');
    //wordsInArray = wordsInArray.filter(function(e){return e});
    //let string = wordsInArray.toString().replace(/(,)/g,', ');

    return  uppercase.match(/\w+/g).join(", ");
}

function words_to_uppercaseV2(words){
    return words.match(/\w+/g).join(", ").toLocaleUpperCase();
}
