function numbersV1(array1, array2){
    for (let i = 0; i < array1.length; i++) {
        if(array1[i] === array2[0]){
            array1.splice(i - array2[1] > 0 ? i - array2[1] : 0, array2[1] * 2 + 1);
            i = 0;
        }
    }

    return(array1.reduce((a, v) => a + v, 0));
}

const numbersV2 = function(array){
    let numbersList = array1;
    let numbersArray = array2;

    let number = numbersArray[0];
    let power = numbersArray[1];

    for (let i = 0; i < numbersList.length; i++) {
        if(numbersList[i] === number){
            numbersList = removeNumbersFromListWithPower(numbersList, i, power);
            i--;
        }
    }

    function removeNumbersFromListWithPower(numbersList, i, power) {
        let newList = [];

        if(i + power >= numbersList.length - 1 && i - power < 0){
            return newList;
        }else if(i + power >= numbersList.length - 1){
            for (let j = 0; j < i-power; j++) {
                newList.push(numbersList[j]);
            }

            return newList;
        }else if(i - power < 0){
            for (let j = i + power + 1; j < numbersList.length; j++) {
                newList.push(numbersList[j]);
            }

            return newList;
        }else{
            for (let j = 0; j < i - power; j++) {
                newList.push(numbersList[j]);
            }

            for (let j = i + power + 1; j < numbersList.length; j++) {
                newList.push(numbersList[j]);
            }

            return newList;
        }
    }

    return numbersList.reduce((a, v) => a + v, 0);
}

const numbersV3 = (array) => {
    let numbersList = array1;
    let numbersArray = array2;

    let number = numbersArray[0];
    let power = numbersArray[1];

    for (let i = 0; i < numbersList.length; i++) {
        if(numbersList[i] === number){
            numbersList = removeNumbersFromListWithPower(numbersList, i, power);
            i--;
        }
    }

    function removeNumbersFromListWithPower(numbersList, i, power) {
        let newList = [];

        if(i + power >= numbersList.length - 1 && i - power < 0){
            return newList;
        }else if(i + power >= numbersList.length - 1){
            for (let j = 0; j < i-power; j++) {
                newList.push(numbersList[j]);
            }

            return newList;
        }else if(i - power < 0){
            for (let j = i + power + 1; j < numbersList.length; j++) {
                newList.push(numbersList[j]);
            }

            return newList;
        }else{
            for (let j = 0; j < i - power; j++) {
                newList.push(numbersList[j]);
            }

            for (let j = i + power + 1; j < numbersList.length; j++) {
                newList.push(numbersList[j]);
            }

            return newList;
        }
    }

    return numbersList.reduce((a, v) => a + v, 0);
}

// console.log(numbersV1([1, 2, 2, 4, 2, 2, 2, 9], [4, 2]));