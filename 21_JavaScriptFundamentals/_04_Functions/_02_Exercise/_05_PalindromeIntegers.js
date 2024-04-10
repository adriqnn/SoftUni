function palindrome_integersV1(array){
    let result = "";

    for (let i = 0; i < array.length; i++) {
        let normal = array[i].toString();
        let reversed = normal.split("").reverse().join("");

        normal === reversed ? result += `true\n` : result += `false\n`;
    }

    return result;
}

const palindrome_integersV2 = function(array){
    let result = "";

    for (let i = 0; i < array.length; i++) {
        let normal = array[i].toString();
        let reversed = normal.split("").reverse().join("");

        normal === reversed ? result += `true\n` : result += `false\n`;
    }

    return result;
}

const palindrome_integersV3 = (array) => {
    let result = "";

    for (let i = 0; i < array.length; i++) {
        let normal = array[i].toString();
        let reversed = normal.split("").reverse().join("");

        normal === reversed ? result += `true\n` : result += `false\n`;
    }

    return result;
}

// console.log(palindrome_integersV1([123, 323, 421, 121]));