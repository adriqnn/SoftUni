function fibonacciV1(){
    let prev = 0;
    let curr = 1;

    return function(){
        const next = prev + curr;

        prev = curr;
        curr = next;

        return prev;
    }
}

function fibonacciV2(){
    return (function() {
        const next = this.prev + this.curr;

        this.prev = this.curr;
        this.curr = next;

        return this.prev;
    }).bind({
        prev: 0,
        curr: 1
    });
}

function fibonacciV3() {
    let nums = [0, 0];

    return () => {
        const result = nums[0] + nums[1];
        nums = [nums[1], nums[1] + nums[0] || 1];
        
        return result || 1;
    }
}
