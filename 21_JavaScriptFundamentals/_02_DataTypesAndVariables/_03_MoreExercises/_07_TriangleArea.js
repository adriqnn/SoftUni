function triangle_areaV1(a, b, c){
    let s = (a + b + c) / 2;
    let area = Math.sqrt(s *(s -a) * (s - b) * (s - c));

    return area;
}

const triangle_areaV2 = function(a, b, c){
    let s = (a + b + c) / 2;
    let area = Math.sqrt(s *(s -a) * (s - b) * (s - c));

    return area;
}

const triangle_areaV3 = (a, b, c) => {
    let s = (a + b + c) / 2;
    let area = Math.sqrt(s *(s -a) * (s - b) * (s - c));

    return area;
}