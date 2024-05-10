function string_lengthV1(first, second, third){
    const sum = first.length + second.length + third.length;
    return `${sum}\n${Math.floor(sum / 3)}`;
}

function string_lengthV2(string1, string2, string3){
    const characterCount = string1.length + string2.length + string3.length;
    const average = Math.floor(characterCount / 3);
    return `${characterCount}\n${average}`;
}

function string_lengthV3(...args){
    const [string1, string2, string3] = args;

    const characterCount = string1.length + string2.length + string3.length;
    const average = Math.floor(characterCount / 3);

    return `${characterCount}\n${average}`;
}

function string_lengthV4(...args){
    const characterCount = args.reduce((total, currentString) => total + currentString.length, 0);
    const average = Math.floor(characterCount / args.length);

    return `${characterCount}\n${average}`;
}

function string_lengthV5(...args){
    const length = args.reduce((a, v) => a + v.length, 0);

    return `${length}\n${Math.round(length / args.length)}`;
}
