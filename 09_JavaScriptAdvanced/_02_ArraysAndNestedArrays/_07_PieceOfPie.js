function piece_of_pieV1(arr, pie1, pie2){
    let pieOneIndexStart = arr.indexOf(pie1);
    let pieTwoIndexEnd = arr.indexOf(pie2) + 1;

    return arr.slice(pieOneIndexStart, pieTwoIndexEnd);
}

function piece_of_pieV2(arr, p1, p2){
    return arr.slice(arr.indexOf(p1), arr.indexOf(p2) + 1);
}
