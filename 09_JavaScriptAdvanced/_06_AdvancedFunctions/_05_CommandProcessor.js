function command_processorV1(){
    let state = '';

    function append(str){
        state += str;
    }

    function removeStart(n){
        state = state.slice(n);
    }

    function removeEnd(n){
        state = state.slice(0, -n);
    }

    function print(){
        console.log(state);
    }

    return {
        append,
        removeStart,
        removeEnd,
        print
    }
}

function command_processorV2(){
    let state = '';

    return {
        append: (str) => state += str,
        removeStart: (n) => state = state.slice(n),
        removeEnd: (n) => state = state.slice(0, -n),
        print: () => console.log(state)
    }
}
