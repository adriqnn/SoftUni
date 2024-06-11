class RefurbishedSmartphonesV1{
    constructor(retailer){
        this.retailer = retailer;
        this.availableSmartphones = [];
        this.soldSmartphones = [];
        this.revenue = 0;
    }

    addSmartphone(model, storage, price, condition){
        storage = Number(storage);
        price = Number(price);

        if(model === '' || storage < 0 || price < 0 || condition === ''){
            throw new Error('Invalid smartphone!');
        }

        const phone = {
            model: model,
            storage: storage,
            price: price,
            condition: condition
        };

        this.availableSmartphones.push(phone);
        return `New smartphone added: ${model} / ${storage} GB / ${condition} condition - ${price.toFixed(2)}$`;
    }

    sellSmartphone(model, desiredStorage){
        desiredStorage = Number(desiredStorage);
        let phone = this.availableSmartphones.find(phone => phone.model === model);
        if(phone === undefined){
            throw new Error(`${model} was not found!`);
        }

        if(phone.storage < desiredStorage){
            if(desiredStorage - phone.storage <= 128){
                phone.price = phone.price * 0.9;
            }else{
                phone.price = phone.price * 0.8;
            }
        }

        const phoneIndex = this.availableSmartphones.findIndex(phone => phone.model === model);
        this.availableSmartphones.splice(phoneIndex, 1);
        this.soldSmartphones.push({
            model: phone.model,
            storage: phone.storage,
            soldPrice: phone.price
        });

        this.revenue += phone.price;
        return `${model} was sold for ${phone.price.toFixed(2)}$`;
    }

    upgradePhones (){
        if(this.availableSmartphones.length === 0){
            throw new Error('There are no available smartphones!');
        }

        this.availableSmartphones = this.availableSmartphones.map(phone => {
            const newPhone = {
                model: phone.model,
                storage: Number(phone.storage) * 2,
                price: Number(phone.price),
                condition: phone.condition
            };

            return newPhone;
        });

        const phonesMapToString = this.availableSmartphones.map(phone => `${phone.model} / ${phone.storage} GB / ${phone.condition} condition / ${phone.price.toFixed(2)}$`).join('\n');

        return[`Upgraded Smartphones:`, phonesMapToString].join('\n');
    }

    salesJournal (criteria) {
        if(criteria !== 'storage' && criteria !== 'model'){
            throw new Error('Invalid criteria!');
        }

        let sortedPhones = [];
        if(criteria === 'storage'){
            sortedPhones = this.soldSmartphones.sort((a,b) => b.storage - a.storage);
        }

        if(criteria === 'model'){
            sortedPhones = this.soldSmartphones.sort((a,b) => a.model.localeCompare(b.model));
        }

        const firstLine = `${this.retailer} has a total income of ${this.revenue.toFixed(2)}$`;
        const secondLine = `${this.soldSmartphones.length} smartphones sold:`;
        const thirdLine = sortedPhones.map(phone => `${phone.model} / ${phone.storage} GB / ${phone.soldPrice.toFixed(2)}$`).join('\n');

        return[firstLine, secondLine, thirdLine].join('\n');
    }
}