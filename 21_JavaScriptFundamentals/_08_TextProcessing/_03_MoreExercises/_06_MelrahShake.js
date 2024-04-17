function melrah_shakeV1(input){
    let string = input[0];
    let pattern = input[1];
    let result = "";

    while(pattern.length !== 0){
        let firstIndex = string.indexOf(pattern);
        let lastIndex = string.lastIndexOf(pattern);

        if(firstIndex > -1 && lastIndex > -1 && firstIndex !== lastIndex){
            let firstPart = string.substring(0, firstIndex);
            let lastPart = string.substring(firstIndex + pattern.length);
            string = firstPart + lastPart;

            lastIndex = string.lastIndexOf(pattern);
            firstPart = string.substring(0, lastIndex);
            lastPart = string.substring(lastIndex + pattern.length);
            string = firstPart + lastPart;

            let pat1 = pattern.substring(0, pattern.length / 2);
            let pat2 = pattern.substring(pattern.length / 2 + 1);
            pattern = pat1 + pat2;

            result += `Shaked it.\n`;
        } else {
            break;
        }
    }

    return result + `No shake.\n${string}`;
}

const melrah_shakeV2 = function(input){
    let string = input[0];
    let pattern = input[1];
    let result = "";

    while(pattern.length !== 0){
        let firstIndex = string.indexOf(pattern);
        let lastIndex = string.lastIndexOf(pattern);

        if(firstIndex > -1 && lastIndex > -1 && firstIndex !== lastIndex){
            let firstPart = string.substring(0, firstIndex);
            let lastPart = string.substring(firstIndex + pattern.length);
            string = firstPart + lastPart;

            lastIndex = string.lastIndexOf(pattern);
            firstPart = string.substring(0, lastIndex);
            lastPart = string.substring(lastIndex + pattern.length);
            string = firstPart + lastPart;

            let pat1 = pattern.substring(0, pattern.length / 2);
            let pat2 = pattern.substring(pattern.length / 2 + 1);
            pattern = pat1 + pat2;

            result += `Shaked it.\n`;
        } else {
            break;
        }
    }

    return result + `No shake.\n${string}`;
}

const melrah_shakeV3 = (input) => {
    let string = input[0];
    let pattern = input[1];
    let result = "";

    while(pattern.length !== 0){
        let firstIndex = string.indexOf(pattern);
        let lastIndex = string.lastIndexOf(pattern);

        if(firstIndex > -1 && lastIndex > -1 && firstIndex !== lastIndex){
            let firstPart = string.substring(0, firstIndex);
            let lastPart = string.substring(firstIndex + pattern.length);
            string = firstPart + lastPart;

            lastIndex = string.lastIndexOf(pattern);
            firstPart = string.substring(0, lastIndex);
            lastPart = string.substring(lastIndex + pattern.length);
            string = firstPart + lastPart;

            let pat1 = pattern.substring(0, pattern.length / 2);
            let pat2 = pattern.substring(pattern.length / 2 + 1);
            pattern = pat1 + pat2;

            result += `Shaked it.\n`;
        } else {
            break;
        }
    }

    return result + `No shake.\n${string}`;
}