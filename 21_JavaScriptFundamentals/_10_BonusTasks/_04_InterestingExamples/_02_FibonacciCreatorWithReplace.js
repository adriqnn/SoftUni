function get_fibonacci_creator(){
    let x = 0;
    let y = 1;
    let z = 0;

    return function get_next(){
        [z, x, y] = [x, y, x + y];

        return z;
    };
}

const fib = get_fibonacci_creator();

console.log(fib());
console.log(fib());
console.log(fib());
console.log(fib());