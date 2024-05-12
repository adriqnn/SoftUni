function list_of_namesV1(arr){
    return arr.sort((a, b) => a.localeCompare(b)).map((e, i) => `${i + 1}.${e}`).join("\n");
}

function list_of_namesV2(arr){
    let sorted = arr.sort((a, b) => a.localeCompare(b));
    let result = "";

    for (let i = 0; i < sorted.length; i++) {
        result += `${i+1}.${sorted[i]}\n`
    }

    return result;
}

function list_of_namesV3(arr){
    arr = arr.sort((a, b) => a.localeCompare(b));
    return arr.map((e, i) => `${i + 1}.${e}`).join("\n");
}
