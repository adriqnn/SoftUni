function addV1(number){
    let state = number;

    return function add(n){
        return state + n;
    }
}
