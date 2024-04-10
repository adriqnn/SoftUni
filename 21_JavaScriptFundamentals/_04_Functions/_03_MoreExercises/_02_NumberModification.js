function number_modificationV1(number){
    let sum = 0;
    let n = 0;

    let m = number.toString().split("").map(x => Number(x));
    m.forEach(x => {
        sum += x;
        n++;
    });

    while (sum / n < 5){
        number += "9";
        sum += 9;
        n++
    }

    return `${number}`;
}

const number_modificationV2 = function(number){
    let sum = 0;
    let n = 0;

    let m = number.toString().split("").map(x => Number(x));
    m.forEach(x => {
        sum += x;
        n++;
    });

    while (sum / n < 5){
        number += "9";
        sum += 9;
        n++
    }

    return `${number}`;
}

const number_modificationV3 = (number) => {
    let sum = 0;
    let n = 0;

    let m = number.toString().split("").map(x => Number(x));
    m.forEach(x => {
        sum += x;
        n++;
    });

    while (sum / n < 5){
        number += "9";
        sum += 9;
        n++
    }

    return `${number}`;
}

// console.log(number_modificationV1(5835));
// console.log(number_modificationV1(101));