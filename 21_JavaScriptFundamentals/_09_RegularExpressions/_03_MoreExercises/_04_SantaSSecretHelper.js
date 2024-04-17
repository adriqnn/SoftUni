function santas_little_helperV1(array){
    let key = array.shift();
    let pattern = /\@(?<name>[A-z]+)[^\@\-\!\:\>]*\!(?<status>[G])\!/g;
    let out = "";

    array.splice(0, array.length - 1).forEach(e => {
        let decode = [...e].map(e => String.fromCharCode(e.charCodeAt(0) - key)).join('');
        let result = [...decode.matchAll(pattern)];

        if (result[0] !== undefined) {
            if (/^/.test(result[0])){
                result = String(result[0][1]).match(/^\w+\b/);
            }

            out += `${result[0]}\n`;
        }
    });

    return out;
}


const santas_little_helperV2 = function(array){
    let key = array.shift();
    let pattern = /\@(?<name>[A-z]+)[^\@\-\!\:\>]*\!(?<status>[G])\!/g;
    let out = "";

    array.splice(0, array.length - 1).forEach(e => {
        let decode = [...e].map(e => String.fromCharCode(e.charCodeAt(0) - key)).join('');
        let result = [...decode.matchAll(pattern)];

        if (result[0] !== undefined) {
            if (/^/.test(result[0])){
                result = String(result[0][1]).match(/^\w+\b/);
            }

            out += `${result[0]}\n`;
        }
    });

    return out;
}

const santas_little_helperV3 = (array) => {
    let key = array.shift();
    let pattern = /\@(?<name>[A-z]+)[^\@\-\!\:\>]*\!(?<status>[G])\!/g;
    let out = "";

    array.splice(0, array.length - 1).forEach(e => {
        let decode = [...e].map(e => String.fromCharCode(e.charCodeAt(0) - key)).join('');
        let result = [...decode.matchAll(pattern)];

        if (result[0] !== undefined) {
            if (/^/.test(result[0])){
                result = String(result[0][1]).match(/^\w+\b/);
            }

            out += `${result[0]}\n`;
        }
    });

    return out;
}

// console.log(santas_little_helperV1(['3', 'CNdwhamigyenumje$J$', 'CEreelh-nmguuejnW$J$', 'CVwdq&gnmjkvng$Q$', 'end']));