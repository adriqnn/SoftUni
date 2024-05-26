function currency_formatV1(separator, symbol, symbolFirst, formatter){
    return formatter.bind(undefined, separator, symbol, symbolFirst);
}

function currency_formatV2(a, b, c, d){
    return d.bind(undefined, a, b, c);
}
