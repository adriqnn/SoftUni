function biggest_elementV1(arr){
    return arr.flat().reduce((a, v) => {
        if(v > a){
            a = v;
        }

        return a;
    }, -Infinity);
}

function biggest_elementV2(arr){
    return arr.reduce((a, v) => (a = Math.max(...v) > a ? Math.max(...v) : a), -Infinity);
}
