function sum_of_numbers_nmV1(...args){
    let [n, m] = args;
    let result = 0;

    for(let i= Number(n); i <= Number(m); i++){
        result += i;
    }

    return result;
}

function sum_of_numbers_nmV2(n, m){
    let result = 0;

    for(let i= Number(n); i <= Number(m); i++){
        result += i;
    }

    return result;
}

function sum_of_numbers_nmV3(n, m){
    [n, m] = [n, m].map(Number);
    let sum = 0;

    for (let i = n; i <= m; i++) {
        sum += i;
    }

    return sum;
}
