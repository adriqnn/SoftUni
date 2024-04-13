function convert_to_objectV1(obj){
    let o = JSON.parse(obj);
    return Object.entries(o).map(([k, v]) => `${k}: ${v}`).join("\n");
}

const convert_to_objectV2 = function(obj){
    let o = JSON.parse(obj);
    return Object.entries(o).map(([k, v]) => `${k}: ${v}`).join("\n");
}

const convert_to_objectV3 = (obj) => {
    let o = JSON.parse(obj);
    return Object.entries(o).map(([k, v]) => `${k}: ${v}`).join("\n");
}