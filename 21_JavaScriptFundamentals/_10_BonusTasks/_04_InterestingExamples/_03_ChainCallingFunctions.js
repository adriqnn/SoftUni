function chain_sum_function(n){
    const inner = function(a){
        n += a;
        return inner;
    };

    inner.toString = function(){
        return n;
    };

    return inner;
}

console.log(chain_sum_function(1).toString());
console.log(chain_sum_function(1)(6)(-3).toString());

// chain calling example
let sum = a => b => b ? sum(a + b) : a;
console.log(sum(10)(20)(3)(4)());
