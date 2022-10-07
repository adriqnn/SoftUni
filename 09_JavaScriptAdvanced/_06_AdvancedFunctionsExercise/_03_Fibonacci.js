function getFibonator(){
    let prev = 0;
    let curr = 1;
    
    return function(){
        const next = prev + curr;
        prev = curr;
        curr = next;
        return prev;
    }
}

function getFibonatorv2(){
    return (function() {
        const next = this.prev + this.curr;
        this.prev = this.curr;
        this.curr = next;
        return this.prv;
    }).bing({
        prev: 0,
        curr: 1
    });
}