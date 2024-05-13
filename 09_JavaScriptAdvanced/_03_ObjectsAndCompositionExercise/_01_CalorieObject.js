function calorie_objectV1(arr){
    let products = {};

    for (let i = 0; i < arr.length; i += 2) {
        products[arr[i]] = Number(arr[i + 1]);
    }

    return products;
}

function calorie_objectV2(input){
    const calories = {};

    for (let i = 0; i < input.length - 1; i += 2) {
        let item = input[i];
        let amount = input[i + 1];

        calories[item] = Number(amount);
    }

    return calories;
}

function calorie_objectV3(arr){
    return arr.reduce((a, v, i) => {
        if(i % 2 === 0){
            a[v] = Number(arr[i + 1]);
        }

        return a;
    }, {});
}
