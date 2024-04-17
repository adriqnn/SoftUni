function match_datesV1(input){
    let path = /\b(?<day>\d{2})([\/.-])(?<month>[A-Z][a-z]{2})\2(?<year>\d{4})\b/g;
    let result = input.shift().matchAll(path);

    let out = ""
    for (let date of result) {
        out += `Day: ${date.groups.day}, Month: ${date.groups.month}, Year: ${date.groups.year}\n`;
    }

    return out;
}

const match_datesV2 = function(input){
    let path = /\b(?<day>\d{2})([\/.-])(?<month>[A-Z][a-z]{2})\2(?<year>\d{4})\b/g;
    let result = input.shift().matchAll(path);

    let out = ""
    for (let date of result) {
        out += `Day: ${date.groups.day}, Month: ${date.groups.month}, Year: ${date.groups.year}\n`;
    }

    return out;
}

const match_datesV3 = (input) => {
    let path = /\b(?<day>\d{2})([\/.-])(?<month>[A-Z][a-z]{2})\2(?<year>\d{4})\b/g;
    let result = input.shift().matchAll(path);

    let out = ""
    for (let date of result) {
        out += `Day: ${date.groups.day}, Month: ${date.groups.month}, Year: ${date.groups.year}\n`;
    }

    return out;
}

// console.log(match_datesV1(['13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016']));