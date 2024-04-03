function special_numbersV1(num){
    let result = "";

    for (let i = 1; i <= num; i++) {
        let sum = 0;

        for (let j = 0; j < i.toString().length; j++) {
            sum += Number(i.toString().charAt(j));
        }

        sum === 5 || sum === 7 || sum === 11 ? result += `${i} -> True` : result += `${i} -> False`;
        result += "\n";
    }

    return result;
}

const special_numbersV2 = function(num){
    let result = "";

    for (let i = 1; i <= num; i++) {
        let sum = 0;

        for (let j = 0; j < i.toString().length; j++) {
            sum += Number(i.toString().charAt(j));
        }

        sum === 5 || sum === 7 || sum === 11 ? result += `${i} -> True` : result += `${i} -> False`;
        result += "\n";
    }

    return result;
}

const special_numbersV3 = (num) => {
    let result = "";

    for (let i = 1; i <= num; i++) {
        let sum = 0;

        for (let j = 0; j < i.toString().length; j++) {
            sum += Number(i.toString().charAt(j));
        }

        sum === 5 || sum === 7 || sum === 11 ? result += `${i} -> True` : result += `${i} -> False`;
        result += "\n";
    }

    return result;
}

// console.log(special_numbersV1(15));
