function add_and_subtractV1(number1, number2, number3){
    function add(num1, num2){
        return number1 + number2;
    }

    function subtract(num1, num2){
        return num1 - num2;
    }

    return subtract(add(number1, number2), number3);
}

const add_and_subtractV2 = function(number1, number2, number3){
    function add(num1, num2){
        return number1 + number2;
    }

    function subtract(num1, num2){
        return num1 - num2;
    }

    return subtract(add(number1, number2), number3);
}

const add_and_subtractV3 = (number1, number2, number3) => {
    function add(num1, num2){
        return number1 + number2;
    }

    function subtract(num1, num2){
        return num1 - num2;
    }

    return subtract(add(number1, number2), number3);
}

