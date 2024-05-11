function process_odd_positionsV1(arr){
    return arr.filter((e, i) => i % 2 !== 0).map(e => Number(e) * 2).reverse().join(" ");
}

function process_odd_positionsV2(arr){
    const odd = arr.filter((e, i) => i % 2);
    const doubled = odd.map(e => e * 2);

    return doubled.reverse().join(" ");
}

function process_odd_positionsV3(arr){
    const odd = arr.filter((e, i) => i % 2 !== 0);
    const doubled = odd.map(e => e * 2);

    return doubled.reverse().join(" ");
}
