function sort_an_array_by_2_criteriaV1(arr){
    return arr.sort((a, b) => {
        let result = a.length - b.length;

        if(result === 0){
            result = a.localeCompare(b);
        }

        return result;
    }).join("\n");
}

function sort_an_array_by_2_criteriaV2(arr){
    return  arr.sort(twoCriteriaSort).join("\n");

    function twoCriteriaSort(current, next){
        if(current.length === next.length){
            return current.localeCompare(next);
        }

        return  current.length - next.length;
    }
}

function sort_an_array_by_2_criteriaV3(arr){
    return arr.sort((a, b) => a.length - b.length === 0 ? a.localeCompare(b) : a.length - b.length).join("\n");
}
