function softuni_bar_incomeV1(input){
    let totalPrice = 0;
    let regex = /%(?<name>[A-Z][a-z]*)%.*<(?<product>\w+)>.*?\|(?<quantity>\d+)\|.*?(?<price>-?\d+([\|\$\%\.]\d+)?)\$/;

    let result = input.slice(0, input.length - 1).filter(e => regex.exec(e) !== null).map((e, i) => {
        let matches = regex.exec(e);
        let sum = matches.groups.quantity * matches.groups.price;
        totalPrice += sum;
        return `${matches[1]}: ${matches[2]} - ${sum.toFixed(2)}`;
    }).join("\n");

    return result + `\nTotal income: ${totalPrice.toFixed(2)}`;
}

const softuni_bar_incomeV2 = function(input){
    let totalPrice = 0;
    let regex = /%(?<name>[A-Z][a-z]*)%.*<(?<product>\w+)>.*?\|(?<quantity>\d+)\|.*?(?<price>-?\d+([\|\$\%\.]\d+)?)\$/;

    let result = input.slice(0, input.length - 1).filter(e => regex.exec(e) !== null).map((e, i) => {
        let matches = regex.exec(e);
        let sum = matches.groups.quantity * matches.groups.price;
        totalPrice += sum;
        return `${matches[1]}: ${matches[2]} - ${sum.toFixed(2)}`;
    }).join("\n");

    return result + `\nTotal income: ${totalPrice.toFixed(2)}`;
}

const softuni_bar_incomeV3 = (input) => {
    let totalPrice = 0;
    let regex = /%(?<name>[A-Z][a-z]*)%.*<(?<product>\w+)>.*?\|(?<quantity>\d+)\|.*?(?<price>-?\d+([\|\$\%\.]\d+)?)\$/;

    let result = input.slice(0, input.length - 1).filter(e => regex.exec(e) !== null).map((e, i) => {
        let matches = regex.exec(e);
        let sum = matches.groups.quantity * matches.groups.price;
        totalPrice += sum;
        return `${matches[1]}: ${matches[2]} - ${sum.toFixed(2)}`;
    }).join("\n");

    return result + `\nTotal income: ${totalPrice.toFixed(2)}`;
}

// console.log(softuni_bar_incomeV1(['%George%<Croissant>|2|10.3$', '%Peter%<Gum>|1|1.3$', '%Maria%<Cola>|1|2.4$', 'end of shift']));
