function cooking_by_numbersV1(...args){
    let n = args.shift();

    let cooking = {
        chop: x => n = x / 2,
        dice: x => n = Math.sqrt(x),
        spice: x => n = x + 1,
        bake: x => n = x * 3,
        fillet: x => n = x * 0.8
    }

    return args.map(e => cooking[e](n)).join("\n");
}

function cooking_by_numbersV2(number, command1, command2, command3, command4, command5){
    let n = +number;
    let result = "";

    let chop = x => x / 2;
    let dice = x => Math.sqrt(x);
    let spice = x => x + 1;
    let bake = x => x * 3;
    let fillet = x => x * 0.8;

    let commandList = [command1, command2, command3, command4, command5];

    for(let i= 0; i < commandList.length; i++){
        switch (commandList[i]) {
            case 'chop':
                number = chop(number);
                break;
            case 'dice':
                number = dice(number);
                break;
            case 'spice':
                number = spice(number);
                break;
            case 'bake':
                number = bake(number);
                break;
            case 'fillet':
                number = fillet(number);
                break;
            default:
                break;
        }

        result += `${number}\n`;
    }

    return result;
}
