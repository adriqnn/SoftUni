function triangle_of_numbersV1(number){
    let triangle = "";

    for (let i = 1; i <= number; i++) {
        for (let j = 1; j <= i; j++) {
            triangle += `${i} `;
        }

        triangle += "\n";
    }

    return triangle;
}

const triangle_of_numbersV2 = function(number){
    let triangle = "";

    for (let i = 1; i <= number; i++) {
        for (let j = 1; j <= i; j++) {
            triangle += `${i} `;
        }

        triangle += "\n";
    }

    return triangle;
}

const triangle_of_numbersV3 = (number) => {
    let triangle = "";

    for (let i = 1; i <= number; i++) {
        for (let j = 1; j <= i; j++) {
            triangle += `${i} `;
        }

        triangle += "\n";
    }

    return triangle;
}

// console.log(triangle_of_numbersV3(3));