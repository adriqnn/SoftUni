function sum_of_numbersV1(arr) {
    let sum = 0;
    for (let num of arr) {
        sum += Number(num);
    }

    return sum;
}

export { sum_of_numbersV1 };