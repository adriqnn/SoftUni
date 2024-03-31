function sum_of_odd_numbersV1(n){
    let sum = 0;

    for (let i = 1; i <= n * 2; i += 2) {
        sum += i;
        console.log(i);
    }

    console.log(`Sum: ${sum}`);
}

const sum_of_odd_numbersV2 = function(n){
    let sum = 0;

    for (let i = 1; i <= n * 2; i += 2) {
        sum += i;
        console.log(i);
    }

    console.log(`Sum: ${sum}`);
}

const sum_of_odd_numbersV3 = (n) => {
    let sum = 0;

    for (let i = 1; i <= n * 2; i += 2) {
        sum += i;
        console.log(i);
    }

    console.log(`Sum: ${sum}`);
}