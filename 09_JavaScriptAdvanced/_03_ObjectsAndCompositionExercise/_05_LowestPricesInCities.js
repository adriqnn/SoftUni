function solve(arr){
    let obj = {};
    for (let i = 0; i < arr.length; i++) {
        let text = arr[i];
        let productInfo = text.split(' | ');
        let town = productInfo[0];
        let product = productInfo[1];
        let price = Number(productInfo[2]);
        if(!obj.hasOwnProperty(product)){
            obj[product] = {town,price};
        }else{
            if(price < obj[product].price){
                obj[product] = {town,price}
            }
        }
    }
    let productNames = Object.keys(obj);
    for (let i = 0; i < productNames.length; i++) {
        let productName = productNames[i];
        console.log(`${productName} -> ${obj[productName].price} (${obj[productName].town})`)
        
    }
}