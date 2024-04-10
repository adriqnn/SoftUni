function factorial_divisionV1(number1, number2){
    function factorialIterative(n) {
        if (n < 0) {
            return null;
        }

        let result = 1;
        for (let i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    return (factorialIterative(number1) / factorialIterative(number2)).toFixed(2);
}

const factorial_divisionV2 = function(number){
    function factorialIterative(n) {
        if (n < 0) {
            return null;
        }

        let result = 1;
        for (let i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    return (factorialIterative(number1) / factorialIterative(number2)).toFixed(2);
}

const factorial_divisionV3 = (number) => {
    function factorialIterative(n) {
        if (n < 0) {
            return null;
        }

        let result = 1;
        for (let i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    return (factorialIterative(number1) / factorialIterative(number2)).toFixed(2);
}