function print_nth_elementV1(array){
    let nth = array.pop();
    return array.filter((e, i) => i % nth === 0).join(" ");
}

const print_nth_elementV2 = function(array){
    let nth = array.pop();
    return array.filter((e, i) => i % nth === 0).join(" ");
}

const print_nth_elementV3 = (array) => {
    let nth = array.pop();
    return array.filter((e, i) => i % nth === 0).join(" ");
}