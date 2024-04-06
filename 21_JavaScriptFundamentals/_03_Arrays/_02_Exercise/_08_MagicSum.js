function magic_sumV1(array, num){
    let result = "";

    for (let i = 0; i < array.length - 1; i++) {
        for (let j = i + 1; j < array.length; j++) {
            array[i] + array[j] === num ? result += `${array[i]} ${array[j]}\n` : result += "";
        }
    }

    return result;
}

const magic_sumV2 = function(array, num){
    let result = "";

    for (let i = 0; i < array.length - 1; i++) {
        for (let j = i + 1; j < array.length; j++) {
            array[i] + array[j] === num ? result += `${array[i]} ${array[j]}\n` : result += "";
        }
    }

    return result;
}

const magic_sumV3 = (array, num) => {
    let result = "";

    for (let i = 0; i < array.length - 1; i++) {
        for (let j = i + 1; j < array.length; j++) {
            array[i] + array[j] === num ? result += `${array[i]} ${array[j]}\n` : result += "";
        }
    }

    return result;
}