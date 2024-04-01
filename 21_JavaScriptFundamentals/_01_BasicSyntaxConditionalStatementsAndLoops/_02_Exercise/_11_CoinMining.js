function bitcoin_miningV1(array){
    let income = 0;
    let length = array.length;
    let goldGramPrice = 67.51;
    let coinPrice = 11949.16;
    let firstPurchase = 0;
    let coins = 0;

    for (let i = 1; i <= length; i++) {
        if(i % 3 === 0){
            income += array[i-1] * 0.7 * goldGramPrice;
        }else{
            income += array[i-1] * goldGramPrice;
        }

        const current = Math.floor(income / coinPrice);
        if(income >= coinPrice && firstPurchase === 0){
            income -= coinPrice * current;
            coins += current;
            firstPurchase = i;
        }else if(income >= coinPrice){
            income -= coinPrice * current;
            coins += current;
        }
    }

    return `Bought bitcoins: ${coins}\n${firstPurchase !== 0 ? `Day of the first purchased bitcoin: ${firstPurchase}\n` : ``}Left money: ${income.toFixed(2)} lv.`;
}

const bitcoin_miningV2 = function (array){
    let income = 0;
    let length = array.length;
    let goldGramPrice = 67.51;
    let coinPrice = 11949.16;
    let firstPurchase = 0;
    let coins = 0;

    for (let i = 1; i <= length; i++) {
        if(i % 3 === 0){
            income += array[i-1] * 0.7 * goldGramPrice;
        }else{
            income += array[i-1] * goldGramPrice;
        }

        const current = Math.floor(income / coinPrice);
        if(income >= coinPrice && firstPurchase === 0){
            income -= coinPrice * current;
            coins += current;
            firstPurchase = i;
        }else if(income >= coinPrice){
            income -= coinPrice * current;
            coins += current;
        }
    }

    return `Bought bitcoins: ${coins}\n${firstPurchase !== 0 ? `Day of the first purchased bitcoin: ${firstPurchase}\n` : ``}Left money: ${income.toFixed(2)} lv.`;
}

const bitcoin_miningV3 = (array) => {
    let income = 0;
    let length = array.length;
    let goldGramPrice = 67.51;
    let coinPrice = 11949.16;
    let firstPurchase = 0;
    let coins = 0;

    for (let i = 1; i <= length; i++) {
        if(i % 3 === 0){
            income += array[i-1] * 0.7 * goldGramPrice;
        }else{
            income += array[i-1] * goldGramPrice;
        }

        const current = Math.floor(income / coinPrice);
        if(income >= coinPrice && firstPurchase === 0){
            income -= coinPrice * current;
            coins += current;
            firstPurchase = i;
        }else if(income >= coinPrice){
            income -= coinPrice * current;
            coins += current;
        }
    }

    return `Bought bitcoins: ${coins}\n${firstPurchase !== 0 ? `Day of the first purchased bitcoin: ${firstPurchase}\n` : ``}Left money: ${income.toFixed(2)} lv.`;
}

// console.log(bitcoin_miningV1([100, 200, 300]));
// console.log(bitcoin_miningV1([3124.15, 504.212, 2511.124]));