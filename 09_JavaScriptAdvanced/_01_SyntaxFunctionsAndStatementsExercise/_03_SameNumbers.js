function same_numbersV1(number){
    let input = String(number);

    let char = input.charAt(0);
    let sum = 0;
    let result = true;

    for (let i = 0; i < input.length; i++) {
        if(char !== input.charAt(i)){
            result = false;
        }

        sum += Number(input.charAt(i));
    }

    return result ? `${result}\n${sum}` : `${result}\n${sum}`;
}

function same_numbersV2(number){
    // convert to string -> let input = number.toString();
    let input = String(number);

    let isSame = true;
    let firstDigit = input[0];
    let sum = 0;

    for(let i = 0;i < input.length;i++){
        if(input[i] !== firstDigit){
            isSame = false;
        }

        // convert to number -> sum += +input[i];
        sum += Number(input[i]);
    }

    return `${isSame}\n${sum}`;
}

function same_numbersV3(number){
    const array = `${number}`.split("");
    return `${array.every((x, i, arr) => arr.slice(i).every(y => x === y))}\n${array.map(Number).reduce((a, v) => a + v, 0)}`;
}
