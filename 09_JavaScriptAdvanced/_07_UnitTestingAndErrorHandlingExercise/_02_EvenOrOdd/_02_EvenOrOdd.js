function even_or_oddV1(string){
    if (typeof(string) !== 'string'){
        return undefined;
    }

    if (string.length % 2 === 0){
        return "even";
    }

    return "odd";
}

export { even_or_oddV1 };
