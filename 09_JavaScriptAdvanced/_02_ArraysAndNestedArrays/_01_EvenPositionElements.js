function even_position_elementV1(arr){
    return arr.reduce((a, v, i) => i % 2 === 0 ? a + v + " " : a, "");
}

function even_position_elementV2(arr){
    return arr.filter((e, i) => i % 2 === 0).join(" ");
}

function even_position_elementV3(arr){
    let result = "";

    for (let i = 0; i < arr.length; i++) {
        if(i % 2 === 0){
            result += arr[i] + " ";
        }
    }
    
    return result;
}
