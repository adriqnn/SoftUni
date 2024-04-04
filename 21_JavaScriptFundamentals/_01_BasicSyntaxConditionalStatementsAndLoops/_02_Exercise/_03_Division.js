function divisionV1(num){
    let division = 0;
    const divisors = [2, 3, 6, 7, 10];

    divisors.forEach(x => {
        if(num % x === 0){
            division = x;
        }
    });

    return division !== 0 ? `The number is divisible by ${division}` : "Not divisible";
}

const divisionV2 = function(num){
    let division = 0;
    const divisors = [2, 3, 6, 7, 10];

    divisors.forEach(x => {
        if(num % x === 0){
            division = x;
        }
    });

    return division !== 0 ? `The number is divisible by ${division}` : "Not divisible";
}

const divisionV3 = (num) => {
    let division = 0;
    const divisors = [2, 3, 6, 7, 10];

    divisors.forEach(x => {
        if(num % x === 0){
            division = x;
        }
    });

    return division !== 0 ? `The number is divisible by ${division}` : "Not divisible";
}
