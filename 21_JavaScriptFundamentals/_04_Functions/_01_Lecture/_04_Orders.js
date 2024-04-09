function ordersV1(item, quantity){
    let priceList = { coffee: 1.50, water: 1.00, coke: 1.40, snacks: 2.00};
    return (priceList[item] * quantity).toFixed(2);
}

const ordersV2 = function(item, quantity){
    let priceList = { coffee: 1.50, water: 1.00, coke: 1.40, snacks: 2.00};
    return (priceList[item] * quantity).toFixed(2);
}

const ordersV3 = (item, quantity) => {
    let priceList = { coffee: 1.50, water: 1.00, coke: 1.40, snacks: 2.00};
    return (priceList[item] * quantity).toFixed(2);
}