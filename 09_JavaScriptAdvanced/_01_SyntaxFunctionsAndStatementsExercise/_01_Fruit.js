function fruit(fruitName,weightInGrams,pricePerKilogram){
    let weight = weightInGrams/1000;
    let price = weight*pricePerKilogram;

    console.log(`I need $${price.toFixed(2)} to buy ${weight.toFixed(2)} kilograms ${fruitName}.`);
}