function loginV1(input){
    let username = input.shift();
    let password = username.split('').reverse().join("");
    let counter = 0;
    let result = "";

    while (counter <= 3){
        let current = input.shift();

        if(current === password){
            result += `User ${username} logged in.`
            break;
        }

        counter < 3 ? result += `Incorrect password. Try again.\n` : result += `User ${username} blocked!`;
        counter++;
    }

    return result;
}

const loginV2 = function(input){
    let username = input.shift();
    let password = username.split('').reverse().join("");
    let counter = 0;
    let result = "";

    while (counter <= 3){
        let current = input.shift();

        if(current === password){
            result += `User ${username} logged in.`
            break;
        }

        counter < 3 ? result += `Incorrect password. Try again.\n` : result += `User ${username} blocked!`;
        counter++;
    }

    return result;
}

const loginV3 = (input) => {
    let username = input.shift();
    let password = username.split('').reverse().join("");
    let counter = 0;
    let result = "";

    while (counter <= 3){
        let current = input.shift();

        if(current === password){
            result += `User ${username} logged in.`
            break;
        }

        counter < 3 ? result += `Incorrect password. Try again.\n` : result += `User ${username} blocked!`;
        counter++;
    }

    return result;
}

// console.log(loginV1(['Acer','login','go','let me in','recA']));