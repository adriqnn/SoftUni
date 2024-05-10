function largest_numberV1(first, second, third){
    return `The largest number is ${Math.max(first, second, third)}.`;
}

function largest_numberV2(...args){
    return `The largest number is ${Math.max(...args)}.`;
}

function largest_numberV3(num1, num2, num3){
    let result;

    if(num1 > num2 && num1 > num3){
        result = num1;
    }else if(num2 > num1 && num2 > num3){
        result = num2;
    }else if(num3 > num2 && num3 > num1){
        result = num3;
    }

    return `The largest number is ${result}.`;
}

function largest_numberV4(...args){
    return `The largest number is ${args.sort((a, b) => b - a)[0]}.`;
}
