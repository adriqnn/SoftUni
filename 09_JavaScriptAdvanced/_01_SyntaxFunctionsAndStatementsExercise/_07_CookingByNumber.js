function cooking(number,command1,command2,command3,command4,command5){
    let n = +number;

    let chop = x => x/2;
    let dice = x => Math.sqrt(x);
    let sprice = x => x+1;
    let bake = x => x*3;
    let fillet = x => x*0.8;

    let commandList = [command1,command2,command3,command4,command5];

    for(let i=0; i<commandList.length; i++){
        switch (commandList[i]) {
            case 'chop':
                number = chop(number);
                break;
            case 'dice':
                number = dice(number);
                break;
            case 'spice':
                number = sprice(number);
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
        console.log(number);
    }
}