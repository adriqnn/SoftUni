class CarDealershipV1{
    constructor(name){
        this.name = name;
        this.availableCars = [];
        this.soldCars = [];
        this.totalIncome = 0;
    }

    addCar(model,horsepower,price,mileage){
        horsepower = Number(horsepower);
        price = Number(price);
        mileage = Number(mileage);

        if(model === '' || horsepower < 0 || price < 0 || mileage < 0){
            throw new Error('Invalid input!');
        }

        const car = {
            model: model,
            horsepower: horsepower,
            price: price,
            mileage: mileage
        }

        this.availableCars.push(car);

        return `New car added: ${model} - ${horsepower} HP - ${mileage.toFixed(2)} km - ${price.toFixed(2)}$`;
    }

    sellCar(model, desiredMileage){
        desiredMileage = Number(desiredMileage);
        let car = this.availableCars.find(car => car.model === model);
        if(car === undefined){
            throw new Error(`${model} was not found!`);
        }

        if(car.mileage > desiredMileage){
            if(car.mileage - desiredMileage <= 40000){
                car.price = car.price * 0.95;
            }else{
                car.price = car.price * 0.9;
            }
        }

        const carIndex = this.availableCars.findIndex(car => car.model = model);
        this.availableCars.splice(carIndex,1);
        this.soldCars.push({
            model: car.model,
            horsepower: car.horsepower,
            soldPrice: car.price
        });

        this.totalIncome += car.price;

        return `${model} was sold for ${car.price.toFixed(2)}$`;
    }

    currentCar(){
        if(this.availableCars.length === 0){
            return `There are no available cars`;
        }

        const carsMapToString = this.availableCars.map(car => `---${car.model} - ${car.horsepower} HP - ${car.mileage.toFixed(2)} km - ${car.price.toFixed(2)}$`).join('\n');

        return[`-Available cars:`, carsMapToString].join('\n');
    }

    salesReport(criteria){
        if(criteria !== 'horsepower' && criteria !== 'model'){
            throw new Error('Invalid criteria!');
        }

        let sortSoldCars = [];
        if(criteria === 'horsepower'){
            sortSoldCars = this.soldCars.sort((a,b) => b.horsepower - a.horsepower);
        }

        if(criteria === 'model'){
            sortSoldCars = this.soldCars.sort((a,b) => a.model.localeCompare(b.model));
        }

        const firstLine = `-${this.name} has a total income of ${this.totalIncome.toFixed(2)}$`;
        const secondLine = `-${this.soldCars.length} cars sold:`;
        const thirdLine = sortSoldCars.map(car => `---${car.model} - ${car.horsepower} HP - ${car.soldPrice.toFixed(2)}$`).join('\n');

        return[
            firstLine,
            secondLine,
            thirdLine
        ].join('\n');
    }
}