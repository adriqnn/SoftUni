function password_validatorV1(password){
    let result = "";

    function isAlphanumeric(inputString) {
        const alphanumericRegex = /^[a-zA-Z0-9]+$/;
        return alphanumericRegex.test(inputString);
    }

    function hasAtLeastTwoDigits(inputString) {
        const digitRegex = /\d/g;
        const digitMatches = inputString.match(digitRegex);
        return digitMatches !== null && digitMatches.length >= 2;
    }

    password.length < 6 || password > 10 ? result += "Password must be between 6 and 10 characters\n" : "";
    !isAlphanumeric(password) ? result += "Password must consist only of letters and digits\n" : "";
    !hasAtLeastTwoDigits(password) ? result += "Password must have at least 2 digits\n" : "";

    return result.length > 0 ? result : "Password is valid";
}

const password_validatorV2 = function(password){
    let result = "";

    function isAlphanumeric(inputString) {
        const alphanumericRegex = /^[a-zA-Z0-9]+$/;
        return alphanumericRegex.test(inputString);
    }

    function hasAtLeastTwoDigits(inputString) {
        const digitRegex = /\d/g;
        const digitMatches = inputString.match(digitRegex);
        return digitMatches !== null && digitMatches.length >= 2;
    }

    password.length < 6 || password > 10 ? result += "Password must be between 6 and 10 characters\n" : "";
    !isAlphanumeric(password) ? result += "Password must consist only of letters and digits\n" : "";
    !hasAtLeastTwoDigits(password) ? result += "Password must have at least 2 digits\n" : "";

    return result.length > 0 ? result : "Password is valid";
}

const password_validatorV3 = (password) => {
    let result = "";

    function isAlphanumeric(inputString) {
        const alphanumericRegex = /^[a-zA-Z0-9]+$/;
        return alphanumericRegex.test(inputString);
    }

    function hasAtLeastTwoDigits(inputString) {
        const digitRegex = /\d/g;
        const digitMatches = inputString.match(digitRegex);
        return digitMatches !== null && digitMatches.length >= 2;
    }

    password.length < 6 || password > 10 ? result += "Password must be between 6 and 10 characters\n" : "";
    !isAlphanumeric(password) ? result += "Password must consist only of letters and digits\n" : "";
    !hasAtLeastTwoDigits(password) ? result += "Password must have at least 2 digits\n" : "";

    return result.length > 0 ? result : "Password is valid";
}

// console.log(password_validatorV1("logIn"));
// console.log(password_validatorV1("MyPass123"));