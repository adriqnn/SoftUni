function words(words){
    let upper = String(words).toUpperCase();
    //let wordsInArray = upper.replace(/([ .,;:!?]+)/g,'*$#').split('*$#');
    //wordsInArray = wordsInArray.filter(function(e){return e});
    //let string = wordsInArray.toString().replace(/(,)/g,', ');
    console.log(upper.match(/\w+/g).join(', '));
}