function winning_ticketV1(input){
    let tickets = input.split(/\s*,\s*/g);
    let result = "";

    for (const e of tickets){
        let ticketLength = e.length;

        if(ticketLength !== 20){
            result += `invalid ticket\n`;
            continue;
        }

        let pattern = /(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\k<ch>{6,}).*(?<=.{10})\k<match>.*/;
        let match = pattern.exec(e);

        if (match === null) {
            result += `ticket "${e}" - no match\n`;
        }else{
            let matchingSymbol = match[1].substring(0, 1);
            let matchingSymbolLength = match[2].length;
            if (matchingSymbolLength < 10) {
                result += `ticket "${e}" - ${matchingSymbolLength}${matchingSymbol}\n`;
            }

            if (matchingSymbolLength === 10) {
                result += `ticket "${e}" - ${matchingSymbolLength}${matchingSymbol} Jackpot!\n`;
            }
        }
    }

    return result;
}

const winning_ticketV2 = function(input){
    let tickets = input.split(/\s*,\s*/g);
    let result = "";

    for (const e of tickets){
        let ticketLength = e.length;

        if(ticketLength !== 20){
            result += `invalid ticket\n`;
            continue;
        }

        let pattern = /(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\k<ch>{6,}).*(?<=.{10})\k<match>.*/;
        let match = pattern.exec(e);

        if (match === null) {
            result += `ticket "${e}" - no match\n`;
        }else{
            let matchingSymbol = match[1].substring(0, 1);
            let matchingSymbolLength = match[2].length;
            if (matchingSymbolLength < 10) {
                result += `ticket "${e}" - ${matchingSymbolLength}${matchingSymbol}\n`;
            }

            if (matchingSymbolLength === 10) {
                result += `ticket "${e}" - ${matchingSymbolLength}${matchingSymbol} Jackpot!\n`;
            }
        }
    }

    return result;
}

const winning_ticketV3 = (input) => {
    let tickets = input.split(/\s*,\s*/g);
    let result = "";

    for (const e of tickets){
        let ticketLength = e.length;

        if(ticketLength !== 20){
            result += `invalid ticket\n`;
            continue;
        }

        let pattern = /(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\k<ch>{6,}).*(?<=.{10})\k<match>.*/;
        let match = pattern.exec(e);

        if (match === null) {
            result += `ticket "${e}" - no match\n`;
        }else{
            let matchingSymbol = match[1].substring(0, 1);
            let matchingSymbolLength = match[2].length;
            if (matchingSymbolLength < 10) {
                result += `ticket "${e}" - ${matchingSymbolLength}${matchingSymbol}\n`;
            }

            if (matchingSymbolLength === 10) {
                result += `ticket "${e}" - ${matchingSymbolLength}${matchingSymbol} Jackpot!\n`;
            }
        }
    }

    return result;
}

// console.log(winning_ticketV1('$$$$$$$$$$$$$$$$$$$$, aabb  , th@@@@@@eemo@@@@@@ey'));