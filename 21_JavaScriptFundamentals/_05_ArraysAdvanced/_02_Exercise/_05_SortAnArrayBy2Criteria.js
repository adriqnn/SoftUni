function sort_an_array_by_2_criteriaV1(array){
    return array.sort((a, b) => {
        return a.length - b.length !== 0 ? a.length - b.length : a.localeCompare(b);
    }).join("\n");
}

const sort_an_array_by_2_criteriaV2 = function(array){
    return array.sort((a, b) => {
        let sort = a.length - b.length;

        if(sort === 0){
            sort = a.localeCompare(b);
        }

        return sort;
    }).join("\n");
}

const sort_an_array_by_2_criteriaV3 = (array) => {
    return array.sort((a, b) => {
        let sort = a.length - b.length;

        if(sort === 0){
            sort = a.localeCompare(b);
        }

        return sort;
    }).join("\n");
}