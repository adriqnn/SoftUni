function search_for_a_numberV1(array1, array2){
    let numberOfTimes = array1.slice(0, array2[0]).slice(array2[1]).filter(e => e === array2[2]).length;
    return `Number ${array2[2]} occurs ${numberOfTimes} times.`;
}

const search_for_a_numberV2 = function(array1, array2){
    let numberOfTimes = array1.slice(0, array2[0]).slice(array2[1]).filter(e => e === array2[2]).length;
    return `Number ${array2[2]} occurs ${numberOfTimes} times.`;
}

const search_for_a_numberV3 = (array1, array2) => {
    let numberOfTimes = array1.slice(0, array2[0]).slice(array2[1]).filter(e => e === array2[2]).length;
    return `Number ${array2[2]} occurs ${numberOfTimes} times.`;
}

// console.log(search_for_a_numberV1([5, 2, 3, 4, 1, 6], [5, 2, 3]));