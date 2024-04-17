function ascii_sumatorV1(args){
    let min = Math.min(args[0].charCodeAt(0), args[1].charCodeAt(0));
    let max = Math.max(args[0].charCodeAt(0), args[1].charCodeAt(0));
    let sum = 0;

    for (let i = 0; i < args[2].length; i++) {
        let current = args[2].charCodeAt(i);
        if(current > min && current < max){
            sum += current;
        }
    }

    return sum;
}

const ascii_sumatorV2 = function(args){
    let min = Math.min(args[0].charCodeAt(0), args[1].charCodeAt(0));
    let max = Math.max(args[0].charCodeAt(0), args[1].charCodeAt(0));
    let sum = 0;

    for (let i = 0; i < args[2].length; i++) {
        let current = args[2].charCodeAt(i);
        if(current > min && current < max){
            sum += current;
        }
    }

    return sum;
}

const ascii_sumatorV3 = (args) => {
    let min = Math.min(args[0].charCodeAt(0), args[1].charCodeAt(0));
    let max = Math.max(args[0].charCodeAt(0), args[1].charCodeAt(0));
    let sum = 0;

    for (let i = 0; i < args[2].length; i++) {
        let current = args[2].charCodeAt(i);
        if(current > min && current < max){
            sum += current;
        }
    }

    return sum;
}


// console.log(ascii_sumatorV1(['.', '@', 'dsg12gr5653feee5']));
// console.log(ascii_sumatorV1(['?', 'E', '@ABCEF']));
