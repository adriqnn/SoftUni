function print_dnaV1(number){
    let str = "ATCGTTAGGG";
    let counter = 0;
    let result = ``;

    for (let i = 0; i < number; i++) {
        if(i % 4 === 0){
            result += `**${str.charAt(counter++ % 10)}${str.charAt(counter++ % 10)}**\n`;
        }else if(i % 2 === 1){
            result += `*${str.charAt(counter++ % 10)}--${str.charAt(counter++ % 10)}*\n`;
        }else if(i % 4 === 2){
            result += `${str.charAt(counter++ % 10)}----${str.charAt(counter++ % 10)}\n`;
        }
    }

    return result;
}

const print_dnaV2 = function(number){
    let str = "ATCGTTAGGG";
    let counter = 0;
    let result = ``;

    for (let i = 0; i < number; i++) {
        if(i % 4 === 0){
            result += `**${str.charAt(counter++ % 10)}${str.charAt(counter++ % 10)}**\n`;
        }else if(i % 2 === 1){
            result += `*${str.charAt(counter++ % 10)}--${str.charAt(counter++ % 10)}*\n`;
        }else if(i % 4 === 2){
            result += `${str.charAt(counter++ % 10)}----${str.charAt(counter++ % 10)}\n`;
        }
    }

    return result;
}

const print_dnaV3 = (number) => {
    let str = "ATCGTTAGGG";
    let counter = 0;
    let result = ``;

    for (let i = 0; i < number; i++) {
        if(i % 4 === 0){
            result += `**${str.charAt(counter++ % 10)}${str.charAt(counter++ % 10)}**\n`;
        }else if(i % 2 === 1){
            result += `*${str.charAt(counter++ % 10)}--${str.charAt(counter++ % 10)}*\n`;
        }else if(i % 4 === 2){
            result += `${str.charAt(counter++ % 10)}----${str.charAt(counter++ % 10)}\n`;
        }
    }

    return result;
}

// console.log(print_dnaV1(4));
// console.log(print_dnaV1(10));