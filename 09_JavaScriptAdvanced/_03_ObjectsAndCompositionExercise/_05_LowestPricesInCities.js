function lowest_prices_in_citiesV1(arr){
    let list = {};

    arr.forEach(e => {
        let [town, product, price] = e.split(" | ");

        if(!list.hasOwnProperty(product)){
            list[product] = {town, price: Number(price)};
        }else{
            if(price < list[product].price){
                list[product] = {town, price: Number(price)};
            }
        }
    });

    return Object.entries(list).map(e => {
        let product = e[0];
        let price = e[1].price;
        let town = e[1].town;

        return `${product} -> ${price} (${town})`;
    }).join("\n");
}

function lowest_prices_in_citiesV2(arr){
    let obj = {};

    for (let i = 0; i < arr.length; i++) {
        let text = arr[i];
        let productInfo = text.split(' | ');

        let town = productInfo[0];
        let product = productInfo[1];
        let price = Number(productInfo[2]);

        if(!obj.hasOwnProperty(product)){
            obj[product] = {town, price};
        }else{
            if(price < obj[product].price){
                obj[product] = {town, price};
            }
        }
    }

    let result = "";
    let productNames = Object.keys(obj);

    for (let i = 0; i < productNames.length; i++) {
        let productName = productNames[i];
        result += `${productName} -> ${obj[productName].price} (${obj[productName].town})\n`;
    }

    return result;
}

function lowest_prices_in_citiesV3(arr){
    const data = arr.map(x => x.split(" | ")).reduce((a, v) => {
        const [town, product, price] = v.map(x => (isNaN(x) ? x : Number(x)));
        a[product] = a[product] || {price, town};

        if (a[product].price > price || a[product].town === town) {
            a[product] = {price, town};
        }

        return a
    }, {});

    return `${Object.entries(data).map(([name, product]) => `${name} -> ${product.price} (${product.town})`).join("\n")}`;
}
