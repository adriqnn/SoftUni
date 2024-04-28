function get_fibonacci_creator(){
    return (function (){
        const next = this.prev + this.curr;
        this.prev = this.curr;
        this.curr = next;

        return this.prev;
    }).bind({
        prev: 0,
        curr: 1
    });
}


let fib = get_fibonacci_creator();

console.log(fib());
console.log(fib());
console.log(fib());
console.log(fib());
console.log(fib());