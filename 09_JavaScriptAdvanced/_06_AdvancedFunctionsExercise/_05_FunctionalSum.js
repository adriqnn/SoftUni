function functional_sumV1(n){
    const inner = function(a){
        n += a;

        return inner;
    }

    inner.toString = function (){
        return n;
    }

    return inner;
}

function functional_sumV2(n){
    let temp = 0;

    function recursive(e){
        temp += e;

        return recursive;
    }

    recursive.toString = () => temp;
    return recursive(n);
}
