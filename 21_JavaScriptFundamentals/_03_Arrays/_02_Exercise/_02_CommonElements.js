function common_elementsV1(arr1, arr2){
    let result = "";

    for (let i = 0; i < arr1.length; i++) {
        let current = arr1[i];
        if(arr2.includes(current)){
            result += `${current}\n`;
        }
    }

    return result;
}

const common_elementsV2 = function(arr1, arr2){
    let result = "";

    for (let i = 0; i < arr1.length; i++) {
        let current = arr1[i];
        if(arr2.includes(current)){
            result += `${current}\n`;
        }
    }

    return result;
}

const common_elementsV3 = (arr1, arr2) => {
    let result = "";

    for (let i = 0; i < arr1.length; i++) {
        let current = arr1[i];
        if(arr2.includes(current)){
            result += `${current}\n`;
        }
    }

    return result;
}

// console.log(common_elementsV1(['Hey', 'hello', 2, 4, 'Peter', 'e'], ['Petar', 10, 'hey', 4, 'hello', '2']));
