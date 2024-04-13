function class_storageV1(capacity){
    class Storage{
        constructor(capacity) {
            this.capacity = capacity;
            this.storage = [];
            this.totalCost = 0;
        }

        addProduct(product){
            this.storage.push(product);
            this.capacity -= product.quantity;
            this.totalCost += product.price * product.quantity;
        }

        getProducts(){
            return this.storage.map(e => JSON.stringify(e)).join("\n");
        }
    }

    return new Storage(capacity);
}

const class_storageV2 = function(){
    class Storage{
        constructor(capacity) {
            this.capacity = capacity;
            this.storage = [];
            this.totalCost = 0;
        }

        addProduct(product){
            this.storage.push(product);
            this.capacity -= product.quantity;
            this.totalCost += product.price * product.quantity;
        }

        getProducts(){
            return this.storage.map(e => JSON.stringify(e)).join("\n");
        }
    }

    return new Storage(capacity);
}

const class_storageV3 = () => {
    class Storage{
        constructor(capacity) {
            this.capacity = capacity;
            this.storage = [];
            this.totalCost = 0;
        }

        addProduct(product){
            this.storage.push(product);
            this.capacity -= product.quantity;
            this.totalCost += product.price * product.quantity;
        }

        getProducts(){
            return this.storage.map(e => JSON.stringify(e)).join("\n");
        }
    }

    return new Storage(capacity);
}
