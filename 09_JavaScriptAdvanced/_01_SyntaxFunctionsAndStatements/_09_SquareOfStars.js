function square_of_starsV1(num){
    let result = "";

    for (let i = 0; i < num; i++) {
        for (let j = 0; j < num; j++) {
            result += '* ';
        }

        result += `\n`;
    }

    return result;
}
