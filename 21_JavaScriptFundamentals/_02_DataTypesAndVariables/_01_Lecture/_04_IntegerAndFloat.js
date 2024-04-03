function integer_and_floatV1(num1, num2, num3){
    let sum = num1 + num2 + num3;
    let result =  sum % 1 === 0 ? `${sum} - Integer` : `${sum} - Float`;
    console.log(result);
}

const integer_and_floatV2 = function(num1, num2, num3){
    let sum = num1 + num2 + num3;
    let result =  sum % 1 === 0 ? `${sum} - Integer` : `${sum} - Float`;
    console.log(result);
}

const integer_and_floatV3 = (num1, num2, num3) => {
    let sum = num1 + num2 + num3;
    let result =  sum % 1 === 0 ? `${sum} - Integer` : `${sum} - Float`;
    console.log(result);
}