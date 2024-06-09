class VegetableStore{
    constructor(owner, location){
        this.owner = owner;
        this.location = location;
        this.availableProducts = [];
    }

    loadingVegetables(vegetables){
        let typeArr = new Set();

        for (let vegetable of vegetables){
            let [type, quantity, price] = vegetable.split(' ');
            quantity = Number(quantity);
            price = Number(price);

            let product = this.availableProducts.find(v => v.type === type);
            if(product === undefined){
                this.availableProducts.push({type, quantity, price});
                typeArr.add(type);
            }else{
                product.quantity += quantity;
                if(product.price < price){
                    product.price = price;
                }

                typeArr.add(type);
            }
        }

        return `Successfully added ${Array.from(typeArr).join(', ')}`;
    }

    buyingVegetables(selectedProducts){
        let totalPrice = 0.00;

        for (let p of selectedProducts){
            let [type, quantity] = p.split(' ');
            quantity = Number(quantity);
            let product = this.availableProducts.find((v) => v.type === type);

            if(product === undefined){
                throw new Error(`${type} is not available in the store, your current bill is $${totalPrice.toFixed(2)}.`);
            }

            if(product.quantity < quantity){
                throw new Error(`The quantity ${quantity} for the vegetable ${type} is not available in the store, your current bill is $${totalPrice.toFixed(2)}.`);
            }

            totalPrice += quantity*product.price;
            product.quantity -= quantity;
        }

        return `Great choice! You must pay the following amount $${totalPrice.toFixed(2)}.`;
    }

    rottingVegetable(type, quantity){
        quantity = Number(quantity);
        let product = this.availableProducts.find((v) => v.type === type);

        if(product === undefined){
            throw new Error(`${type} is not available in the store.`);
        }

        if(product.quantity <= quantity){
            product.quantity = 0;
            return `The entire quantity of the ${type} has been removed.`;
        }

        product.quantity -= quantity;

        return `Some quantity of the ${type} has been removed.`;
    }

    revision(){
        let string1 = 'Available vegetables:';
        let string2 = this.availableProducts.sort((a,b) => a.price - b.price).map(p => `${p.type}-${p.quantity}-$${p.price}`).join('\n');
        let string3 = `The owner of the store is ${this.owner}, and the location is ${this.location}.`;

        return [string1,string2,string3].join('\n');
    }

    revision2(){
        let ressArr = ['Available vegetables:'];
        this.availableProducts.sort((a,b) => a.price - b.price);
        this.availableProducts.forEach((p) => ressArr.push(`${p.type}-${p.quantity}-$${p.price}`));
        ressArr.push(`The owner of the store is ${this.owner}, and the location is ${this.location}.`);

        return ressArr.join('\n');
    }
}