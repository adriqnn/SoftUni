function fruitV1(fruitName, weightInGrams, pricePerKilogram){
    let weight = weightInGrams / 1000;
    let price = weight * pricePerKilogram;

    return `I need $${price.toFixed(2)} to buy ${weight.toFixed(2)} kilograms ${fruitName}.`;
}

function fruitV2(fruitName, weightInGrams, pricePerKilogram){
    let weight = weightInGrams / 1000;

    return `I need $${(weight * pricePerKilogram).toFixed(2)} to buy ${weight.toFixed(2)} kilograms ${fruitName}.`;
}
